import java.util.Scanner;

public class p00411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double t = scanner.nextDouble();
        double r = scanner.nextDouble();
        double ans = r * t / a;
        System.out.println(String.format("%.6f", ans));
    }
}