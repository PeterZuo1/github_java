package F;

/**
 * @author 22044133 左立志
 * @data 2024/10/10 14:12
 */
class Consumer extends Thread {
    private CubbyHole cubbyhole;
    private int number;
    public Consumer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get();
            System.out.println("消费者 #" + this.number+ " got: " + value);
        }
    }
}
