import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.StringJoiner;

class Main {

    static PrintWriter out;
    static InputReader sc;

    public static void main(String[] args) {
        sc = new InputReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    static void solve() {
        int A = sc.nextInt();// 白
        int B = sc.nextInt();// 黒
        final int k = 50;
        final int h = k * 2;
        final int w = k * 2;
        boolean[][] map = new boolean[h][w];// true:黒、false:白
        for (int i = 0; i < k; i++) {
            Arrays.fill(map[i], true);
        }
        for (int i = 0, r = 0; i < A - 1; i++, r += 2) {
            map[(r / h) * 2][r % w] = false;
        }
        for (int i = 0, r = k * w - 1; i < B - 1; i++, r -= 2) {
            map[(r / h) * 2][r % w] = true;
        }
var newVariable_0 = out.printf("%d %d\n", h, w);        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                out.print(map[i][j] ? '#' : '.');
            }
            out.println();
        }
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) {
var newVariable_1 = j.add("null");            } else if (arg instanceof int[]) {
var newVariable_2 = j.add(Arrays.toString((int[]) arg));var newVariable_3 = Arrays.toString((int[]) arg);                j.add(newVariable_3);
            } else if (arg instanceof long[]) {
var newVariable_4 = j.add(Arrays.toString((long[]) arg));var newVariable_5 = Arrays.toString((long[]) arg);                j.add(newVariable_5);
            } else if (arg instanceof double[]) {
var newVariable_6 = j.add(Arrays.toString((double[]) arg));var newVariable_7 = Arrays.toString((double[]) arg);                j.add(newVariable_7);
            } else if (arg instanceof char[]) {
var newVariable_8 = j.add(Arrays.toString((char[]) arg));var newVariable_9 = Arrays.toString((char[]) arg);                j.add(newVariable_9);
            } else if (arg instanceof boolean[]) {
var newVariable_10 = j.add(Arrays.toString((boolean[]) arg));var newVariable_11 = Arrays.toString((boolean[]) arg);                j.add(newVariable_11);
            } else if (arg instanceof Object[]) {
var newVariable_12 = j.add(Arrays.toString((Object[]) arg));var newVariable_13 = Arrays.toString((Object[]) arg);                j.add(newVariable_13);
            } else {
var newVariable_14 = j.add(arg.toString());var newVariable_15 = arg.toString();                j.add(newVariable_15);
            }
        }
        System.err.println(j.toString());
    }

    static class InputReader {

        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int curbuf;
        private int lenbuf;

        public InputReader(InputStream in) {
            this.in = in;
            this.curbuf = this.lenbuf = 0;
        }

        public boolean hasNextByte() {
            if (this.curbuf >= this.lenbuf) {
                this.curbuf = 0;
                try {
var newVariable_16 = this.in.read(this.buffer);                    this.lenbuf = newVariable_16;
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (this.lenbuf <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (this.hasNextByte()) {
                return this.buffer[this.curbuf++];
            } else {
                return -1;
            }
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private void skip() {
            while (this.hasNextByte() && this.isSpaceChar(this.buffer[this.curbuf])) {
                this.curbuf++;
            }
        }

        public boolean hasNext() {
            this.skip();
            return this.hasNextByte();
        }

        public String next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = this.readByte();
            while (!this.isSpaceChar(b)) {
var newVariable_17 = sb.appendCodePoint(b);                b = this.readByte();
            }
var newVariable_18 = sb.toString();            return newVariable_18;
        }

        public int nextInt() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int c = this.readByte();
            while (this.isSpaceChar(c)) {
                c = this.readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = this.readByte();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = this.readByte();
            } while (!this.isSpaceChar(c));
            return minus ? -res : res;
        }

        public long nextLong() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int c = this.readByte();
            while (this.isSpaceChar(c)) {
                c = this.readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = this.readByte();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = this.readByte();
            } while (!this.isSpaceChar(c));
            return minus ? -res : res;
        }

        public double nextDouble() {
            return Double.parseDouble(this.next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextInt();
            }
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextLong();
            }
            return a;
        }

        public char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = this.next().toCharArray();
            }
            return map;
        }
    }
}