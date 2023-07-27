package com.rakuten.StudentApp.Practise.StreamApiLearning;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionInterfaceExample {
    public static void main(String[] args) {
        Function<String,String> stringFunction  = (s1)-> {  return s1;  };

        //stringFunction.apply(null);
        System.out.println(" These is my File :"+ stringFunction.apply("Tarun"));

        System.out.println("---------------------- :"+stringFunction.andThen(stringFunction));
        Map<Integer,Integer> map = new HashMap<>();

    }

}
