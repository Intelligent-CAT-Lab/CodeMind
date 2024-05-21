import java.io.*;
import java.util.*;

public class p02169 {
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null ||!tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
             return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
    static FastScanner in = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static int mod = 998244353;

    public static void main(String[] args) {
        int m = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        long ans = pow(m, n, mod);
        long[] p = new long[k+1];
        for (int i = 0; i <= k; i++) {
            p[i] = pow(i, n, mod);
        }
        long[] comb = new long[k+1];
        comb[0] = 1;
        for (int i = 1; i <= k; i++) {
            comb[i] = comb[i-1] * (k-i+1) % mod * pow(i, mod-2, mod) % mod;
        }
        long c = m;
        for (int i = 1; i < k; i++) {
            long k_ = 0;
            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 1) {
                    k_ = (k_ - comb[i] * p[j] % mod + mod) % mod;
                } else {
                    k_ = (k_ + comb[i] * p[j] % mod) % mod;
                }
            }
            k_ = k_ * c % mod;
            c = c * (m-i) % mod * pow(i+1, mod-2, mod) % mod;
            ans = (ans - k_ + mod) % mod;
        }
        out.println(ans);
        out.flush();
    }

    static long pow(long a, long b, long mod) {
        long ret = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) {
                ret = ret * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return ret;
    }
}