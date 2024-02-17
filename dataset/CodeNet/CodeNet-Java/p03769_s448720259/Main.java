// package agc.agc012;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextLong();
        for (int d = 1 ; d <= 50 ; d++) {
            long pw = (1L<<d)-1;
            if (pw > n) {
                int[] ret = doit(n, d-1);
                out.println(ret.length);
                for (int i = 0; i < ret.length ; i++) {
                    if (i >= 1) {
                        out.print(' ');
                    }
                    out.print(ret[i]+1);
                }
                out.println();
                break;
            }
        }
        out.flush();

//        count("abcdeabcde");
//        count("abcdZeabcdeZ");
//        count("abcEdZeabcdeZE");
//        count("abFcdZeabcdeZF");
//        count("abFcEdZeabcdeZEF");
//        count("aGbFcEdZeabcdeZEFG");
//        count("HaGbFcEdZeabcdeZEFGH");
//        count("HabcdeabcdeH");
    }

    private static int[] doit(long n, int base) {
        long B = (1L<<base)/2;
        long now = (1L<<base)-1;
        List<Integer> bone = new ArrayList<>();
        for (int k = 0; k < 2 ; k++) {
            for (int i = 0; i < base ; i++) {
                bone.add(i);
            }
        }

        int ln = 99;
        int bi = base-1;
        while (bi >= 0) {
            if (now + (1L<<bi) <= n) {
                bone.add(bi, ln);
                bone.add(ln);
                now += (1L<<bi);
                ln--;
            }
            bi--;
        }
        int[] ret = new int[bone.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = bone.get(i);
        }
        return ret;
    }

    static void count(String s) {
        int n = s.length();
        int ct = 0;
        for (int i = 0; i < (1<<n); i++) {
            String sub = "";
            for (int j = 0; j < n ; j++) {
                if ((i & (1<<j)) >= 1) {
                    sub += s.charAt(j);
                }
            }
            int sn = sub.length();
            if (sn >= 2 && sn % 2 == 0 && sub.substring(0, sn/2).equals(sub.substring(sn/2))) {
                ct++;
            }
        }
        debug(s, ct);
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