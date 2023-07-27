package com.rakuten.StudentApp.Practise.MultiThreadingContent;

class Work extends Thread{
    int count=10;
    static int flex=0;
    public Work(int count) {
        this.count=count;
    }


    public void run() {
        m1();
    }

    public void m1()
    {
       int total=0;
       for(int i=0;i<10;i++)
        {
           total+=this.count;

        }
        flex+=total;
        System.out.println("total Amount :"+total+"  Static Variable  :"+flex);
    }

}

public class ThreadExampleSelf {

    public static void main(String[] args) {
        Work work = new Work(10);
        Work work1 = new Work(11);
        Work work2 = new Work(12);
        Work work3 = new Work(14);
        work.start();
        work1.start();
        work2.start();
        work3.start();

    }
}
