package com.rakuten.StudentApp.Service;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import com.rakuten.StudentApp.Model.TableInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.sql.DataSource;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class TableInfoServiceImpl implements ITableInfoService{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    protected DataSource dataSource;

    @Override
    public List<TableInfo> gettingTableInfo(String tableName) {
        List<Object[]> tableInfo=null;
        List<TableInfo> tableInfoList = new ArrayList<>();
        String s1="SHOW FULL COLUMNS FROM ";
        String s2=tableName;
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNativeQuery(sb.toString());
        tableInfo = query.getResultList();
         for(Object [] o :tableInfo){
             TableInfo tableInfo1 = new TableInfo();
             tableInfo1.setField(String.valueOf(o[0]));
             tableInfo1.setType(String.valueOf(o[1]));
             tableInfo1.setNull(String.valueOf(o[3]));
             tableInfo1.setKey(String.valueOf(o[4]));
             tableInfo1.setDefault(String.valueOf(o[5]));
             tableInfo1.setExtra(String.valueOf(o[6]));
             tableInfo1.setComments(String.valueOf(o[8]));
             tableInfoList.add(tableInfo1);

         }

        return tableInfoList;
    }

    @Override
    public List<String> getAllTable() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNativeQuery("SHOW TABLES");
        List<String> listOfTables = query.getResultList();


        return listOfTables;

    }

    @Override
    public void converPdfToDoc(ByteArrayInputStream byteData) throws IOException {
        XWPFDocument doc = new XWPFDocument(byteData);
        int numberToPrint = 0;

      // you can edit paragraphs
        for (XWPFParagraph para : doc.getParagraphs()) {
            List<XWPFRun> runs = para.getRuns();

            numberToPrint++;

            for (XWPFRun run : runs) {

                // read text
                String text = run.getText(0);

                // edit text and update it
                run.setText(numberToPrint + " " + text, 0);
            }
        }

        FileOutputStream fos = new FileOutputStream(new File("updated.docx"));
      //  InputStreamResource ios = new InputStreamResource();
       // return fos;


    }






}
