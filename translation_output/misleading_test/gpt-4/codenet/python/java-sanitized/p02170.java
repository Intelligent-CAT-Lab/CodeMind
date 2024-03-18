import java.io.*;
import java.util.*;

public class p02170 {
    static final int mod = 998244353;
    static int n, k, a;
    static long[] lst;
    static long A;
    static long inv;

    public static void main(String[] args) throws IOException {
        InputReader input = new InputReader(System.in);
        n = input.nextInt();
        k = input.nextInt();
        a = input.nextInt();
        lst = new long[k + 1];
        lst[k - 2] = 1;
        A = (long)a * modInverse(100L * n % mod, mod) % mod;
        inv = modInverse(n, mod);

        for (int i = k - 1; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = (A * (lst[i+1] - lst[i+n+1] + mod) % mod) + lst[i+1];
                lst[i] %= mod;
            } else {
                lst[i] = (A * (lst[i+1] - lst[k] + mod) % mod) + ((n - (k - i) + 1) * inv % mod) + lst[i+1];
                lst[i] %= mod;
            }
        }
        System.out.println((lst[0] - lst[1] + mod) % mod);
    }

    public static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            // q is quotient
            long q = a / m;
            long t = m;

            // m is remainder now, process same as
            // Euclid's algo
            m = a % m;
            a = t;
            t = y;

            // Update y and x
            y = x - q * y;
            x = t;
        }

        // Make x positive
        if (x < 0)
            x += m0;

        return x;
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

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}