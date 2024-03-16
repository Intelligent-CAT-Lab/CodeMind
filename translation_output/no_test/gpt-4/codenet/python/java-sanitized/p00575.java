import java.util.Scanner;
import java.lang.Math;

public class p00575 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        int a = (int) Math.ceil(C / A);

        double s = 7 * A + B;
        double t = Math.floor(C / s);
        
        double u = C - s * t;
        
        int v = (int) Math.ceil(u / A);

        int b;
        if (v <= 7) {
            b = (int)(7 * t + v);
        } else {
            b = (int)(7 * t + 7);
        }
        
        int result = (a > b) ? b : a;
        System.out.println(result);
        scanner.close();
    }
}