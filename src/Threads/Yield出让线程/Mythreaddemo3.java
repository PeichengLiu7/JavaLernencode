package Threads.Yield出让线程;

public class Mythreaddemo3 extends Thread {

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+ "@" + i);
            //出让当前CPU的执行权
            //只是尽可能的均匀
            Thread.yield();
        }
    }
}
