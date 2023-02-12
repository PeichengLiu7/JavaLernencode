package Threads.safe1;
import java.util.Objects;
public class ThreadDemo {
    public static void main(String[] args) {
        //100张票 共有3个窗口 请设计一个程序模拟该电影院卖票
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        //起名字

        t1.setName("Windows 1");
        t2.setName("Windows 2");
        t3.setName("Windows 3");

        //开启线程
        t1.start();
        t2.start();
        t3.start();


    }
}
