import java.util.Scanner;

public class p00411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}