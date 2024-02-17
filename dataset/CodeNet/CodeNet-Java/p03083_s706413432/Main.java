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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        E_BlackOrWhite solver = new E_BlackOrWhite();
        solver.solve(1, in, out);
        out.close();
    }

    static class E_BlackOrWhite {
        final int N = 200010;
        final int MOD = (int) (1e9 + 7);
        int[] fact = new int[N];
        int[] inv = new int[N];
        int[] invFact = new int[N];

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            precalc();
            int a = in.nextInt();
            int b = in.nextInt();
            int[] ans = new int[a + b];

            long aEnded = 0;
            long bEnded = 0;
            ans[0] = inv(2);
            for (int i = 1; i < ans.length; i++) {
                long aEndsHere = (long) C(i - 1, a - 1) % MOD * inv(pow(2, i)) % MOD;
                long bEndsHere = (long) C(i - 1, b - 1) % MOD * inv(pow(2, i)) % MOD;
                aEnded += aEndsHere;
                aEnded %= MOD;
                bEnded += bEndsHere;
                bEnded %= MOD;

                ans[i] += bEnded;
                ans[i] %= MOD;
                ans[i] += (1 - aEnded - bEnded) % MOD * inv(2) % MOD;
                if (ans[i] < 0) {
                    ans[i] += MOD;
                }
            }

            for (int i = 0; i < ans.length; i++) {
                out.println(ans[i]);
            }
        }

        private void precalc() {
            inv[1] = 1;
            for (int i = 2; i < N; i++) {
                inv[i] = (int) ((MOD - (MOD / i) * (long) inv[MOD % i] % MOD) % MOD);
            }
            fact[0] = 1;
            invFact[0] = 1;
            for (int i = 1; i < N; i++) {
                fact[i] = (int) (i * (long) fact[i - 1] % MOD);
                invFact[i] = (int) (inv[i] * (long) invFact[i - 1] % MOD);
            }
        }

        private int C(int n, int k) {
            if (k < 0 || k > n) {
                return 0;
            }
            long a = fact[n];
            long b = invFact[k] * (long) invFact[n - k] % MOD;
            return (int) (a * b % MOD);
        }

        private int inv(int x) {
            if (x < N) {
                return inv[x];
            }
            return pow(x, MOD - 2);
        }

        private int pow(long a, long n) {
            long r = 1;
            while (n > 0) {
                if (n % 2 == 1) {
                    r = r * a % MOD;
                }
                a = a * a % MOD;
                n /= 2;
            }
            return (int) r;
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

