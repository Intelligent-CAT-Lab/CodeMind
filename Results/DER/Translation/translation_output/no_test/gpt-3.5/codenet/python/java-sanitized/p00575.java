import java.util.Scanner;
import java.lang.Math;

public class p00575 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double a = Math.ceil(C / A);

        double s = 7 * A + B;
        double t = (int) (C / s);

        double u = C - s * t;
        double v = Math.ceil(u / A);

        double result;
        if (v <= 7) {
            result = 7 * t + v;
        } else {
            result = 7 * t + 7;
        }

        if (a > result) {
            System.out.println((int) result);
        } else {
            System.out.println((int) a);
        }
    }
}