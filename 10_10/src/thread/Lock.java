package thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 22044133 左立志
 * @data 2024/10/10 9:52
 */
public class Lock implements Runnable {
    private ReentrantLock Lo=new ReentrantLock();
    private int a=10;
    @Override
    public void run() {
        while (a>2)
        {
            Lo.lock();
                a--;
                System.out.println(Thread.currentThread().getName()+"剩余"+a+"张票");
            Lo.unlock();
        }
    }
}
