Here's the translated Java code, taking into account that Java is statically typed, has zero-based indexing, and requires explicit input/output handling:

```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    static final int MOD = 1000000000 + 7;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt() - 1;
        
        int[] dp = new int[1000];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i < 1000; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }
        
        int[][] dp2 = new int[H+1][W];
        dp2[0][0] = 1;
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                dp2[i+1][j] = (int)(((long)dp2[i+1][j] + (long)dp2[i][j] * dp[j] % MOD * dp[W-j-1] % MOD) % MOD);
                if (j-1 >= 0) {
                    dp2[i+1][j-1] = (int)(((long)dp2[i+1][j-1] + (long)dp2[i][j] * dp[j-1] % MOD * dp[W-j-1] % MOD) % MOD);
                }
                if (j+1 < W) {
                    dp2[i+1][j+1] = (int)(((long)dp2[i+1][j+1] + (long)dp2[i][j] * dp[j] % MOD * dp[W-j-2] % MOD) % MOD);
                }
            }
        }
        
        System.out.println(dp2[H][K]);
        
        sc.close();
    }
}
```

Please note these important changes:

1. Java arrays are zero-indexed, so the loop begins from index 0, not index 1. 
2. To read input, I've used a `Scanner` object.
3. The `println` method is used for output.
4. I've cast the results of arithmetic operations to `long` before the modulo operation to avoid integer overflow, then cast back to `int` to store in the `dp2` array.
5. I declared the class and the main method, which is the entry point for the Java program.
6. Closed the `Scanner` at the end of the main method to avoid resource leak warnings in an IDE or linter.
