package thread;

/**
 * @author 22044133 左立志
 * @data 2024/10/10 8:46
 */
public class Sell implements Runnable {
    private static int a=10;
    private Object object=new Object();//同步代码块
    @Override
    public void run() {
        while (true){
            synchronized (object){
            if (a <= 0) {
                break;
            }
            else {
                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException e){
                }
                a--;
                System.out.println(Thread.currentThread().getName()+"剩余"+a+"张票");
            }
            }
//            boolean sy = Sy();
//            if(!sy){
//                break;
//            }
//            if(sy)
//            {
//                Sy();
//            }
        }
    }
//    public static synchronized boolean Sy(){//同步方法
//        if(a==0){
//            return false;
//        }
//        else {
////            try{
////                Thread.sleep(1000);
////            }
////            catch (InterruptedException e){
////                }
////            a--;
////            System.out.println(Thread.currentThread().getName()+"剩余"+a+"张票");
////            return true;
//        }
//    }
}

