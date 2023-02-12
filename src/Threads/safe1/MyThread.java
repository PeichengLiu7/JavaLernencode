package Threads.safe1;

import java.util.Objects;

public class MyThread extends Thread{
//    int ticket = 0;
    static int ticket = 0;
    //表示这个类所有的对象，都共享ticket数据
    //问题 相同的票出现了很多次
    //出现了超出范围的票
    //锁对象一定要是唯一的 通过static
    //注意Object 与 Objects 的区分
     static Object obj = new Object();

    public void run(){
        while (true){
            //同步代码块 锁定起来让 代码必须轮流执行
            //注意synchronized位置 要写在循环的里面 否则变成单线程执行
        synchronized (obj){
            if (ticket < 100){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //线程执行的随机性
                ticket ++;
                System.out.println(getName() + "正在卖第" + ticket + "张票！！！");
            }else{
                break;
            }
        }
        }
    }
}
