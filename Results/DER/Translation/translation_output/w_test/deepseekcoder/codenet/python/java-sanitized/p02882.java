import java.util.Scanner;
import java.lang.Math;

public class p02882 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        double h = (double)x/(a*a);

        double ans;

        if (h >= b/2) {
            double V = (2*((a*a)*b - x))/(a*a*a);
            ans = Math.toDegrees(Math.atan(V));
        } else {
            double V = (a*(b*b))/(2*x);
            ans = Math.toDegrees(Math.atan(V));
        }

        System.out.printf("%.11f\n", ans);
    }
}