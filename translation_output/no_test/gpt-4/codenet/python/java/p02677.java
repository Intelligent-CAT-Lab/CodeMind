Here's the translated Java code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        double l = (H * 360 / 12.0) + (M * 30 / 60.0);
        double s = M * 360 / 60.0;
        double ang = Math.abs(l - s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2 * B * A * Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}
```

A few things to note:

1. In Java, we use `Scanner` to read input from the user.
2. Java requires the explicit declaration of data types.
3. Math functions are invoked by calling methods from the `java.lang.Math` class.
4. Division in Java automatically performs integer division when both operands are integers, so it's important to ensure at least one operand is a double to get a floating-point result.
5. `System.out.println()` is used to print the output, whereas in Python, you just use `print()`.
6. The process for calculating cosine and square root is the same, but using the `Math` class in Java.
7. `scanner.close();` is used to close the `Scanner` after it's no longer needed to prevent resource leaks.
