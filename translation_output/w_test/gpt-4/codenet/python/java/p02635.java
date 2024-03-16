Below you can find the translated Java code that corresponds to the provided Python code:

```java
import java.io.*;
import java.util.*;

public class Solution {
    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        K = Math.min(K, 300);

        List<Integer> a = new ArrayList<>();
        int val = 0;
        for (char ch : S.toCharArray()) {
            if (ch == '0') {
                a.add(val);
                val = 0;
            } else {
                val++;
            }
        }

        if (val != 0) {
            a.add(val);
        }

        int m = a.size();
        K = Math.min(a.stream().mapToInt(Integer::intValue).sum(), K);

        int[][][] dp = new int[m + 1][K + 1][K + 1];
        for (int j = 0; j <= K; j++) {
            dp[m][j][j] = 1;
        }

        int[] b = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = a.get(i);
            c[i] = a.get(i);
        }

        for (int i = 1; i < m; i++) {
            b[i] += b[i - 1];
        }

        for (int i = m - 2; i >= 0; i--) {
            c[i] += c[i + 1];
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int k = 0; k <= Math.min(b[i], K); k++) {
                for (int j = 0; j <= Math.min(K, k + c[i]); j++) {
                    int M = Math.max(k - j, -a.get(i));
                    for (int l = Math.max(0, M); l <= K - j; l++) {
                        dp[i][j][k] += dp[i + 1][j + l][k];
                        dp[i][j][k] %= MOD;
                    }
                    for (int l = 1; l <= Math.min(K - k, -M); l++) {
                        dp[i][j][k] += dp[i + 1][j][k + l];
                        dp[i][j][k] %= MOD;
                    }
                }
            }
        }

        System.out.println(dp[0][0][0]);
        sc.close();
    }
}
```

This Java program performs the same computation as the given Python code:
1. It reads the binary string `S` and an integer `K`, then caps `K` at 300 and initializes data structures accordingly.
2. It converts the string of zeros and ones into a list `a` that records the lengths of contiguous sequences of ones.
3. It implements the dynamic programming logic to compute the `dp` table.
4. Finally, it prints the result stored in `dp[0][0][0]`.
