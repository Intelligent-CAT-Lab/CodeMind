import java.util.Scanner;
import java.lang.Math;

public class p02882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();

        double h = x / (a * a);
        double V;

        if (h >= b / 2) {
            V = 2 * ((a * a) * b - x) / (a * a * a);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        } else {
            V = a * (b * b) / (2 * x);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
    }
}