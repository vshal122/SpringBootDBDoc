package com.rakuten.StudentApp.Practise.StreamApiLearning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateImp implements Predicate<Integer>{

    @Override
    public boolean test(Integer integer) {
        if(integer==5)
        {
            return true;
        }else
            return  false;
    }
}

public class PredicateDemo {
    public static void main(String[] args) {
        int num=5;

        //Using Old Fashion
        PredicateImp predicateImp = new PredicateImp();
         Boolean f=predicateImp.test(num);
        System.out.println("test old Fashion :"+f);

        // using Lambada Expression
        Predicate<Integer> predicate = (t)-> t == num ?  true  :false;
        predicate.test(12);
        System.out.println("test  :"+predicate.test(15));

        List<Integer> list = Arrays.asList(12,34,5,6,7,7);

        // filter takes predicate
        list.stream().filter((t)-> t == num ?  true  :false).forEach(t-> System.out.println(" This our Predicate Result  :"+t));


    }

}
