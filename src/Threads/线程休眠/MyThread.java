package Threads.线程休眠;

public class MyThread extends Thread{

    //给线程设置名字 可以1用set方法设置，也可以用构造的方法设置
    public MyThread(String name) {
        super(name);
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + "@" + i );
        }

    }
}
