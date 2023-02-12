package Threads.case2;

import sun.net.idn.Punycode;

public class MyRun implements Runnable{


    @Override
    public void run() {
        //书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            Thread t = Thread.currentThread();
            System.out.println(Thread.currentThread().getName() + "HI");

        }
    }
}
