package com.rakuten.StudentApp.Practise;

class ExecutionPart implements Runnable{

    int total=0;

    @Override
    public void run () {
      synchronized(this) {
          for(int i = 0; i < 10; i++) {
                total += 100;
            }
        this.notify();
        }
    }


}

public class BookTicketInterThreadCommunication {


    public static void main(String[] args) throws InterruptedException {
        ExecutionPart executionPart = new ExecutionPart();
        Thread thread = new Thread(executionPart);
        thread.start();
       // System.out.println("Total amount "+executionPart.total);

        synchronized (thread){
            thread.wait();
            System.out.println("Total amount "+executionPart.total);
        }
    }
}
