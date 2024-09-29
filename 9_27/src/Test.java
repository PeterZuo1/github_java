import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author 22044133 左立志
 * @data 2024/9/27 9:23
 */
public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream ff = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\AA\\123\\1.txt"));
        byte[] bytes="abc".getBytes();
        ff.write(bytes);
        ff.write(111111111);
    }
}

