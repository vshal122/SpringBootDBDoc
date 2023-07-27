package com.rakuten.StudentApp.Practise;


import com.rakuten.StudentApp.Model.Student;
import io.swagger.models.auth.In;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Data
class StudentNew implements Comparable<StudentNew>{
  public String name;
  public Long rollNo;
  public String moNumber;

    public StudentNew(String name, Long rollNo, String moNumber) {
        this.name = name;
        this.rollNo = rollNo;
        this.moNumber = moNumber;
    }

    @Override
    public int compareTo(StudentNew o) {
        if(this.rollNo>o.rollNo)
        {
           return  1;
        }else if (this.rollNo<o.rollNo)
        {
           return  -1;
        }
        else
        return 0;
    }
}

public class SortingUsingCbAndCm  {


    public static void main(String[] args) {

        List<StudentNew> studentList = new ArrayList<StudentNew>();
        StudentNew s1 = new StudentNew("Rajesh",4567443l,"8878158481");
        StudentNew s2 = new StudentNew("Pajesh",4467l,"9878158481");
        StudentNew s3  = new StudentNew("Majesh",1567l,"6878158481");
        StudentNew s4 = new StudentNew("Dajesh",2567l,"7778158481");
        StudentNew s5  = new StudentNew("Gajesh",3567l,"4878158481");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);


        Collections.sort(studentList);
        studentList.forEach(s-> System.out.println(s));



    }

}
