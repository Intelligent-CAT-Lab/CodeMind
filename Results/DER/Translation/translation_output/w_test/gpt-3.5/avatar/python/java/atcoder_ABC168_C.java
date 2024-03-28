```java
import java.util.Scanner;

public class ClockHands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double theta_h = 2.5 * Math.PI - (2 * Math.PI * ((h + (m / 60.0)) / 12));
        double theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60.0));
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);

        double distance = Math.sqrt(Math.pow((x_h - x_m), 2) + Math.pow((y_h - y_m), 2));
        System.out.println(distance);
    }
}
```
