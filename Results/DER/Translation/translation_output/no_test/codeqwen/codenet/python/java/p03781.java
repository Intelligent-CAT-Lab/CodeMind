Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        int t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            x = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) x + 1);
        }
    }
}
```

Please note that in Java, we use `Math.sqrt()` to calculate the square root of a number, `Math.floor()` to round down to the nearest whole number, and `/` for division. Also, Java uses `int` for integer values and `double` for floating point numbers. The `(int)` cast is used to convert a `double` to an `int`.
