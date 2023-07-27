package com.rakuten.StudentApp.Practise.StreamApiLearning;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortListStreamDemo {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,44,5,56,66,67,4);

        integerList.stream().sorted(Collections.reverseOrder()).forEach(s-> System.out.println(" Values :"+s));




    }



}
