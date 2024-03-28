Here's the translated Java code that performs the same operation as the provided Python code:

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d %f%n", a / b, a % b, (double)a / b);
    }
}
```

This Java code uses a `Scanner` to take input, similar to Python's `raw_input().split()`. It then prints the integer division (`a / b`), the remainder (`a % b`), and the floating-point division (`(double)a /b`). The `printf` method is used for formatted output, comparable to Python's `%`-formatting. In Java, `\n` is used as the newline character instead of `%n` in the formatted string argument to `printf`. It's recommended to use `%n` to output a platform independent newline character in Java `printf` method.
