package com.rakuten.StudentApp.Practise.StreamApiLearning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class SupplierExample implements Supplier<String> {


    @Override
    public String get() {
        System.out.println("This is our old fashion Supplier");
        return "In_These";
    }
}
public class SupplierDemo {

    public static void main(String[] args) {
        SupplierExample  supplierExample = new SupplierExample();
        supplierExample.get();

        Supplier<String> stringSupplier = ()->"This is our lambada ";

        System.out.println("This our Java Supplier  :"+stringSupplier.get());


        List<String> stringList = Arrays.asList("A","B","c");
        System.out.println("-------------------     :"+stringList.stream().findAny().orElseGet(stringSupplier));


    }
}
