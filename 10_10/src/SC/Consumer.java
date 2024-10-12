package SC;

/**
 * @author 22044133 左立志
 * @data 2024/10/10 12:14
 */

public class Consumer extends Thread {
    private BufferResources bufferResources;

    //构造时需要指定缓冲区
    public Consumer(BufferResources bufferResources) {
        this.bufferResources = bufferResources;
    }

    @Override
    public void run() {
        this.bufferResources.consume();
    }
}

