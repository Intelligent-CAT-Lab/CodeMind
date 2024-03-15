Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static final int MOD = (int)(1e9 + 7); // 10 ** 9 + 7

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coef = new int[n];
        Arrays.fill(coef, 1);
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i - 1] = (n / i) - (n / (i + 1));
        }
        
        int sum = Arrays.stream(coef).sum();
        Arrays.fill(coef, n - sum + 1, n, 1);
        int nn = coef.length;
        
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;

        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= MOD;
                dp[i][j] = (int)((coef[j] * tmp) % MOD);
            }
        }
        
        long sumDp = Arrays.stream(dp[k]).sum();
        System.out.println(sumDp % MOD);

        sc.close();
    }
}
```

Please note the following points while converting Python to Java:
1. Java is a statically-typed language, so we must declare the types of all variables.
2. Java uses zero-based indexing for arrays, so we must adjust array accesses accordingly.
3. The `input().split()` in Python is replaced with the `Scanner` class in Java for taking the input from the user.
4. In Java, we need to manually fill the array with `1`s where required, and the `Arrays.stream()` method allows us to calculate the sum.
5. Java's strict typing requires us to cast the result of the module operation to `int` when assigning it back to an integer array.
