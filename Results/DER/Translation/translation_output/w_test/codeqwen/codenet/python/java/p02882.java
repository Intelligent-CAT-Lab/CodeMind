Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        double h = (double) x / a * a;

        double V;
        if (h >= b / 2) {
            V = 2 * ((a * a) * b - x) / (double) a * a * a;
        } else {
            V = a * (b * b) / (2 * x);
        }

        double ans = Math.toDegrees(Math.atan(V));
        System.out.printf("%.10f", ans);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the value of `h`, and then calculates the value of `V` based on the value of `h`. It then calculates the angle in degrees using `Math.toDegrees` and prints the result with 10 decimal places.
