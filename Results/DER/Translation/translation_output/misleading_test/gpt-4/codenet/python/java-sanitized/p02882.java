import java.util.Scanner;
import java.lang.Math;

public class p02882 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x = scanner.nextDouble();
        scanner.close();

        double ans;
        double h = x / (a * a);

        if (h >= b / 2) {
            double V = 2 * ((a * a * b) - x) / (a * a * a);
            ans = Math.toDegrees(Math.atan(V));
        } else {
            double V = a * (b * b) / (2 * x);
            ans = Math.toDegrees(Math.atan(V));
        }

        System.out.println(ans);
    }
}