package Threads.case1;

public class ThreadDemo {
    public static void main(String[] args) {
        //多线程第一种启动方式
        //定义一个类去继承Thread
        //重写里面的run方法
        //创建子类对象，并启动线程
        MyThread T1 = new MyThread();
        MyThread T2 = new MyThread();
        T1.setName("thread 1");
        T2.setName("thread 2");
        T1.start();
        T2.start();
        //开启线程
    }
}
