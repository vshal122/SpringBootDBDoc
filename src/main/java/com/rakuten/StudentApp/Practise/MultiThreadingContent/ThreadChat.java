package com.rakuten.StudentApp.Practise.MultiThreadingContent;



class Chat{
    boolean flag = false;
    public synchronized void Question(String msg)
    {
        if(flag)
        {
            try {
                 wait();
            }catch (Exception e){}

        }
        System.out.println(msg);
        flag=true;
        notify();

    }
    public synchronized  void Answer(String ans)
    {
     if (!flag)
     {
         try {
             wait();

         }catch (Exception e){}
     }
        System.out.println("Answer :"+ans);
       flag=true;
    }


}
public class ThreadChat {
    public static void main(String[] args) {
        Chat c = new Chat();

        new Thread(){

            public void run() {
               c.Question("My name is ");
            }
        }.start();

     new Thread(){

        public void run() {
            c.Answer("I am Vishal ");
        }
    }.start();
        new Thread(){

            public void run() {
                c.Question("My friend  name is ");
            }
        }.start();
}

}
