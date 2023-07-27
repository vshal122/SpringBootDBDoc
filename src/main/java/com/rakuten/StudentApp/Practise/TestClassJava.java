package com.rakuten.StudentApp.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClassJava extends Thread {
    int   total=0;


    public void run() {
            synchronized(this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;
            }
            this.notify();
        }
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) throws InterruptedException {

        TestClassJava te= new TestClassJava();
        te.start();
       // System.out.println("Total Earning :"+te.total);
        synchronized (te){
            te.wait();
            System.out.println("Total Earning :"+te.total);
        }
    }
}
