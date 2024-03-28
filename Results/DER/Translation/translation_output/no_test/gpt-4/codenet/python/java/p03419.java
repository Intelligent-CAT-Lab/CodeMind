Here's the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n == 1 || m == 1) {
            System.out.println((n * m == 1) ? 1 : Math.max(n, m) - 2);
        } else {
            System.out.println((long) (n - 2) * (m - 2));
        }

        scanner.close();
    }
}
```

A few notes on the differences between the Python and Java versions:

1. Java is strongly-typed, so we declare the types of variables explicitly.

2. We import `Scanner` to handle input in Java, which is similar to `input().split()` in Python.

3. The `print()` function in Python is replaced by `System.out.println()`, and we need to wrap the print statement's condition into a ternary operator in Java.

4. Since the result could potentially overflow the `int` datatype for large values of `n` and `m`, I have cast the multiplication `(n - 2) * (m - 2)` to a `long` to ensure that we can handle large numbers.
