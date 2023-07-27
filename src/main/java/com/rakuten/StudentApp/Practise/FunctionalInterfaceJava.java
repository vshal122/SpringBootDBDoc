package com.rakuten.StudentApp.Practise;

import javax.swing.text.html.Option;
import java.util.Optional;

interface sayable{
    void say(String msg);

    default void m1()
    {
        System.out.println("this is Deafult Method In Java ");
    }

}
public class FunctionalInterfaceJava implements sayable {



    @Override
    public void say(String msg) {
        System.out.println("Mohan is good :"+msg);
    }

    public static void main(String[] args) {


    }


}

