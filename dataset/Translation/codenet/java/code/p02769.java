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
 * @author Jaynil
 */
public class p02769 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERoaming solver = new ERoaming();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoaming {
        long[] fact;
        long[] factinv;
        long mod = 1000000007;
        long n;

        public void gen() {
            fact = new long[(int) (n + 1)];
            factinv = new long[(int) (n + 1)];
            fact[0] = 1;
            factinv[0] = Maths.power(fact[0], mod - 2, mod);
            for (int i = 1; i <= n; i++) {
                fact[i] = i * fact[i - 1];
                fact[i] %= mod;
                factinv[i] = Maths.power(fact[i], mod - 2, mod);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextLong();
            long k = in.nextLong();
            if (k >= n) {
                out.println(Maths.nCrs(n + n - 1, n - 1, mod));
            } else {
                long ans = 0;
                gen();
                for (int i = 0; i <= k; i++) {
                    long up = fact[(int) n] * fact[(int) (n - 1)];
                    up %= mod;
                    long den1 = factinv[i] * factinv[i];
                    den1 %= mod;
                    long den2 = factinv[(int) n - i] * factinv[(int) n - i - 1];
                    den2 %= mod;
                    long den = den1 * den2;
                    den %= mod;
                    ans += up * den;
                    ans %= mod;
//                out.println((up*den)%mod);
                }
                out.println(ans);
            }
        }

    }

    static class Maths {
        static long nCrs(long n, long r, long p) {
            //r is small
            long up = 1;
            long down = 1;
            for (long i = n - r + 1; i <= n; i++) {
                up *= i;
                up %= p;
            }
            for (long i = 1; i <= r; i++) {
                down *= i;
                down %= p;
            }
            return (up * power(down, p - 2, p)) % p;
        }

        static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

