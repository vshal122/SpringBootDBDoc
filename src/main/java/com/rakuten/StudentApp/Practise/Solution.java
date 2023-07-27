package com.rakuten.StudentApp.Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Solution {

    class  ListNode
    {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next=null;
        }
        ListNode head;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1=0,num2=0,sum=0,size1=0,size2=0;
        ListNode l3=l1;
        ListNode l4=l2;
        while(l3!=null)
        {
            long value= l3.val;
            num1=num1*10+(value);
            l3=l3.next;
            size1++;

        }
        while(l4!=null)
        {
            long value= l4.val;
            num2=num2*10+(value);
            l4=l4.next;
            size2++;

        }
        long newNum1=0,newNum2=0;
        while(num1>0)
        {
            newNum1=newNum1*10+num1%10;
            num1=num1/10;

        }
        while(num2>0)
        {
            newNum2=newNum2*10+num2%10;
            num2=num2/10;
        }

        System.out.println(size1+"  N1 :"+  newNum1+"  N2 :"+ newNum2+" size :"+size2);
        sum= newNum1+ newNum2;
        System.out.println(sum);
        ListNode l5=l1;
        while(sum>0 && l5!=null )
        {

            int value=(int)sum%10;
            System.out.println("value :"+value);
            l5.val=value;
            sum=sum/10;
            if(sum>0 && l5.next==null)
            {
                int newValue1=(int)sum%10;
                ListNode temp = new ListNode(newValue1);
                l5.next=temp;

            }

            l5=l5.next;
            System.gc();
        }
        return l1;
    }

    public static void main(String[] args) {
        String str = null;
        Optional<String> value = Optional.ofNullable(str);
        if(value.isPresent())
        {
            System.out.println(value.get()+""+value.orElse("rajesh"));
        }else System.out.println("NUll Value is null");



    }
}
