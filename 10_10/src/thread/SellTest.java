package thread;

import java.util.TreeMap;

/**
 * @author 22044133 左立志
 * @data 2024/10/10 8:58
 */
public class SellTest {
    public static void main(String[] args){
        Sell sell = new Sell();
        Thread t1 = new Thread(sell,"窗口1");
        Thread t2 = new Thread(sell,"窗口2");
        Thread t3 = new Thread(sell,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
