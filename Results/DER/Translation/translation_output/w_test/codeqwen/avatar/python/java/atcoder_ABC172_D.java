Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; i++) {
            long x = n / i;
            ans += i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a long integer from the standard input, calculates the sum of all numbers from 1 to n, and prints the result.
