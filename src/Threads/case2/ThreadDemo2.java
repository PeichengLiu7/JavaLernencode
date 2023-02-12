package Threads.case2;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //自己定义一个类实现的runnable接口
        //重写里面的run方法
        //创建自己的类的对象
        //创建一个thread类的对象，并开启线程

        //创建MyRUN 的对象 多线程要执行的任务，任务对象
        MyRun mr = new MyRun();

        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        //给线程设置名字
        t1.setName("thread 1");
        t2.setName("thread 2");


        //开启线程
        t1.start();
        t2.start();
    }
}
