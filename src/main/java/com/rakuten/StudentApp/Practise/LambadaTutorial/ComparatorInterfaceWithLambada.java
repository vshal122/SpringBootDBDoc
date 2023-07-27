package com.rakuten.StudentApp.Practise.LambadaTutorial;


import java.util.*;

class Subject{
    int subjectId;
    String subjectName;

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}


public class ComparatorInterfaceWithLambada {

    public static void main(String[] args) {
        List<Subject> subjectList = new ArrayList<>(Arrays.asList(
                new Subject(123,"Maths"),
                new Subject(124,"English"),
                new Subject(115,"Hindi"),
                new Subject(113,"Computer")));
//         Sorting based on subject Id
        Collections.sort(subjectList, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return (o1.getSubjectId())-(o2.getSubjectId());
            }
        });
        System.out.println("Sorting based on subject Id   :"+subjectList);

//     Sorting based on subject Name

        System.out.println("--------------------------------------------------------------------");
        Collections.sort(subjectList, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getSubjectName().compareTo(o2.getSubjectName());
            }
        });
        System.out.println("Sorting based on subject Name   :"+subjectList);

 //     Sorting using lambada Expression based on Name
        Collections.sort(subjectList,(o1,o2)->{
            return  o1.getSubjectName().compareTo(o2.getSubjectName());
        });
        System.out.println("Sorting using lambada Expression based on Name   :"+subjectList);


//     Sorting Using Lambada Expression based on Name (Type 2)
        subjectList.sort((o1, o2) -> o1.getSubjectId()-o2.getSubjectId());
        System.out.println("Sorting Using Lambada Expression based on Name (Type 2)    :"+subjectList);

//   Comprator<Subject> method using to sort

    Comparator<Subject> subjectComparator =(o1,o2)->o1.subjectId-o2.subjectId;
    subjectList.sort(subjectComparator.reversed());
    System.out.println("Comprator<Subject> method using to sort    :"+subjectList);


    }
}
