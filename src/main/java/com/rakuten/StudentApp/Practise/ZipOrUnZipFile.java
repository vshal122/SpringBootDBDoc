package com.rakuten.StudentApp.Practise;

import javax.swing.*;
import java.io.*;
import java.math.BigInteger;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOrUnZipFile {


    public static void main(String[] args) throws IOException {

 //      String source = "C:\\Users\\vishal.b.malviya\\Desktop\\CB_VB_BAckup\\ZipFolder";
//
 //      List<String> sources= Arrays.asList("C:\\Users\\vishal.b.malviya\\Desktop\\CB_VB_BAckup\\ZipFolder\\text121.txt", "C:\\Users\\vishal.b.malviya\\Desktop\\CB_VB_BAckup\\ZipFolder\\text122.txt", "C:\\Users\\vishal.b.malviya\\Desktop\\CB_VB_BAckup\\ZipFolder\\text123.txt", "C:\\Users\\vishal.b.malviya\\Desktop\\CB_VB_BAckup\\ZipFolder\\text124.txt", "C:\\Users\\vishal.b.malviya\\Desktop\\CB_VB_BAckup\\ZipFolder\\text125.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vishal.b.malviya\\Desktop\\CB_VB_BAckup\\ZipFolder\\Result_New_COMPRESSED.zip");
//        ZipOutputStream zipOut = new ZipOutputStream(fileOutputStream);
//        for(String src_path : sources) {
//            File file = new File(src_path);
//            file.isDirectory();
//            FileInputStream fis = new FileInputStream(file);
//            ZipEntry zipEntry = new ZipEntry(file.getName());
//            zipOut.putNextEntry(zipEntry);
//            byte[] bytes = new byte[1024];
//            int length;
//            while ((length = fis.read(bytes)) >= 0) {
//                zipOut.write(bytes, 0, length);
//            }
//            fis.close();
//        }
//        zipOut.close();
//        fileOutputStream.close();


//            File file = new File(source);
////            URI uri = file.toURI();
////            System.out.println(file);
////            System.out.println(uri);
////          FileFilter filter = new FileFilter() {
////
////            public boolean accept(File f)
////            {
////                return f.getName().endsWith("txt");
////            }
////        };
////
////            // boolean f= file.isDirectory() ? true :false;
////            for(File f2 : file.listFiles(filter)) {
////                String name = uri.relativize(f2.toURI()).getPath();
////                System.out.println("Name  : " + name);
////
////
////        }





    }
}
