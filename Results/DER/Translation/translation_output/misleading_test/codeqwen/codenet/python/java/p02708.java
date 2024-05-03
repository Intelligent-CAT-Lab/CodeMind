Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            ans += (((2 * n - i + 1) * i) / 2) - (i * (i - 1) / 2) + 1;
        }
        System.out.println(ans % (1000000007));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the result, and prints it. The `% (1000000007)` at the end is used to ensure the result is within the range of a 32-bit integer.
