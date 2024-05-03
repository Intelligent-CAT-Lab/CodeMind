Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[] dp = new double[n + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }
        System.out.printf("%.10f", dp[n]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, creates an array `dp` of size `n + 1` and initializes the first element to 1. Then it iterates over the array from 0 to `n - 1`, and for each index `i`, it iterates over the range from 1 to `m` and adds `dp[i] / (n - i)` to `dp[i + j]`. Finally, it prints the value of `dp[n]` with 10 decimal places.
