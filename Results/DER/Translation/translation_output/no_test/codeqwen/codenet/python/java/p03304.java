Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (d > 0) {
            System.out.println(2 * (n - d) * (m - 1) / (double) n * n);
        } else {
            System.out.println((m - 1) / (double) n);
        }
    }
}
```

In Java, we use `Scanner` to read input from the user. The `nextInt()` method is used to read integer input. The `close()` method is used to close the `Scanner` object.

The `/` operator in Java performs integer division, so we need to cast one of the operands to `double` to get a floating-point result.
