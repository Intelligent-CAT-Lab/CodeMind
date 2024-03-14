import java.util.*;
public class p00575 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double a = Math.ceil(C / A);
        double s = 7 * A + B;
        double t = C / s;
        double u = C - s * t;
        double v = Math.ceil(u / A);
        if (v <= 7) {
            double b = 7 * t + v;
            if (a > b) {
                System.out.println(Math.toIntExact(b));
            } else {
                System.out.println(Math.toIntExact(a));
            }
        } else {
            double b = 7 * t + 7;
            if (a > b) {
                System.out.println(Math.toIntExact(b));
            } else {
                System.out.println(Math.toIntExact(a));
            }
        }
    }
}