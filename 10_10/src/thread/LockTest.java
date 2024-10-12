package thread;

/**
 * @author 22044133 左立志
 * @data 2024/10/10 10:04
 */
public class LockTest {
    public static void main(String[] args) {
        Lock lock1 = new Lock();
        Thread t1 = new Thread(lock1, "窗口一");
        Thread t2 = new Thread(lock1, "窗口二");
        Thread t3 = new Thread(lock1, "窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
