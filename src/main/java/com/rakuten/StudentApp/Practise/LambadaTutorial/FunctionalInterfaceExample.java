package com.rakuten.StudentApp.Practise.LambadaTutorial;

@FunctionalInterface // ye annotation optional hai ..iccha hot use karo nhi koi bt nhi
public interface FunctionalInterfaceExample {
    void m1();  // only one abtract method

    default   void m2()
    {
        System.out.println(" Default Method in Functional Interface"); // default method
    }
    static void m3()
    {
        System.out.println(" This is Static Method in Functional Interface"); // static methods
    }
}
