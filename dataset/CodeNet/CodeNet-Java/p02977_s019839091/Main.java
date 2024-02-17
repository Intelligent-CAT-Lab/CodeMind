import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        CSkolemXORTree solver = new CSkolemXORTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSkolemXORTree {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int h = Integer.highestOneBit(n + 1) - 1;

            if (n <= 2 || n == h + 1) {
                out.println("No");
                return;
            }

            List<String> ans = new ArrayList<>();
            int[] sum = new int[2 * h + 1];
            int[] index = new int[2 * (h + 1) + 1];
            for (int i = 1, p = -1; i <= 2 * h; i++) {
                int q = i <= h ? i : i - h + n;
                if (p >= 0) {
                    ans.add(p + " " + q);
                }
                p = q;
                int cur = i <= h ? i : i - h;
                sum[i] = sum[i - 1] ^ cur;
//            dump(i, h, cur, sum[i]);
                index[sum[i]] = q;
            }

            if (n != h) {
                ans.add((h + 1) + " " + 1);
                ans.add((h + 2) + " " + (h + 1));
                ans.add((h + n + 2) + " " + 1);
                ans.add((h + n + 1) + " " + (h + n + 2));
                for (int i = h + 3; i <= n; i++) {
                    boolean ok = false;
                    for (int j = 1; j <= 2; j++) {
                        int idx = index[i ^ (h + j)];
                        if (idx != 0) {
                            ok = true;
                            ans.add(i + " " + (h + j + (j == 1 ? 0 : n)));
                            ans.add((i + n) + " " + idx);
                            break;
                        }
                    }
                    if (!ok) {
//                    out.println("No");
//                    return;
                        throw new RuntimeException();
                    }
                }
            }

            out.println("Yes");
            for (String s : ans) {
                out.println(s);
            }
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

