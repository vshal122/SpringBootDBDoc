package com.rakuten.StudentApp.Practise;

import com.rakuten.StudentApp.Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PracticeCmAndCm implements Comparable<Student> {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();
        Student s1 = new Student("Rajesh",4567443,"8878158481");
        Student s2 = new Student("Pajesh",4467,"9878158481");
        Student s3  = new Student("Majesh",1567,"6878158481");
        Student s4 = new Student("Dajesh",2567,"7778158481");
        Student s5  = new Student("Gajesh",3567,"4878158481");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        //Collections.sort(studentList);
        System.out.println(studentList);

    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
//    @Override
//    public int compare(Student o1, Student o2) {
//       if( o1.getRollNo() > o2.getRollNo())
//        {
//           return 1;
//        }
//       else if(o1.getRollNo() < o2.getRollNo())
//        {
//            return -1;
//        }else
//            return 0;
//
//    }

//    @Override
//    public int compareTo(Student o) {
//        if( > o.getRollNo())
//        {
//            return 1;
//        }
//        else if(o1.getRollNo() < o.getRollNo())
//        {
//            return -1;
//        }else
//            return 0;
//    }
}
