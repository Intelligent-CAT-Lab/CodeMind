```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final long mod = (long) 1e9 + 7;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[][][] dp = new long[n + 1][n + 1][k + 2 * (n + 1)];
        dp[0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                for (int l = 0; l <= k; l++) {
                    dp[i + 1][j + 1][l + 2 * (j + 1)] += dp[i][j][l];
                    dp[i + 1][j + 1][l + 2 * (j + 1)] %= mod;
                    dp[i + 1][j][l + 2 * j] += dp[i][j][l] * (j * 2 + 1);
                    dp[i + 1][j][l + 2 * j] %= mod;
                    if (j != 0) {
                        dp[i + 1][j - 1][l + (j - 1) * 2] += dp[i][j][l] * j * j;
                        dp[i + 1][j - 1][l + (j - 1) * 2] %= mod;
                    }
                }
            }
        }

        System.out.println(dp[n][0][k] % mod);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
```

