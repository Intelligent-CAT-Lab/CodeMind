import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int i = in.nextInt();

            long[] md = new long[i];

            int rm = i - 2;
            int lx = i - 2;
            while (rm >= 0) {
                md[lx + 1] = Util.c(rm, lx);
                rm -= 2;
                lx--;
            }
            long res = 0;
            long prev = 0;
            for (int m = 1; m < i; m++) {
                long cur = Util.fact(m) * Util.fact(i - m - 1) % Util._m;
                cur = cur * (md[m]) % Util._m;


                res += (cur - prev + Util._m) * m % Util._m;
                prev = cur;

            }


            out.println(res % Util._m);

        }

    }

    static class MyScan {
        private final InputStream in;
        private byte[] inbuf = new byte[1024];
        public int lenbuf = 0;
        public int ptrbuf = 0;

        public MyScan(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = in.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

    }

    static class Util {
        public static final long M07 = 1000_000_007;
        public static long _m = M07;
        private static long[] fact;
        private static long[] inv;
        private static long[] ifact;

        public static void l() {
            fact = new long[1000001];
            inv = new long[1000001];
            ifact = new long[1000001];
            for (int s = 0; s < 2; s++) {
                fact[s] = 1;
                ifact[s] = 1;
                inv[s] = 1;
            }
            inv[0] = 0;
            for (int i = 2; i < inv.length; i++) {
                inv[i] = (_m - (_m / i) * inv[(int) (_m % i)] % _m) % _m;
            }
            for (int i = 2; i < fact.length; i++) {
                fact[i] = i * fact[i - 1] % _m;
                ifact[i] = inv[i] * ifact[i - 1] % _m;
            }
        }

        public static long c(int a, int b) {
            if (fact == null) l();
            return ifact[a] * ifact[b - a] % _m * fact[b] % _m;
        }

        public static long fact(int a) {
            if (fact == null) l();
            return fact[a];
        }

    }
}

