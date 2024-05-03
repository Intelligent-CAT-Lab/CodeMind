Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long mod = (long) Math.pow(10, 9) + 7;
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        long[] coef = new long[n];
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef[n / i - n / (i + 1)] = n / i - n / (i + 1);
        }
        for (int i = 0; i < n - coef.length; i++) {
            coef[coef.length - 1 + i] = 1;
        }
        int nn = coef.length;
        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        System.out.println(sum(dp[k]) % mod);
    }

    public static long sum(long[] arr) {
        long sum = 0;
        for (long num : arr) {
            sum += num;
        }
        return sum;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the coefficients, and then calculates the result. The `sum` method is used to calculate the sum of the elements in the `dp` array
