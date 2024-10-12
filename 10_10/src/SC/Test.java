package SC;

/**
 * @author 22044133 左立志
 * @data 2024/10/10 12:14
 */

public class Test {
    public static void main(String[] args) {
        BufferResources bufferResources = new BufferResources();
        //十个生产者线程
        for (int i = 0; i < 10; i++) {
            new Producter(bufferResources).start();
        }
        //十个消费者线程
        for (int i = 0; i < 10; i++) {
            new Consumer(bufferResources).start();
        }

    }
}

