package com.rakuten.StudentApp.Practise;

import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

 class JavaClass {

     public void printCount() {
         try {
             for(int i = 5; i > 0; i--) {
                 System.out.println("Counter   ---   "  + i );
             }
         } catch (Exception e) {
             System.out.println("Thread  interrupted.");
         }
     }
}

class ThreadDemo extends Thread  {
    private Thread t;
    private String threadName;
    JavaClass  PD;

    ThreadDemo( String name,  JavaClass  pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
        PD.printCount();
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

public class PractiseSession implements  Runnable{
    public static void main(String[] args) throws InterruptedException {
           PractiseSession s = new PractiseSession();

    }
    public PractiseSession() throws InterruptedException {
        Thread t  = new Thread(this,"A");
        Thread t1  = new Thread(this,"B");
        t.start();
        t.join();
        t1.start();
    }
    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            }
        }catch (InterruptedException ex) {

        }
    }
}


