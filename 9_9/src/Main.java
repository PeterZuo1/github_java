import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double r = sc.nextDouble();
            double tj = Math.PI * r * r * r * 4 / 3;
            System.out.printf("%.3f\n", tj);
        }
    }
}