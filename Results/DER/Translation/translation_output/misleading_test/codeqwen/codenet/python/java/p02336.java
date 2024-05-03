Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (k > n) {
            System.out.println(0);
            return;
        }
        long ans = 1;
        for (int i = 1; i < k; i++) {
            ans *= n - i;
            ans /= i;
        }
        ans %= 1000000007;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the factorial of the difference between `n` and `k`, and then prints the result modulo 1000000007. The `long` data type is used to handle large numbers that can result from the factorial calculation.
