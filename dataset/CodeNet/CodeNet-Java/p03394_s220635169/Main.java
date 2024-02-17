import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Random;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();

            if (n == 3) {
                out.println("2 5 63");
                return;
            }

            final Random random = new Random(0);
            int[] ans = new int[n];
            TreeSet<Integer> used = new TreeSet<>();
            final int g0 = 2 * 3 * 5 * 7 * 11 * 13;
            LOOP:
            while (true) {
                used.clear();
                used.add(1);
                for (int i = 0; i < n - 1; i++) {
                    do {
                        ans[i] = random.nextInt(30000) + 1;
                    } while (gcd(g0, ans[i]) == 1 || !used.add(ans[i]));
                }
                ans[n - 1] = 0;
                int sum = IntStream.of(ans).sum();
                for (int i = g0 - sum % g0; i <= 30000; i += g0) {
                    if (used.add(i)) {
                        ans[n - 1] = i;
                        sum += i;
                        break;
                    }
                }
                if (ans[n - 1] <= 0) continue;
//            dump(sum, sum % g0);
//            for (int i = 0; i < n - 1; i++) {
//                final int a = ans[i];
//                if (gcd(sum, a) == 1) {
//                    dump("check", sum, sum-a, a, gcd(sum, a), i);
//                    throw new RuntimeException();
//                }
//            }
                long g = 0;
                for (int a : ans) {
                    g = gcd(g, a);
                }
                if (g == 1) {
                    for (int i = 0; i < n; i++) {
                        int a = ans[i];
                        if (gcd(sum - a, a) == 1) {
//                        dump("check", sum, sum-a, a, gcd(sum-a, a), i);
                            continue LOOP;
//                            throw new RuntimeException();
                        }
                    }
                    print(out, ans);
                    break;
                }
            }
        }

        static void print(PrintWriter out, int[] ary) {
            for (int i = 0; i < ary.length; i++) out.print(ary[i] + (i == ary.length - 1 ? "\n" : " "));
        }

        static long gcd(long n, long r) {
            return r == 0 ? n : gcd(r, n % r);
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

