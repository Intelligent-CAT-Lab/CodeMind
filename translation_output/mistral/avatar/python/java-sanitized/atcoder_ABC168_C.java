import java.util.Scanner;
public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, h, m;
        a = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        m = sc.nextDouble();
        double theta_h = 2.5 * Math.PI - (2 * Math.PI * (h + (m / 60)) / 12);
        double theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60));
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);
        double distance = Math.sqrt((x_h - x_m) * (x_h - x_m) + (y_h - y_m) * (y_h - y_m));
        System.out.println(distance);
    }
}