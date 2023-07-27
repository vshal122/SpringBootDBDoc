package com.rakuten.StudentApp.Practise;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rakuten.StudentApp.Model.Student;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;


import java.util.UUID;

public class HttpPostRequestJava {


    public static void main(String[] args) {




        String str ="{\n" +
                "\"name\": \"mohanLala\",\n" +
                "\"age\":45\n" +
                "}";
        JSONObject  jsonObject = new JSONObject(str);
//        String output,str2="ok";
//        if(jsonObject.isNull("str1")) output=null;
//        else
//         output =jsonObject.getString("str1");
//        if(output != null) {
//            str2 = output;
//        }
//        System.out.println("output"+str2);

        ObjectMapper mapper = new ObjectMapper();
        Student student = null;
        try {
            student  = mapper.readValue(jsonObject.toString(), Student.class);
        } catch (Exception ex) {
        }

        String num =student.getMoNumber();
        System.out.println(num);
    }
}
