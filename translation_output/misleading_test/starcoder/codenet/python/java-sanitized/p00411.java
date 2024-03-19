import java.util.*;
public class p00411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double ans = r * t / a;
        System.out.printf("%.6f", ans);
    }
}