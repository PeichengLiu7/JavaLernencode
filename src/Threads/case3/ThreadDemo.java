package Threads.case3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个类MyCallable 实现Callable接口
        //重写call
        //创建MyCallable的对象（表示多线程要执行的任务）
        //创建Future ->他是一个接口，所以我们不能直接创建他的对象，要创建他实现类FutureTask的对象
        // 如上（作用管理多线程运行的结果）
        //创建Thread类的对象（表示线程） 并且启动

        //1.创建对象 表示多线程要执行的任务
        MyCallable mc = new MyCallable();
        // 创建FutureTask 的对象：作用管理多线程运行的结果
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建线程的对象
        Thread t1 = new Thread(ft);
        //启动线程
        t1.start();
        //获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
