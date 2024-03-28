Here is the translated Java code from the provided Python script:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int sqrtN = (int) Math.sqrt(n);
        int[] coef = new int[sqrtN + n];

        int index = 0;
        for (int i = 1; i <= sqrtN; ++i) {
            coef[index++] = (n / i) - (n / (i + 1));
        }

        // Fill remaining part of the coefficient array with 1
        Arrays.fill(coef, index, coef.length, 1);

        int sum = Arrays.stream(coef).sum();
        // Fill the trailing part of the array with 1s as many times as required to make up for the difference between n and the sum of calculated coefficients.
        for (int i = index; i < coef.length - (n - sum); ++i) {
            coef[i] = 0;
        }

        // Now reverse the coefficient array to match the original Python logic
        for (int i = 0; i < index / 2; ++i) {
            int temp = coef[i];
            coef[i] = coef[index - i - 1];
            coef[index - i - 1] = temp;
        }

        int nn = index + coef.length - (n - sum);
        long[][] dp = new long[k + 1][nn];

        dp[0][0] = 1;
        for (int i = 1; i <= k; ++i) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; --j) {
                tmp += dp[i - 1][nn - j - 1];
                tmp %= MOD;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= MOD;
            }
        }

        long result = 0;
        for (long d : dp[k]) {
            result = (result + d) % MOD;
        }
        System.out.println(result);
        
        scanner.close();
    }
}
```

To use this Java program, you can compile it and run it with the test input. It reads from standard input (e.g., your keyboard, or you could redirect from a file), then calculates and prints the expected output. Make sure your Java compiler and runtime are set up properly to compile and run this code.
