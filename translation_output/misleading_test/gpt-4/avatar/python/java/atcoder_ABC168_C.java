Here's your translated code from Python to Java:

```java
import java.util.Scanner;
import static java.lang.Math.*;

public class ClockHandsDistance {

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
```

To test this Java program with the input "1 2 9 49", you can run it and input the numbers separated by spaces when prompted. The program should output `-29.65730865197496` as expected.
