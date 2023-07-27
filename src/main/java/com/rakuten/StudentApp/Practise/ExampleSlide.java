package com.rakuten.StudentApp.Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ExampleSlide {
    public static void main(String[] args) {


       // int [] arr = {1,3,-4,3,-5,6,20,-5,-6,3};
        int [] arr = {1,-3,-4,3,-5,6,20,-3,-6,3};
        int k=3,sum;
        List<Integer> ans= new ArrayList<>();
        for (int i=0; i<arr.length-k+1; i++) {

            for (int j=i;j<i+k;j++) {
                if(arr[j]<0)
                {
                 ans.add(arr[j]);
                }
            }

        }
        System.out.println(ans);

    }
}
