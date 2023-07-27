package com.rakuten.StudentApp.Practise;

import io.swagger.models.auth.In;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface MyInterFace{
    public int m1(int l,int l2);
}
public class Classs11July {

    public static void main(String[] args) {
//        Predicate<Integer> p = (i) -> (i > -10) && (i < 10);
//        System.out.println(p.test(9));
//        Function<String,Integer> f = s -> s.length();
//        System.out.println(f.apply("I am happy now"));
//        Consumer<String> integerConsumer= s-> System.out.println(s);
//        integerConsumer.accept("That s very good");
//
//        Supplier<String> integerSupplier = () -> {
//            String otp = "";
//            for (int i = 1; i <= 4; i++) {
//                otp = otp + (int) (Math.random() * 10);
//            }
//            return otp;
//        };
//        System.out.println(integerSupplier.get());


        MyInterFace myInterFace=(p,p1)->(p+p1+90);
       System.out.println(myInterFace.m1(89,89));


//        List<Product> list=new ArrayList<Product>();
//
//
//        list.add(new Product(1,"HP Laptop",25000f));
//        list.add(new Product(3,"Keyboard",300f));
//        list.add(new Product(2,"Dell Mouse",150f));
//        Collections.sort(list,(p1,p2)->{
//            return p1.name.compareTo(p2.name);
//        });
//        for (Product p :list)
//        {
//            System.out.println(p.price+" "+p.id+" "+p.name);
//        }

    }
}
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
