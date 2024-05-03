Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k * (k - 1) * (int) Math.pow(n - 1, n - 2));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the result, and prints it. The `Math.pow` function is used to calculate the power of `(n-1)` to the `(n-2)`. The `(int)` cast is used to convert the result of `Math.pow` to an integer, as Java does not support floating-point arithmetic in integer expressions.
