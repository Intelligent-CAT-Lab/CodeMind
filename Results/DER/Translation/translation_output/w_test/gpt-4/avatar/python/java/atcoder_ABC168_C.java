Here's the equivalent Java code for the provided Python script. This script calculates the distance between the tips of the hour and minute hands of a clock, given the lengths of the hands and the time:

```java
import java.util.Scanner;
import static java.lang.Math.*;

public class ClockHandDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Length of hour hand
        int b = sc.nextInt(); // Length of minute hand
        int h = sc.nextInt(); // Hour
        int m = sc.nextInt(); // Minutes

        double theta_h = 2.5 * PI - (2 * PI * ((h + (m / 60.0)) / 12.0));
        double theta_m = 2.5 * PI - (2 * PI * (m / 60.0));
        double x_h = a * cos(theta_h);
        double y_h = a * sin(theta_h);
        double x_m = b * cos(theta_m);
        double y_m = b * sin(theta_m);
        double distance = sqrt(pow((x_h - x_m), 2) + pow((y_h - y_m), 2));

        System.out.printf("%.20f%n", distance);

        sc.close();
    }
}
```

Test the Java code with the input provided (`1 2 9 49`) to get the expected output `1.00007615097217214106`.
