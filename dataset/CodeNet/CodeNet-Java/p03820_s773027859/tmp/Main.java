// package atcoder.arc.arc068;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();
        ncr = new int[2010][2010];
        for (int i = 0; i < ncr.length; i++) {
            ncr[i][0] = ncr[i][i] = 1;
            for (int j = 1 ; j < i; j++) {
                ncr[i][j] = (ncr[i-1][j] + ncr[i-1][j-1]);
                ncr[i][j] %= MOD;
            }
        }

        long ans = 0;


        // 次に処理する数,更新フラグ,保留数
        int[][][] dp = new int[2][2][n+1];
        dp[n%2][0][0] = 1;
        for (int i = n ; i >= 1 ; i--) {
            int fr = i%2;
            int to = fr^1;
            for (int flg = 0; flg <= 1; flg++) {
                Arrays.fill(dp[to][flg], 0);
System.out.println("[INST]36;None;Arrays.fill(dp[to][flg], 0);"+Arrays.fill(dp[to][flg], 0));
            }

            int haveProcessedNumbers = n - i;
            for (int flg = 0; flg <= 1; flg++) {
                for (int j = n ; j >= 0; j--) {
                    if (dp[fr][flg][j] == 0) {
                        continue;
                    }
                    int base = dp[fr][flg][j];
                    int currentlyInSequence =  haveProcessedNumbers - j;
                    if (currentlyInSequence == k-1) {
                        ans = addMOD(ans, dp[fr][flg][j]);
                        continue;
                    }
                    if (flg == 1 && j >= 1) {
                        dp[fr][flg][j-1] = addMOD(dp[fr][flg][j-1], base);
                    }
                    if (i == 1) {
                        continue;
                    }
                    dp[to][1][j] = addMOD(dp[to][1][j], base);
                    dp[to][0][j+1] = addMOD(dp[to][0][j+1], base);
                }
            }
        }

        for (int i = 0 ; i < n-k-1 ; i++) {
            ans *= 2;
            ans %= MOD;
        }
        out.println(ans);
        out.flush();
System.out.println("[INST]68;None;out.flush();"+out.flush());
    }

    private static int addMOD(long x, long y) {
        long ret = x + y;
        return (int)(ret >= MOD ? ret-MOD : ret);
    }

    static int[][] ncr;

    static long comb(int n, int k) {
        if (n < 0 || k < 0 || n < k) {
            return 0;
        }
        return ncr[n][k] % MOD;
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int[] nextInts(int n) {
            int[] ret = new int[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        private int[][] nextIntTable(int n, int m) {
            int[][] ret = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextInt();
                }
            }
            return ret;
        }

        private long[] nextLongs(int n) {
            long[] ret = new long[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextLong();
            }
            return ret;
        }

        private long[][] nextLongTable(int n, int m) {
            long[][] ret = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ret[i][j] = nextLong();
                }
            }
            return ret;
        }

        private double[] nextDoubles(int n) {
            double[] ret = new double[n];
            for (int i = 0; i < n; i++) {
                ret[i] = nextDouble();
            }
            return ret;
        }

        private int next() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
System.out.println("[INST]145;numChars;stream.read(buf);"+numChars);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            if ('a' <= c && c <= 'z') {
                return (char) c;
            }
            if ('A' <= c && c <= 'Z') {
                return (char) c;
            }
            throw new InputMismatchException();
        }

        public String nextToken() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
System.out.println("[INST]174;None;res.append((char) c);"+res.append((char) c));
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
System.out.println("[INST]177;None;res.toString();"+res.toString());
        }

        public int nextInt() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public long nextLong() {
            int c = next();
            while (isSpaceChar(c))
                c = next();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c-'0';
                c = next();
            } while (!isSpaceChar(c));
            return res*sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }
}
