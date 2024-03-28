import java.util.Scanner;

public class p02882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, x;
        a = sc.nextInt();
        b = sc.nextInt();
        x = sc.nextInt();
        double h = x / (double) a ** 2;
        if (h >= b / 2) {
            double V = 2 * ((a ** 2) * b - x) / (a ** 3);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        } else {
            double V = a * (b ** 2) / (2 * x);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
    }
}