package com.rakuten.StudentApp.Service;

import com.rakuten.StudentApp.Model.TableInfo;

import java.util.List;


public interface ITableInfoService {

    public List<TableInfo> gettingTableInfo(String tableName);

    public List<String> getAllTable();

}


