package Threads.join插队线程;

import Threads.Yield出让线程.Mythreaddemo3;

public class ThreaDemo4 {
    public static void main(String[] args) throws InterruptedException {

        Mythreaddemo3 t = new Mythreaddemo3();
        t.setName("土豆泥");
        t.start();
        //我想让土豆泥先执行 然后在执行main
        //表示把土豆线程插入到main之前
        t.join();
        
        //执行在main线程当中
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
