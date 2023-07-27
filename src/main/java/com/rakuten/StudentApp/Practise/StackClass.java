package com.rakuten.StudentApp.Practise;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.*;

public class StackClass {


    public static void main(String[] args) {
        List<String> cfas = Arrays.asList("CWO-123", "CWO-234", "CWO-345");
        JSONArray jsonArray = new JSONArray();

        int i = 0;
        for (String cfs : cfas) {
            JSONObject jsonObject = new JSONObject();
            int j=i;
            jsonObject.put("projectRefId", "projectRefIdValue");
           // String cfasNuber = "cfasNumber" + Integer.toString(j);
            jsonObject.put("cfasNumber", cfs);
            jsonArray.add(i,jsonObject);
            i++;
        }

        System.out.println(jsonArray.toString());
    }
}
