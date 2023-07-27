package com.rakuten.StudentApp.Practise.LambadaTutorial;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    int roll;
    String name;
    String subject;

    public Student(int roll, String name, String subject) {
        this.roll = roll;
        this.name = name;
        this.subject = subject;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        if((this.roll)==(o.roll))
        {
            return 0;
        }
        else if((this.roll)<(o.roll)) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

public class ComparableWithLambada {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student(121,"Mohan","Maths");
        Student student1 = new Student(124,"rohan","Hindi");
        Student student2 = new Student(111,"sohan","English");
        Student student3 = new Student(129,"dinesh","Science");
        Student student4 = new Student(189,"Kunal","Computer");
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Collections.sort(students);



        System.out.println(students);
    }
}
