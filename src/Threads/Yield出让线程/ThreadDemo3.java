package Threads.Yield出让线程;

import Threads.setPriority.MyRunnable;

public class ThreadDemo3 {
    public static void main(String[] args) {

        //创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t1 = new Thread(mr,"Flugzeug");
        Thread t2 = new Thread(mr,"Panzer");
        t1.start();
        t2.start();
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(Thread.currentThread().getPriority());
    }
}