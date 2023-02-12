package Threads.join插队线程;

public class MyThreadjoin extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@" + i);
        }
    }

}
