package com.rakuten.StudentApp.DAO;

import com.rakuten.StudentApp.Helper.SearchOperation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchCriteria {

    private String key;
    private  Object value;
    private SearchOperation operation;


    public SearchCriteria() {
    }

    public SearchCriteria(String key, Object value, SearchOperation searchOperation) {
        this.key = key;
        this.value= value;
        this.operation = searchOperation;
    }


}
