// package arc.arc084;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long till = System.currentTimeMillis() + 1900;
System.out.println("[INST]12;None;System.currentTimeMillis();"+System.currentTimeMillis());

        int n = in.nextInt();
        int[] best = new int[n];
        Arrays.fill(best, 100);
System.out.println("[INST]16;None;Arrays.fill(best, 100);"+Arrays.fill(best, 100));

        int d = 1;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 1 ; j <= 9 ; j++) {
                int td = (d * j) % n;
                best[td] = Math.min(best[td], j);
System.out.println("[INST]22;None;Math.min(best[td], j);"+Math.min(best[td], j));
            }
            d *= 10;
            d %= n;
        }


        int ans = best[0];

        int nn = n;
        int ans0 = 0;
        while (nn >= 1) {
            ans0 += nn % 10;
            nn /= 10;
        }
        ans = Math.min(ans0, ans);
System.out.println("[INST]37;ans;Math.min(ans0, ans);"+ans);

        List<Integer>[] wset = new List[50];
        for (int i = 0; i < 50 ; i++) {
            wset[i] = new ArrayList<>();
        }
        for (int i = 1 ; i < n ; i++) {
            if (best[i] != 100) {
                wset[best[i]].add(i);
System.out.println("[INST]45;None;wset[best[i]].add(i);"+wset[best[i]].add(i));
            }
        }

        for (int f = 0 ; f < n ; f++) {
            for (int l = 1 ; l <= 9 ; l++) {
                for (int w : wset[l]) {
                    best[(f+w)%n] = Math.min(best[(f+w)%n], best[f] + l);
System.out.println("[INST]52;None;Math.min(best[(f+w)%n], best[f] + l);"+Math.min(best[(f+w)%n], best[f] + l));
                }
            }
            if (System.currentTimeMillis() > till) {
System.out.println("[INST]55;None;System.currentTimeMillis();"+System.currentTimeMillis());
                break;
            }
        }

        ans = Math.min(ans, best[0]);
System.out.println("[INST]60;ans;Math.min(ans, best[0]);"+ans);
        for (int i = 1 ; i < n ; i++) {
            ans = Math.min(ans, best[i] + best[n-i]);
System.out.println("[INST]62;ans;Math.min(ans, best[i] + best[n-i]);"+ans);
        }
        out.println(ans);
        out.flush();
System.out.println("[INST]65;None;out.flush();"+out.flush());
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
System.out.println("[INST]90;numChars;stream.read(buf);"+numChars);
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
System.out.println("[INST]108;None;res.append((char) c);"+res.append((char) c));
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
System.out.println("[INST]111;None;res.toString();"+res.toString());
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