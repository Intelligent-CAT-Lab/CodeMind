Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static final int DVSR = 1000000007;
    static final int INTMAX = 9223372036854775807;
    static final int INTMIN = -9223372036854775808;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();

        for (int i = Math.max(X - K + 1, -1000000); i <= Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the range of numbers to print, and prints them. The `Math.max` and `Math.min` functions are used to ensure that the range does not exceed the valid integer range. The `System.out.print` and `System.out.println` functions are used to print the numbers and a newline character, respectively.
