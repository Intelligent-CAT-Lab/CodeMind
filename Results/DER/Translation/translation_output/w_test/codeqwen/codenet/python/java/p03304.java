Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        if (d > 0) {
            System.out.println(2 * (n - d) * (m - 1) / (double) n * n);
        } else {
            System.out.println((m - 1) / (double) n);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, and then checks if the third integer is greater than 0. If it is, it calculates and prints the result of the expression `2 * (n - d) * (m - 1) / n * n`. If it isn't, it calculates and prints the result of the expression `(m - 1) / n`. The `(double)` cast is used to ensure that the division operation returns a floating-point number, rather than an integer.
