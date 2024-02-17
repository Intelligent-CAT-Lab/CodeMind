import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        int mod = 1000000007;
        public static int n;
        public int[][] comb;
        public long[][] dp;
        HashSet<TaskF.Point> pp;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.nextInt();
            ArrayList<TaskF.Point> ps = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TaskF.Point p = new TaskF.Point();
                p.coeff[i] = 1;
                ps.add(p);
            }
            pp = new HashSet<>();
            comb = Utils.getComb(n + 10, mod);
//        dfs(ps);
            dp = new long[n + 10][101];
            AUtils.deepFill(dp, -1);
            out.println((n * (dfs(n - 1, 0) + dfs(n - 1, 1))) % mod);
        }

        public long dfs(int left, int excess) {
            if (dp[left][excess] != -1) return dp[left][excess];
            if (left == 0) {
                return excess == 0 ? 1 : 0;
            }
            long ret = 0;
            for (int pos = 0; pos <= left; pos++) {
                for (int neg = 0; neg + pos <= left; neg++) {
                    if (pos + neg == 0) continue;
                    int take = pos + neg;
                    if (excess > take + 1) continue;
                    int t = Math.abs(excess + pos - neg);
                    if (t % 2 != 0) continue;
                    ret = (ret + dfs(left - pos - neg, t / 2) * comb[left][pos] % mod * comb[left - pos][neg]) % mod;
                }
            }
            Debug.print(left, excess, ret);
            return dp[left][excess] = ret % mod;
        }

        static class Point {
            public int[] coeff;

            public Point() {
                this.coeff = new int[n];
            }


            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                TaskF.Point point = (TaskF.Point) o;

                return Arrays.equals(coeff, point.coeff);
            }


            public int hashCode() {
                return Arrays.hashCode(coeff);
            }


            public String toString() {
                return "Point{" +
                        "coeff=" + Arrays.toString(coeff) +
                        '}';
            }

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class Utils {
        public static int[][] getComb(int sz, int mod) {
            int[][] comb = new int[sz][sz];
            for (int i = 0; i < sz; i++) {
                comb[i][0] = 1;
                for (int j = 1; j <= i; j++) {
                    comb[i][j] = comb[i - 1][j] + comb[i - 1][j - 1];
                    if (comb[i][j] >= mod) comb[i][j] -= mod;
                }
            }
            return comb;
        }

    }

    static class AUtils {
        public static void deepFill(long[][] x, long val) {
            for (long[] y : x) deepFill(y, val);
        }

        public static void deepFill(long[] x, long val) {
            Arrays.fill(x, val);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }

    static class Debug {
        public static boolean DEBUG;

        static {
            try {
                DEBUG = System.getProperty("user.dir").contains("Dropbox");
            } catch (Exception e) {
                DEBUG = false;
            }
        }

        private static ArrayList<String> getParams() {
            StackTraceElement[] t = Thread.currentThread().getStackTrace();
            StackTraceElement up = t[3];

            ArrayList<String> ret = new ArrayList<>();
            String qqq = up.toString();
            ret.add("." + up.getMethodName() + qqq.substring(qqq.indexOf("("), qqq.length()));
            try {
                BufferedReader br = new BufferedReader(new FileReader(
                        new File("src/" + up.getClassName().replaceAll("\\.", "/") + ".java")));
                int g = up.getLineNumber();
                while (--g > 0) br.readLine();
                String q = br.readLine();
                String[] ss = q.split("Debug\\.print\\(");
                String[] qq = ss[1].substring(0, ss[1].lastIndexOf(")")).split(",");
                for (int i = 0; i < qq.length; i++) {
                    ret.add(qq[i].trim());
                }
            } catch (Exception e) {
            }
            for (int i = 0; i < 100; i++) ret.add("???");
            return ret;
        }

        private static String toString(Object o) {
            if (o == null) {
                return "null";
            } else if (o instanceof Object[]) {
                return Arrays.toString((Object[]) o);
            } else if (o instanceof char[]) {
                return new String((char[]) o);
            } else if (o instanceof int[]) {
                return Arrays.toString((int[]) o);
            } else if (o instanceof long[]) {
                return Arrays.toString((long[]) o);
            } else if (o instanceof double[]) {
                return Arrays.toString((double[]) o);
            } else if (o instanceof boolean[]) {
                return Arrays.toString((boolean[]) o);
            } else {
                return o.toString();
            }
        }

        public static void print(Object... x) {
            if (!DEBUG) return;
            ArrayList<String> s = getParams();
            System.out.print(s.get(0) + ": ");
            for (int i = 0; i < x.length; i++) {
                System.out.print(s.get(i + 1) + " = " + toString(x[i]));
                if (i != x.length - 1) System.out.print(", ");
            }
            System.out.println();
        }

    }
}

