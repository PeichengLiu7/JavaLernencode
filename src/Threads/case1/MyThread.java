package Threads.case1;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "HI");
            //交替执行
        }
    }
}
