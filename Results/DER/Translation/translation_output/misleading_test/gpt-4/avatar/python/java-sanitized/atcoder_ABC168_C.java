import java.util.Scanner;
import static java.lang.Math.*;

public class atcoder_ABC168_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        double theta_h = 2.5 * PI - (2 * PI * ((h + (m / 60.0)) / 12));
        double theta_m = 2.5 * PI - (2 * PI * (m / 60.0));

        double x_h = a * cos(theta_h);
        double y_h = a * sin(theta_h);
        double x_m = b * cos(theta_m);
        double y_m = b * sin(theta_m);

        double distance = sqrt(pow(x_h - x_m, 2) + pow(y_h - y_m, 2));

        System.out.println(distance);
    }
}