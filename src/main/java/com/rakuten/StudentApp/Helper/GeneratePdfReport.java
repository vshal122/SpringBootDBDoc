package com.rakuten.StudentApp.Helper;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.rakuten.StudentApp.Model.TableInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;


import java.io.ByteArrayInputStream;
@Slf4j
public class GeneratePdfReport {

    private static final Logger logger = LoggerFactory.getLogger(GeneratePdfReport.class);
    static ByteArrayOutputStream out = new ByteArrayOutputStream();
    static   ByteArrayInputStream byteArrayInputStream ;
    static Document document = new Document();
    public static ByteArrayInputStream tableDescReport(List<List<TableInfo>> AlldbTable) {


        log.info("INSIDE GENERATE PDF :{} ",AlldbTable);
         PdfPTable table = new PdfPTable(7);
        try {



            PdfWriter.getInstance(document, out);
            document.open();
            writeValuesInPdf(table,AlldbTable);

            document. close();


        } catch (DocumentException ex) {

            logger.error("Error occurred: {0}", ex);
        }

        return new ByteArrayInputStream(out.toByteArray());
    }

    public static void  writeValuesInPdf(PdfPTable table,List<List<TableInfo>> tableInfoList) throws DocumentException {
        for (List<TableInfo> tableInfo : tableInfoList) {
            Paragraph paragraph = new Paragraph();
            writeHeader(table);
            for (TableInfo tableInfo1:tableInfo)
            {
                writeTableData(tableInfo1,table);
            }
            document.add(table);
            document.add(paragraph);
        }

    }


    public static void writeHeader(PdfPTable table) throws DocumentException {
        table.setWidthPercentage(60);
        table.setWidths(new int[]{8, 8, 4,4,6,4,12});

        Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

        PdfPCell hcell;
        hcell = new PdfPCell(new Phrase("Field", headFont));
        hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(hcell);

        hcell = new PdfPCell(new Phrase("Type", headFont));
        hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(hcell);

        hcell = new PdfPCell(new Phrase("Null", headFont));
        hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(hcell);

        hcell = new PdfPCell(new Phrase("Key", headFont));
        hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(hcell);

        hcell = new PdfPCell(new Phrase("Default", headFont));
        hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(hcell);

        hcell = new PdfPCell(new Phrase("Extra", headFont));
        hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(hcell);

        hcell = new PdfPCell(new Phrase("Comments", headFont));
        hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(hcell);

    }

    public static void writeTableData(TableInfo tableInfo1,PdfPTable table) throws DocumentException {
        PdfPCell cell;

        cell = new PdfPCell(new Phrase(tableInfo1.getField()));
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase(tableInfo1.getType()));
        cell.setPaddingLeft(5);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase(tableInfo1.getNull()));
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setPaddingRight(5);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase(tableInfo1.getKey()));
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setPaddingRight(5);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase(tableInfo1.getDefault()));
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setPaddingRight(5);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase(tableInfo1.getExtra()));
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setPaddingRight(5);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase(tableInfo1.getComments()));
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setPaddingRight(5);
        table.addCell(cell);


    }



}
