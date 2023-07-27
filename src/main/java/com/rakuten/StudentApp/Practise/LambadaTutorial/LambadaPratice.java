package com.rakuten.StudentApp.Practise.LambadaTutorial;


//  ()->    lambada Expression
interface FIofCurrentClas
{
    void m1();

}

public class LambadaPratice  {


    public static void main(String[] args) {
     FIofCurrentClas fIofCurrentClas  = ()->{
         System.out.println("this method m1");
        };
     fIofCurrentClas.m1();
    }

}
