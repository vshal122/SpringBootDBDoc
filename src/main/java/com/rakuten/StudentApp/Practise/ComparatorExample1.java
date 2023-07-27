package com.rakuten.StudentApp.Practise;

import com.rakuten.StudentApp.Model.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ComparatorExample implements Comparable<ComparatorExample> {
    int age;
    String name;

    public ComparatorExample(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(ComparatorExample o) {


        System.out.println("check sencond Name "+o.getName());
        return this.name.compareTo(o.getName());

    }

}
 public    class ComparatorExample1
    {
        private static double s;
        private static Optional<ComparatorExample> comparatorExample;

        public static void main(String[] args) {


        List<ComparatorExample> comparatorExampleList = new ArrayList<>(Arrays.asList(
                                                        new ComparatorExample(23,"roshan"),
                                                        new ComparatorExample(24,"mohan"),
                                                        new ComparatorExample(2,"Bvinash"),
                                                        new ComparatorExample(22,"Arjun"),
                                                        new ComparatorExample(25,"mohan"),
                                                        new ComparatorExample(2343,"mohan"),
                                                        new ComparatorExample(24433,"mohan")
                                                     ));




           // comparatorExample = comparatorExampleList.stream().filter(s->s.getName().equals("Bvinash")).findFirst();
            //System.out.println(comparatorExample.map(s->s.getAge()).toString());
            //value1.forEach(s-> System.out.println(s));


            Student student1 = new Student(1l,23,"Shyam1",34,"8878158481","30-12-2023",null);
            Student student2 = new Student(1l,23,"Shyam2",34,"8878158481","30-12-2023",null);
            Student student3 = new Student(1l,23,"Shyam3",34,"8878158481","30-12-2023",null);
            Student student4 = new Student(1l,23,"Shyam4",34,"8878158481","30-12-2023",null);
            Student student5 = new Student(1l,23,"Shyam5",34,"8878158481","30-12-2023",null);
            List<Student> studentList = new ArrayList<>();
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            studentList.add(student5);

           Integer student= studentList.stream().filter(s->s.getName().equals("Shyam1")).findAny().get().getAge();
           System.out.println(student);



        }



}








































//        Collections.sort(comparatorExampleList);
//        List<String> failing = comparatorExampleList.stream()
//                .filter(s->(s.age>2))
//                .map(s ->(s.name))
//                .collect( Collectors.toList());
//
//        for (ComparatorExample c:comparatorExampleList
//             ) {
//            System.out.println(c.age+"  :"+c.getName());
//        }
//            System.out.println(failing);




//     void deleteVal(int value)
//     {
//         Node temp = head;
//         Node previous = null;
//
//         if(temp == null){
//             System.out.println("Can't delete Linked List empty");
//             return;
//         }
//
//         // Case when there is only 1 node in the list
//         if(temp.next==null)
//         {
//             head = null;
//             System.out.println("Deleted: " + value);
//             return;
//         }
//
//         // if the head node itself needs to be deleted
//         if(temp.data==value)
//         {
//             head = temp.next; //changing head to next in the list
//             System.out.println("Deleted: " + value);
//             return;
//         }
//
//         // traverse until we find the value to be deleted or LL ends
//         while (temp != null && temp.data != value)
//         {
//             // store previous link node as we need to change its next val
//             previous = temp;
//             temp = temp.next;
//         }
//
//         // if value is not present then
//         // temp will have traversed to last node NULL
//         if(temp==null)
//         {
//             System.out.println("Value not found");
//             return;
//         }
//
//         // for node to be deleted : temp lets call it nth node
//         // assign (n-1)th node's next to (n+1)th node
//         previous.next = temp.next;
//         System.out.println("Deleted: " + value);
//     }
// }