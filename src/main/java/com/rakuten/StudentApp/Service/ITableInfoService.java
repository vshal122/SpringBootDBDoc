package com.rakuten.StudentApp.Service;

import com.rakuten.StudentApp.Model.TableInfo;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public interface ITableInfoService {

    public List<TableInfo> gettingTableInfo(String tableName);

    public List<String> getAllTable();

    public void converPdfToDoc(ByteArrayInputStream byteData) throws IOException;

}


