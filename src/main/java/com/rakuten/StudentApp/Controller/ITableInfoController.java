package com.rakuten.StudentApp.Controller;

import com.itextpdf.text.DocumentException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@RequestMapping("/schema")
public interface ITableInfoController {

    @GetMapping("/getTableInfo")
    public List getAllTableName();

    @GetMapping(value = "/pdfreport",
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> tableInfoReport();


    @GetMapping("/pdf/generate")
    public void generatePDF(HttpServletResponse response) throws IOException, DocumentException;
}
