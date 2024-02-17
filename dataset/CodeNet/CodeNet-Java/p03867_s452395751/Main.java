import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1 ; i * i <= n ; i++) {
            if (n % i == 0) {
                if (i * i < n) {
                    divisors.add(n / i);
                }
                divisors.add(i);
            }
        }
        Collections.sort(divisors);

        long ans = 0;
        long[] ptn = new long[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            int cycle = divisors.get(i);
            long pt = pow(k, (cycle+1)/2);
            ptn[i] = pt;
            for (int j = 0; j < i ; j++) {
                if (cycle % divisors.get(j) == 0) {
                    ptn[i] += (MOD - ptn[j]) % MOD;
                    ptn[i] %= MOD;
                }
            }
            long add = ptn[i] * cycle % MOD;
            if (cycle % 2 == 0) {
                add *= inv(2);
                add %= MOD;
            }
            ans += add;
        }
        out.println(ans % MOD);
        out.flush();
    }

    static Set<String> rotate(String p) {
        int n = p.length();
        Set<String> lw = new HashSet<>();
        Set<String> al = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            String part = p.substring(i) + p.substring(0, i);
            if (isPalindrome(part)) {
                lw.add(part);
            }
            al.add(part);
        }
        debug(al.size(), al);
        return lw;

    }

    static boolean isPalindrome(String x) {
        return x.equals(new StringBuilder().append(x).reverse().toString());
    }

    static final int MOD = 1000000007;

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


    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
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