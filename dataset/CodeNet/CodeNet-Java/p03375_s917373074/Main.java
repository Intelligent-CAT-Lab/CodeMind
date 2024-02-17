// package arc.arc096;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        MOD = in.nextInt();
        prec(12000);

        long[][] stir = stirlingSecond(n, MOD);

        long[] pow2 = new long[n+10];
        pow2[0] = 1;
        for (int i = 1; i < pow2.length ; i++) {
            pow2[i] = pow2[i-1] * 2 % MOD;
        }
        long[] other2 = new long[n+10];
        other2[0] = 2;
        for (int i = 1 ; i < other2.length ; i++) {
            other2[i] = (other2[i-1] * other2[i-1]) % MOD;
        }

        long[] p2p = new long[n+10];

        long total = 0;
        for (int i = 1 ; i <= n ; i++) {
            long o2 = other2[n-i];
            long p2 = pow2[n-i];

            p2p[0] = 1;
            for (int j = 1 ; j < p2p.length ; j++) {
                p2p[j] = p2p[j-1] * p2 % MOD;
            }

            long co = comb(n, i);
            long sum = 0;
            for (int j = 1 ; j <= i ; j++) {
                long way = stir[i][j] % MOD;

                // one of them is zero
                sum += way * j % MOD * p2p[j-1] % MOD;

                // all of them is one
                sum += way * p2p[j] % MOD;

                sum %= MOD;
            }
            sum = sum * co % MOD * o2 % MOD;

            if (i % 2 == 1) {
                total += sum;
            } else {
                total += MOD - sum;
            }
        }
        total %= MOD;

        out.println((other2[n] + MOD - total) % MOD);
        out.flush();
    }

    static int MOD = 1000000007;

    public static long[][] stirlingSecond(int n, long mod) {
        long[][] ret = new long[n+1][n+1];
        ret[0][0] = 1;
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                ret[i][j] += ret[i-1][j-1];
                ret[i][j] += ret[i-1][j] * j;
                ret[i][j] %= mod;
            }
        }
        return ret;
    }

    static long pow(long a, long x) {
        long res = 1;
        while (x > 0) {
            if (x % 2 != 0) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            x /= 2;
        }
        return res;
    }

    static long inv(long a) {
        return pow(a, MOD - 2) % MOD;
    }

    static long[] _fact;
    static long[] _invfact;

    static long comb(long ln, long lr) {
        int n = (int) ln;
        int r = (int) lr;
        if (n < 0 || r < 0 || r > n) {
            return 0;
        }
        if (r > n / 2) {
            r = n - r;
        }
        return (((_fact[n] * _invfact[n - r]) % MOD) * _invfact[r]) % MOD;
    }

    static void prec(int n) {
        _fact = new long[n + 1];
        _invfact = new long[n + 1];
        _fact[0] = 1;
        _invfact[0] = 1;
        for (int i = 1; i <= n; i++) {
            _fact[i] = _fact[i - 1] * i % MOD;
            _invfact[i] = inv(_fact[i]);
        }
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