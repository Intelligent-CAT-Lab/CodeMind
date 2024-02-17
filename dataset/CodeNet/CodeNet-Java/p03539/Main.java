// package other2017.codefestival2017.finale;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    private static final long MOD = 1000000007;

    public static long cnt(int a, int n, int k, long sum) {
        if (a == n) {
            return sum;
        }
        long f = 0;
        for (int i = 0; i <= k ; i++) {
            f += cnt(a+1, n, k, sum+i);
        }
        return f;
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();

        long pownk1 = 1;
        for (int i = 1; i <= n-1; i++) {
            pownk1 *= (k+1);
            pownk1 %= MOD;
        }
        long total = 0;
        for (int i = 0; i <= k; i++) {
            total += i * pownk1 % MOD;
            total %= MOD;
        }
        total *= n;
        total %= MOD;

        int maxha = 100000;
        long[][] dp = new long[n+1][maxha+1];
        dp[n][0] = 1;

        for (int head = n ; head >= 1 ; head--) {
            for (int ha = 0 ; ha <= maxha ; ha++) {
                long base = dp[head][ha];
                if (base == 0) {
                    continue;
                }
                for (int l = 0 ; l <= k ; l++) {
                    if (l <= head) {
                        int canha = (ha + l) / head;
                        dp[head-1][ha+canha] += base;
                        dp[head-1][ha+canha] %= MOD;
                    } else {
                        dp[head-1][ha] += base;
                        dp[head-1][ha] %= MOD;
                    }
                }
            }
        }

        for (int i = 0; i <= maxha ; i++) {
            long dec = dp[0][i] * i % MOD;
            total += MOD-dec;
            total %= MOD;
        }
        out.println(total%MOD);
        out.flush();
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}