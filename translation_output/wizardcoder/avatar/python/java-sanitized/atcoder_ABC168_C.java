import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, h, m, theta_h, theta_m, x_h, y_h, x_m, y_m;
        a = input.nextDouble();
        b = input.nextDouble();
        h = input.nextDouble();
        m = input.nextDouble();
        theta_h = 2.5 * Math.PI - (2 * Math.PI * ((h + (m / 60)) / 12));
        theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60));
        x_h = a * Math.cos(theta_h);
        y_h = a * Math.sin(theta_h);
        x_m = b * Math.cos(theta_m);
        y_m = b * Math.sin(theta_m);
        System.out.println(Math.sqrt((x_h - x_m) * (x_h - x_m) + (y_h - y_m) * (y_h - y_m)));
    }
}