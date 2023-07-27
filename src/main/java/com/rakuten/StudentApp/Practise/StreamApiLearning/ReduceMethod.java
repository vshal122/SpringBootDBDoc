package com.rakuten.StudentApp.Practise.StreamApiLearning;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReduceMethod {



    public static void main(String[] args) {


       // Optional<Integer> acc = (0,(f1, f2)-> f1+f2);
        List<Integer> arrayOfList = Arrays.asList(1,4,5,6,6,7,7,7,81,86,8,28,38,88,84);
       Integer num= arrayOfList.stream().reduce(0,(f1,f2)->f1+f2);
        System.out.println(num);

        List<Integer> numbers = Arrays.asList(8, -4, 16, 0, 1, -6, 3);
        // calculate sum of all the elements of the numbers array using the reduce method
           int sum = numbers.stream().mapToInt(s->s).sum();
        float sumOfElements = numbers.stream().reduce(0, (firstElement, secondElement) -> firstElement + secondElement);
        Optional<Integer> slove= numbers.stream().reduce(Integer::sum);
        System.out.println(sumOfElements+" "+sum);



        //List of String ..which is greater lenght of string
        List<String> stringList = Arrays.asList("shyam","malviya","mohan");
       String  ans= stringList.stream().reduce((s1,s2)->s1.length()>s2.length() ? s1 : s2).get();
        System.out.println(ans);

        // convert a string in number
        List<String> numberfromString = Arrays.asList("26","30","30","34");
       int ans1= numberfromString.stream().map(s->Integer.parseInt(s)).reduce(0,(s1,s2)->s1+s2);
        System.out.println(ans1);


    }

}