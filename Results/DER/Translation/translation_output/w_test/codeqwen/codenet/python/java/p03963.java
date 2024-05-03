Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k * (k - 1) * Math.pow(k - 1, n - 2));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the result of the expression `k * (k - 1) * Math.pow(k - 1, n - 2)`, and prints the result. The `Math.pow` function is used to calculate the power of `(k - 1)` to the `(n - 2)`.
