Here is the translated Java code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int MOD = 1000000007;

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[][][] dp = new long[n + 1][n + 1][k + 2 * n + 2];

        dp[0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                for (int l = 0; l < k + 1; l++) {
                    dp[i + 1][j + 1][l + 2 * (j + 1)] += dp[i][j][l];
                    dp[i + 1][j + 1][l + 2 * (j + 1)] %= MOD;
                    dp[i + 1][j][l + 2 * j] += dp[i][j][l] * (j * 2 + 1);
                    dp[i + 1][j][l + 2 * j] %= MOD;
                    if (j != 0) {
                        dp[i + 1][j - 1][l + (j - 1) * 2] += dp[i][j][l] * j * j;
                        dp[i + 1][j - 1][l + (j - 1) * 2] %= MOD;
                    }
                }
            }
        }

        System.out.println(dp[n][0][k] % MOD);
    }
}
```

Please note that since Java does not support direct sys.stdin input streaming as Python does, you need to use BufferedReader and StringTokenizer to read input in Java, which is implemented in the `FastReader` class above.

Also, the `nextInt()` method in `FastReader` casts the input to an integer after reading it as a string. Arrays in Java are initialized to default values, so explicitly setting `dp[0][0][0] = 1` is sufficient, and the rest are automatically zeroes.

To compile and run this Java code, you would typically save the code to a file named "Main.java", then compile it with `javac Main.java`, and run it with `java Main`. Note that your input must come from standard input, and you would have to redirect the input from a file or provide it manually.
