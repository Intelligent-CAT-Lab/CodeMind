Here's the equivalent Java code using dynamic programming (DP) to implement the memoization instead of `lru_cache`, since Java doesn't have a built-in equivalent of `lru_cache` from Python.

```java
import java.util.Scanner;

public class LadderColoring {
    private static int l, k;
    private static long[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        k = scanner.nextInt();
        scanner.close();
        
        dp = new long[l+1][2]; // dp[i][0] for white at top, dp[i][1] for black at top
        for (int i = 0; i <= l; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        
        long ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true);
        }
        
        System.out.println(ans);
    }

    private static long rec(int i, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        
        int isBlackIndex = isBlack ? 1 : 0;
        if (dp[i][isBlackIndex] != -1) {
            return dp[i][isBlackIndex];
        }
        
        long ways;
        if (isBlack) {
            ways = rec(i - 1, false) + rec(i - k, false);
        } else {
            ways = rec(i - 1, true);
        }
        
        dp[i][isBlackIndex] = ways % 1_000_000_007; // Assuming MOD for large numbers
        return dp[i][isBlackIndex];
    }
}
```

For an input of `5 3`, parsed by `Scanner`, the program calculates the number of color combinations for a ladder with length `l` where no `k` consecutive rungs are black, using the defined `rec` method. The printing of `ans` will output the expected result `6`.

The `dp` array is used to store intermediate results, where `dp[i][0]` stands for the number of ways with the top rung being white, and `dp[i][1]` for the top rung being black. Please note that handling modulus might be necessary for large values of `l` to avoid overflow, hence the `% 1_000_000_007` is included in the code as an example.
