import java.util.Scanner;

public class p02882 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        double h = (double) x / Math.pow(a, 2);

        if (h >= b / 2) {
            double V = 2 * ((Math.pow(a, 2) * b) - x) / Math.pow(a, 3);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        } else {
            double V = a * Math.pow(b, 2) / (2 * x);
            double ans = Math.toDegrees(Math.atan(V));
            System.out.println(ans);
        }
    }
}