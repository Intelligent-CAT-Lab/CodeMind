import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

public class p03431 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public static final int mod = 998244353;
        int n;
        int k;
        long[] fact;
        long[] ifact;

        long comb(int n, int k) {
            if (k < 0 || k > n) return 0;
            return fact[n] * ifact[k] % mod * ifact[n - k] % mod;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.nextInt();
            k = in.nextInt();
            long[][] x = Factorials.getFIF(500010, mod);
            fact = x[0];
            ifact = x[1];

            long ans = 0;
            for (int diff = k % 2; diff <= k; diff += 2) {
                int nr = (k + diff) / 2;
                int nb = k - nr;
                if (nr < n) continue;

                if (diff == 0) {
                    ans += comb(k-1, nr);
                    if (ans >= mod) ans -= mod;
                    ans -= comb(k-1, nb-1-(nr-n+1));
                    if (ans < 0) ans += mod;
                    continue;
                }
                int r2 = (k - diff) / 2 - Math.min(k - diff, nr - n) - 1;
                int b2 = k - r2;

                ans += comb(nr + nb, nb) - comb(r2 + b2, r2);
                ans %= mod;
                if (ans < 0) ans += mod;
            }

            out.println(ans);
        }

    }

    static class Factorials {
        public static long[][] getFIF(int max, int mod) {
            long[] fact = new long[max];
            long[] ifact = new long[max];
            long[] inv = new long[max];
            inv[1] = 1;
            for (int i = 2; i < max; i++) {
                inv[i] = (mod - mod / i) * inv[mod % i] % mod;
            }
            fact[0] = 1;
            ifact[0] = 1;
            for (int i = 1; i < max; i++) {
                fact[i] = fact[i - 1] * i % mod;
                ifact[i] = ifact[i - 1] * inv[i] % mod;