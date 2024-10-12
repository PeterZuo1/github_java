package SC;

/**
 * @author 22044133 左立志
 * @data 2024/10/10 12:13
 */

import java.util.Random;

public class Producter extends Thread {
    private BufferResources bufferResources;
    Random random = new Random();

    //构造时需要指定缓冲区
    public Producter(BufferResources bufferResources) {
        this.bufferResources = bufferResources;
    }

    @Override
    public void run() {
        //生产
        this.bufferResources.product(random.nextInt());
    }
}


