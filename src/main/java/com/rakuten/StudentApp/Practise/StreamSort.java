package com.rakuten.StudentApp.Practise;

import lombok.Data;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;


class EmplyoeeNew
{
    int rollNo;
    String name;

    public EmplyoeeNew(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class StreamSort {
    public static void main(String[] args) throws ClassNotFoundException {



//        List<EmplyoeeNew> emplyoeeNewList = Arrays.asList(new EmplyoeeNew(12,"mohan"),
//                new EmplyoeeNew(23,"shyam"),new EmplyoeeNew(34,"Ravi"),
//                new EmplyoeeNew(30,"Kunal"));
//
//      List<String> stringList=  emplyoeeNewList.stream().filter(s->s.rollNo>15).map(EmplyoeeNew::getName).collect(Collectors.toList());
//        System.out.println(stringList);


        Class cls = Class.forName("EmplyoeeNew");
         Method[] m = cls.getDeclaredMethods();
         Arrays.stream(m).forEach(s-> System.out.println(s));
    }
}
