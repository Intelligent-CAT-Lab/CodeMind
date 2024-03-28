import java.util.Scanner;
import java.lang.Math;

public class p02882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double h = x / (double) (a * a);
        double ans;
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