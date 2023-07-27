package com.rakuten.StudentApp.Practise.StreamApiLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlateMap {

    public static void main(String[] args) {

        // Start Map() in java means transformation of stream
        List<String> words = Arrays.asList("Mohan","Shyam","dinesh","Rahul");

       List<Integer> wordsLength  = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Out Put :"+wordsLength);

       List<Integer> newOfJava = Stream.of("1","2","3","4").map(Integer::valueOf).collect(Collectors.toList());

        System.out.println("Out Put  :"+newOfJava);


        //flate map
        List<List<Integer> > number = new ArrayList<>();

        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));

        List<Integer> flatemapList = number.stream().flatMap(list->list.stream()).collect(Collectors.toList());

        System.out.println("Flate Map Result  :"+flatemapList);

        // flate Map 1
        List <String> words1 = Arrays.asList("JavaDevJournal", "Java");
        List <String> unique = words1.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Out put are For Progeramm :"+unique);

      List<String> str1 =  words1.stream().map(s->s.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        str1.forEach(s-> System.out.println(s.toString()));


    }
}
