package Threads.setDaemon;

import Threads.线程休眠.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("GodGirl");
        t2.setName("Diaos");

        //把第二个线程设置为守护线程（备胎线程）
        //当其他的非守护线程执行完毕之后，守护线程会陆续解释
        //当女神线程结束了，那么备胎也没有存在的必要了 不是立即解释而是陆续结束
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
