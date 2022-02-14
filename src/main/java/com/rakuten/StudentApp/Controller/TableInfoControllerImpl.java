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

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class TableInfoControllerImpl implements ITableInfoController{

    @Autowired
    private ITableInfoService iTableInfoService;

    private final PdfGeneratorService pdfGeneratorService;

    public TableInfoControllerImpl(PdfGeneratorService pdfGeneratorService) {
        this.pdfGeneratorService = pdfGeneratorService;
    }

    @Override
    public List<String> getAllTableName() {

        return iTableInfoService.getAllTable();
    }


    @Override
    public ResponseEntity<InputStreamResource> tableInfoReport() {

        List<TableInfo> tableInfo=new ArrayList<TableInfo>();
        List<List<TableInfo>> allDbTable = new ArrayList<>();

        List<String> listofTableName = iTableInfoService.getAllTable();
        for (int i = 0; i < 2; i++) {
            tableInfo = iTableInfoService.gettingTableInfo(listofTableName.get(i));
            allDbTable.add(tableInfo);
        }
        ByteArrayInputStream bis =  GeneratePdfReport.tableDescReport(allDbTable);
        var headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=studentreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }


       @Override
    public void generatePDF(HttpServletResponse response) throws IOException, DocumentException {

        List<TableInfo> tableInfo=new ArrayList<TableInfo>();
        List<List<TableInfo>> AlldbTable = new ArrayList<>();
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        List<String> listofTableName = iTableInfoService.getAllTable();
        response.setHeader(headerKey, headerValue);

           for (int i = 0; i < 2; i++) {
            tableInfo  = iTableInfoService.gettingTableInfo(listofTableName.get(i));
            AlldbTable.add(tableInfo);
           }

           //GeneratePdfReport.tableDescReport(tableInfo);
        this.pdfGeneratorService.export(response);
    }









}
