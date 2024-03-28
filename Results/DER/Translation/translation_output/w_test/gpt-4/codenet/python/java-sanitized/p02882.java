import java.util.Scanner;
import java.lang.Math;

public class p02882 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        double ans;
        double h = (double)x / (a * a);

        if (h >= (double)b / 2) {
            double V = 2 * ((a * a * b) - x) / (double)(a * a * a);
            ans = Math.toDegrees(Math.atan(V));
        } else {
            double V = (double)(a * (b * b)) / (2 * x);
            ans = Math.toDegrees(Math.atan(V));
        }

        System.out.printf("%.10f\n", ans);

        scanner.close();
    }
}