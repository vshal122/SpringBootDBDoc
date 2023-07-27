package com.rakuten.StudentApp.Practise.StreamApiLearning;

import java.util.*;

public class SortMapStreamDemo {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(12,"rahul");
        map.put(1,"Kahul");
        map.put(14,"rajesh");

        List<Map.Entry<Integer,String>> maLists = new ArrayList<>(map.entrySet());
        Collections.sort(maLists, new Comparator<Map.Entry<Integer,String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        map.forEach((key,value)-> System.out.println(key+" v"+value));

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

}
