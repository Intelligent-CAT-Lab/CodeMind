import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static long __startTime = System.currentTimeMillis();
System.out.println("[INST]6;__startTime;System.currentTimeMillis();"+__startTime);

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
System.out.println("[INST]18;None;divisors.add(n / i);"+divisors.add(n / i));
                }
                divisors.add(i);
System.out.println("[INST]20;None;divisors.add(i);"+divisors.add(i));
            }
        }
        Collections.sort(divisors);
System.out.println("[INST]23;None;Collections.sort(divisors);"+Collections.sort(divisors));

        long ans = 0;
        long[] ptn = new long[divisors.size()];
System.out.println("[INST]26;None;divisors.size();"+divisors.size());
        for (int i = 0; i < divisors.size(); i++) {
System.out.println("[INST]27;None;divisors.size();"+divisors.size());
            int cycle = divisors.get(i);
System.out.println("[INST]28;cycle;divisors.get(i);"+cycle);
            long pt = pow(k, (cycle+1)/2);
            ptn[i] = pt;
            for (int j = 0; j < i ; j++) {
                if (cycle % divisors.get(j) == 0) {
System.out.println("[INST]32;None;divisors.get(j);"+divisors.get(j));
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
System.out.println("[INST]45;None;out.flush();"+out.flush());
    }

    static Set<String> rotate(String p) {
        int n = p.length();
System.out.println("[INST]49;n;p.length();"+n);
        Set<String> lw = new HashSet<>();
        Set<String> al = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            String part = p.substring(i) + p.substring(0, i);
System.out.println("[INST]53;None;p.substring(i);"+p.substring(i));
System.out.println("[INST]53;None;p.substring(0, i);"+p.substring(0, i));
            if (isPalindrome(part)) {
                lw.add(part);
System.out.println("[INST]55;None;lw.add(part);"+lw.add(part));
            }
            al.add(part);
System.out.println("[INST]57;None;al.add(part);"+al.add(part));
        }
        debug(al.size(), al);
System.out.println("[INST]59;None;al.size();"+al.size());
        return lw;

    }

    static boolean isPalindrome(String x) {
        return x.equals(new StringBuilder().append(x).reverse().toString());
System.out.println("[INST]65;None;x.equals(new StringBuilder().append(x).reverse().toString());"+x.equals(new StringBuilder().append(x).reverse().toString()));
System.out.println("[INST]65;None;new StringBuilder().append(x).reverse().toString();"+new StringBuilder().append(x).reverse().toString());
System.out.println("[INST]65;None;new StringBuilder().append(x).reverse();"+new StringBuilder().append(x).reverse());
System.out.println("[INST]65;None;new StringBuilder().append(x);"+new StringBuilder().append(x));
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
System.out.println("[INST]88;None;System.currentTimeMillis();"+System.currentTimeMillis());
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
System.out.println("[INST]113;numChars;stream.read(buf);"+numChars);
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
System.out.println("[INST]131;None;res.append((char) c);"+res.append((char) c));
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
System.out.println("[INST]134;None;res.toString();"+res.toString());
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