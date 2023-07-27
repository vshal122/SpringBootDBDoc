package com.rakuten.StudentApp.Practise.MultiThreadingContent;

public class ThreadClassJava{


    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
      Thread even_thread = new Thread(new ImplementCode(sharedResource,true),"EVEN_THREAD");
      Thread odd_thread = new Thread(new ImplementCode(sharedResource,false),"ODD_THREAD");

         even_thread.start();
         odd_thread.start();

    }
}
class  ImplementCode implements  Runnable{
        private SharedResource sharedResource;
        private Boolean isEven;

    public ImplementCode(SharedResource sharedResource, Boolean isEven) {
        this.sharedResource = sharedResource;
        this.isEven = isEven;
    }

    @Override
    public void run() {
         int number = isEven ? 2:1;





    }
}
class  SharedResource {
    private  volatile boolean isEven=true;

    synchronized void printNumber()
    {

    }
}

