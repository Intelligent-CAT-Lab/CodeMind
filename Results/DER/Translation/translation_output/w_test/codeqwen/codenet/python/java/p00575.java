Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double a = Math.ceil(C / A);

        double s = 7 * A + B;
        double t = C / s;
        //sã¯1é±éã«ããããã³ã¤ã³ã®ææ°
        double u = C - s * t;
        //uã¯ç«¯æ°
        double v = Math.ceil(u / A);

        if (v <= 7) {
            double b = 7 * t + v;

            if (a > b) {
                System.out.println((int) b);
            } else {
                System.out.println((int) a);
            }
        } else {
            double b = 7 * t + 7;

            if (a > b) {
                System.out.println((int) b);
            } else {
                System.out.println((int) a);
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three double values from the user, calculates the values of `a`, `s`, `t`, `u`, and `v`, and then prints the smaller of `a` and `b`.
