package com.sparta.ma;

public class AnonClass {

    // anomalous inner class
    private Runnable runnable = new Runnable() {
       @Override
       public void run() {
           System.out.println("Creating thread in anon class");
       }
   };

   private Runnable runnable1 = () -> System.out.println("Creating thread in lamda expression");


    public  void runThread(){
        Thread thread =  new Thread(runnable1);
        thread.start();
    }

}
