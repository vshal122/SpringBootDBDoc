package com.rakuten.StudentApp.Practise.StreamApiLearning;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// why stream API  --> 1) Functional Proramming 2) Code Reduce 3) Bulk Process
// filter--> Condtional Check
//ForEach--> For Iteration
public class StreamFirst {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Acfd","Bdd","C","D");

        for (String str:stringList) {
            System.out.println(" this our List"+str);
        }

        stringList.stream().forEach(t-> System.out.println(" this our List  :"+t));


        Map<Integer,String> map = new HashMap<>();
        map.put(12,"rahul");
        map.put(13,"Kahul");
        map.put(14,"rajesh");

        map.forEach((key,value)-> System.out.println(" key :"+key+"value :"+value));

        //filter Methods -->predicate
        stringList.stream().filter(s->s.startsWith("A")).forEach(t-> System.out.println(" Result of Filter  :"+t));

        //filter Method With Map

        map.entrySet().stream().filter(k->k.getKey()==12).forEach(t-> System.out.println("Map Filter  :"+t.getValue()));



    }

}
