package com.rakuten.StudentApp.Practise;


import org.apache.commons.codec.binary.StringUtils;

public class ExamplePractice extends Exception {

    String s;
    ExamplePractice(String s1)
    {
        s=s1;
    }

    @Override
    public String toString() {
        return "ExamplePractice{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        try {
            throw  new ExamplePractice("goood this");
        }catch (ExamplePractice r)
        {
            System.out.println("c b");
        }




    }
}
