import java.io.*;
import java.util.*;

public class p02170 {
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = in.i();
        int k = in.i();
        int a = in.i();

        long mod = 998244353;
        long[] dp = new long[k + 1];
        long A = a * modpow(100 * n, mod - 2, mod) % mod;
        long inv = modpow(n, mod - 2, mod);

        for (int i = k - 1; i >= 0; i--) {
            if (k > i + n) {
                dp[i] = (dp[i + 1] - dp[i + n + 1] + mod) * A % mod + dp[i + 1];
            } else {
                dp[i] = (dp[i + 1] - dp[k] + mod) * A % mod + (n - (k - i) + 1) * inv % mod + dp[i + 1];
            }
            dp[i] %= mod;
        }

        out.println((dp[0] - dp[1] + mod) % mod);
        out.flush();
    }

    static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }

    static class MyReader extends BufferedReader {
        char[] cbuf = new char[1024];
        int head = 0;
        int tail = 0;

        MyReader() {
            super(new InputStreamReader(System.in));
        }

        char next() {
            if (head == tail) {
                try {
                    tail = super.read(cbuf, 0, cbuf.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                head = 0;
            }
            return cbuf[head++];
        }

        void back() {
            head--;
        }

        boolean minus() {
            boolean minus;
            while (true) {
                char c = next();
                if (!isDelimiter(c)) {
                    if (!(minus = c == '-')) back();
                    return minus;
                }
            }
        }

        void skip() {
            while (isDelimiter(next()));
            back();
        }

        char[] s(int N) {
            char[] cbuf = new char[N];
            read(cbuf, 0, N);
            return cbuf;
        }

        public int read(char[] cbuf, int off, int len) {
            skip();
            int i;
            for (i = 0; i < cbuf.length; i++) {
                char c = next();
                if (isDelimiter(c)) {
                    break;
                }
                cbuf[i] = c;
            }
            return i;
        }

        boolean isDelimiter(char c) {
            return c =='' || c == '\n' || c == '\r';
        }

        int i() {
            boolean minus = minus();
            int n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus? -n : n;
        }

        int[] ii(final int N) {
            int[] a = new int[N];
            for (int j = 0; j < a.length; j++) a[j] = i();
            return a;
        }

        long l() {
            boolean minus = minus();
            long n = 0;
            while (true) {
                int k = next() - '0';
                if (k < 0 || 9 < k) break;
                n = 10 * n + k;
            }
            return minus? -n : n;
        }
    }
}