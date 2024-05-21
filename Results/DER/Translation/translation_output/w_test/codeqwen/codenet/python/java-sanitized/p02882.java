import java.util.Scanner;

public class p02882 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        double h = (double) x / a * a;

        double V;
        if (h >= b / 2) {
            V = 2 * ((a * a) * b - x) / (double) a * a * a;
        } else {
            V = a * (b * b) / (2 * x);
        }

        double ans = Math.toDegrees(Math.atan(V));
        System.out.printf("%.10f", ans);
    }
}