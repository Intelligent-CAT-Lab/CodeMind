import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Xi Lin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        static long mod = (long) (1e9 + 7);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int D = in.nextInt();
            long dp[][] = new long[n + 1][];
            long binom[][] = new long[n + 1][];
            long coef[][] = new long[n + 1][];
            long fac[] = new long[n + 1];
            long inv[] = new long[n + 1];
            for (int i = 0; i <= n; ++i) {
                dp[i] = new long[n + 1];
                binom[i] = new long[n + 1];
                coef[i] = new long[n + 1];
            }
            for (int i = 0; i <= n; ++i) {
                binom[i][0] = binom[i][i] = 1;
                for (int j = 1; j < i; ++j) {
                    binom[i][j] = (binom[i - 1][j] + binom[i - 1][j - 1]) % mod;
                }
            }
            fac[0] = inv[0] = 1;
            for (int i = 1; i <= n; ++i) {
                fac[i] = (long) i * fac[i - 1] % mod;
                inv[i] = pow_mod(fac[i], mod - 2);
            }
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= i; ++j)
                    if (i % j == 0) {
                        int k = i / j;
                        coef[i][j] = fac[i] * pow_mod(inv[j], k) % mod * inv[k] % mod;
                    }
            }
            for (int i = 0; i <= n; ++i) dp[0][i] = 1;
            for (int i = 1; i <= n; ++i) {
                for (int j = A; j <= B; ++j) {
                    for (int k = C; j * k <= i && k <= D; ++k) {
                        dp[i][j] = (dp[i][j] + dp[i - k * j][j - 1] * coef[j * k][j] % mod * binom[i][j * k] % mod) % mod;
                    }
                }
                for (int j = 1; j <= n; ++j) {
                    //out.printf("%d ", (int)dp[i][j]);
                    dp[i][j] = (dp[i][j] + dp[i][j - 1]) % mod;
                }
                //out.println();
            }
            out.println(dp[n][n]);
        }

        long pow_mod(long a, long n) {
            long r = 1;
            for (; n > 0; n >>= 1) {
                if (n % 2 == 1) r = r * a % mod;
                a = a * a % mod;
            }
            return r;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

