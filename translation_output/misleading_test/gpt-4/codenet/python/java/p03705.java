Below is the Java translation of the Python code you provided. It reads the three input values `n`, `a`, `b` from the standard input, and it computes and prints the output according to the specified conditions.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n >= 2) {
            if (b >= a) {
                System.out.println((n - 2L) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }
}
```

The Java code uses a `Scanner` object to read from the standard input, which is commonly used for simple console input in Java applications. The input values `n`, `a`, `b` are of type `int`, but when calculating the output, the code casts the calculation `(n - 2L) * (b - a) + 1` to `long` by using the `L` suffix with `2`, to handle scenarios where the result might not fit into an `int` (which can store values up to 2^31-1). Also, the `System.out.println` is used to print the result to the standard output, which is analogous to `print` in Python.

Please note that when running the Java program, you should provide the input in the same way as you do with the Python version - entering the three integers separated by spaces and pressing Enter.
