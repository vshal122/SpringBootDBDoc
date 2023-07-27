package com.rakuten.StudentApp.Practise.StreamApiLearning;

import io.swagger.models.auth.In;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
class OldFashion implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println("Old fashion or Without using  :"+integer);
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {

       // implement Using old Fashion
        OldFashion oldFashion = new OldFashion();
        oldFashion.accept(23);

        // Using lambada Function
           Consumer<Integer> consumer = (t)-> System.out.println("this is my Integer :"+t);
           consumer.accept(12);
        // first part
        List<Integer> list= Arrays.asList(1,4,5,7,88,9,5,43,22,222);
        list.stream().forEach(consumer);
    }
}

