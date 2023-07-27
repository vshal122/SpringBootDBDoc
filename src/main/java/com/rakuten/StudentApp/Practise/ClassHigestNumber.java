package com.rakuten.StudentApp.Practise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ClassHigestNumber {
    public static void main(String[] args) {


        int x=445858858;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                System.out.println(0);
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                System.out.println(0);
            rev = rev * 10 + pop;
            System.out.println(rev);
        }

    }
        }



