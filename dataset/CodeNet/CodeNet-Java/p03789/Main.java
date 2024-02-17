// package agc.agc011;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    static int solve(char[] N) {
        int n = N.length;
        BigInt bigint = new BigInt(N);
        bigint.multiply(9);

        int ok = n * 10;
        int ng = 0;
        while (Math.abs(ok - ng) > 1) {
            int med = (ok + ng) / 2;
            if (canMake(med, bigint.clone())) {
                ok = med;
            } else {
                ng = med;
            }
        }
        return (ok + 8) / 9;
    }

    private static boolean canMake(int n, BigInt bigint) {
        bigint.add(n);
        return bigint.digitSum() <= n;
    }

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        char[] s = in.nextToken().toCharArray();
        out.println(solve(s));
        out.flush();
    }

    public static class BigInt {
        int[] w;
        int MOD = 100000000;

        public BigInt clone() {
            BigInt big = new BigInt(w.clone());
            return big;
        }

        public int digitSum() {
            int sum = 0;
            for (int wi : w) {
                sum += digitSum(wi);
            }
            return sum;
        }

        public int digitSum(int wi) {
            int w = 0;
            while (wi >= 1) {
                w += wi % 10;
                wi /= 10;
            }
            return w;
        }

        public BigInt(int[] w) {
            this.w = w;
        }

        public BigInt(char[] str) {
            int sn = str.length;
            int[] revint = new int[sn+64];
            for (int i = 0; i < str.length ; i++) {
                revint[i] = (str[str.length-1-i]-'0');
            }

            int n = (str.length + 7) / 8 + 4;
            w = new int[n];
            for (int i = 0 ; i < n ; i++) {
                int fr = (i+1)*8-1;
                int to = i*8;
                for (int l = fr ; l >= to ; l--) {
                    w[i] *= 10;
                    w[i] += revint[l];
                }
            }
        }


        public void multiply(int n) {
            int c = 0;
            for (int i = 0; i < w.length ; i++) {
                w[i] *= n;
                w[i] += c;
                c = w[i] / MOD;
                w[i] %= MOD;
            }
        }

        public void add(int n) {
            w[0] += n;
            for (int i = 0; i+1 < w.length ; i++) {
                if (w[i] < MOD) {
                    break;
                }
                int up = w[i] / MOD;
                w[i] %= MOD;
                w[i+1] += up;
            }
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