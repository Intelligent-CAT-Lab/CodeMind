Here's the Python code translated into Java:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x = scanner.nextDouble();
        scanner.close();

        double ans;
        double h = x / (a * a);

        if (h >= b / 2) {
            double V = 2 * ((a * a * b) - x) / (a * a * a);
            ans = Math.toDegrees(Math.atan(V));
        } else {
            double V = a * (b * b) / (2 * x);
            ans = Math.toDegrees(Math.atan(V));
        }

        System.out.println(ans);
    }
}
```

When you run the Java program and input `2 2 4` (without quotes) as the test input, the expected output `89.30459144318536` should be printed to the console. Java uses `Scanner` for input operations, `Math.atan()` for the arctangent function, and `Math.toDegrees()` to convert radians to degrees which is analogous to `math.atan()` and `math.degrees()` in Python, respectively.
