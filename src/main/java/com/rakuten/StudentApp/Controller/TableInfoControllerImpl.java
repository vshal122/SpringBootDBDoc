package com.rakuten.StudentApp.Controller;

import com.itextpdf.text.DocumentException;
import com.rakuten.StudentApp.Helper.GeneratePdfReport;
import com.rakuten.StudentApp.Model.TableInfo;
import com.rakuten.StudentApp.Service.ITableInfoService;
import com.rakuten.StudentApp.Service.PdfGeneratorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class TableInfoControllerImpl implements ITableInfoController{

    @Autowired
    private ITableInfoService iTableInfoService;

    @Override
    public List<String> getAllTableName() {

        return iTableInfoService.getAllTable();
    }


    @Override
    public ResponseEntity<InputStreamResource> tableInfoReport() throws IOException {

        List<TableInfo> tableInfo=new ArrayList<TableInfo>();
        List<List<TableInfo>> allDbTable = new ArrayList<>();

        List<String> listofTableName = iTableInfoService.getAllTable();
        for (int i = 0; i < 4; i++) {
            tableInfo = iTableInfoService.gettingTableInfo(listofTableName.get(i));
            allDbTable.add(tableInfo);
        }
        ByteArrayInputStream bis =  GeneratePdfReport.tableDescReport(allDbTable,listofTableName);
        byte [] allBytes = bis.readAllBytes();
        byte [] newBytes = Base64.getEncoder().encode(allBytes);
        ByteArrayInputStream bis1 = new ByteArrayInputStream(newBytes);

       //FileOutputStream fos =iTableInfoService.converPdfToDoc(bis);
        var headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=TableReport.doc");
         System.out.println(bis);
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(new InputStreamResource(bis1));
    }

}
