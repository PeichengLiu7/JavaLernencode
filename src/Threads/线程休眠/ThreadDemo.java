package Threads.线程休眠;

import java.util.TreeMap;

public class ThreadDemo {
    public static <Tread> void main(String[] args) throws InterruptedException {
        //创建对象
        MyThread t1 = new MyThread("plane");
        MyThread t2 = new MyThread("Panzer");
        //细节JVM 虚拟机启动后会启动多线程
        //其中有一条就叫做main线程，他的作用就是调用main方法
        //我们写的所有代码 其实都是运行在main线程当中
        // 细节哪些线程执行到这个方法，哪条线程就会在这里停留对应的时间
        //方法的参数，表达睡眠时间，单位浩渺
        //1s = 1000ms
        //时间到了后 会自动醒来 执行下面其他的代码
//
//        //开启
//
        t1.start();
        t2.start();
        //执行mian方法的那条对象
//        Tread t = (Tread) Thread.currentThread();
//        String name = t.getName;
//        System.out.println(name);
//        System.out.println("11111");
//        //停留5s
//        Thread.sleep(5000);
//        System.out.println("22222");

    }
}
