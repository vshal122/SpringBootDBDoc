package com.rakuten.StudentApp.Practise.TwoInterface;



interface A
{
    public String show();
    default void m1(){
        System.out.println("m1 Methods of A");
    }

}
interface B
{
  public String show();
    default void m1(){
        System.out.println("m1 Methods of B");
    }


}
class C  implements A,B {

    @Override
    public String show() {
        System.out.println("This is java Concept");
        return "strings";
    }

    @Override
    public void m1() {
        A.super.m1();
    }
}
public class DiamondProblem {

    public static void main(String[] args) {

    A c = new C();
    c.show();
    c.m1();

    }
}
