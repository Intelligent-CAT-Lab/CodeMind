import java.util.Scanner;
import java.lang.Math;

public class p03781 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double k = 0;
        double t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            double x1 = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) x1 + 1);
        }
    }
}