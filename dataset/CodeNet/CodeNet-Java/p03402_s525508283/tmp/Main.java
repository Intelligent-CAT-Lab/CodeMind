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
System.out.println("[INST]17;None;out.flush();"+out.flush());
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
System.out.println("[INST]28;None;Arrays.fill(map[i], true);"+Arrays.fill(map[i], true));
        }
        for (int i = 0, r = 0; i < A - 1; i++, r += 2) {
            map[(r / h) * 2][r % w] = false;
        }
        for (int i = 0, r = k * w - 1; i < B - 1; i++, r -= 2) {
            map[(r / h) * 2][r % w] = true;
        }
        out.printf("%d %d\n", h, w);
System.out.println("[INST]36;None;out.printf('%d %d\n', h, w);"+out.printf("%d %d\n", h, w));
        for (int i = 0; i < h; i++) {
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
                j.add("null");
System.out.println("[INST]49;None;j.add('null');"+j.add("null"));
            } else if (arg instanceof int[]) {
                j.add(Arrays.toString((int[]) arg));
System.out.println("[INST]51;None;j.add(Arrays.toString((int[]) arg));"+j.add(Arrays.toString((int[]) arg)));
System.out.println("[INST]51;None;Arrays.toString((int[]) arg);"+Arrays.toString((int[]) arg));
            } else if (arg instanceof long[]) {
                j.add(Arrays.toString((long[]) arg));
System.out.println("[INST]53;None;j.add(Arrays.toString((long[]) arg));"+j.add(Arrays.toString((long[]) arg)));
System.out.println("[INST]53;None;Arrays.toString((long[]) arg);"+Arrays.toString((long[]) arg));
            } else if (arg instanceof double[]) {
                j.add(Arrays.toString((double[]) arg));
System.out.println("[INST]55;None;j.add(Arrays.toString((double[]) arg));"+j.add(Arrays.toString((double[]) arg)));
System.out.println("[INST]55;None;Arrays.toString((double[]) arg);"+Arrays.toString((double[]) arg));
            } else if (arg instanceof char[]) {
                j.add(Arrays.toString((char[]) arg));
System.out.println("[INST]57;None;j.add(Arrays.toString((char[]) arg));"+j.add(Arrays.toString((char[]) arg)));
System.out.println("[INST]57;None;Arrays.toString((char[]) arg);"+Arrays.toString((char[]) arg));
            } else if (arg instanceof boolean[]) {
                j.add(Arrays.toString((boolean[]) arg));
System.out.println("[INST]59;None;j.add(Arrays.toString((boolean[]) arg));"+j.add(Arrays.toString((boolean[]) arg)));
System.out.println("[INST]59;None;Arrays.toString((boolean[]) arg);"+Arrays.toString((boolean[]) arg));
            } else if (arg instanceof Object[]) {
                j.add(Arrays.toString((Object[]) arg));
System.out.println("[INST]61;None;j.add(Arrays.toString((Object[]) arg));"+j.add(Arrays.toString((Object[]) arg)));
System.out.println("[INST]61;None;Arrays.toString((Object[]) arg);"+Arrays.toString((Object[]) arg));
            } else {
                j.add(arg.toString());
System.out.println("[INST]63;None;j.add(arg.toString());"+j.add(arg.toString()));
System.out.println("[INST]63;None;arg.toString();"+arg.toString());
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
                    this.lenbuf = this.in.read(this.buffer);
System.out.println("[INST]85;None;this.in.read(this.buffer);"+this.in.read(this.buffer));
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
                sb.appendCodePoint(b);
System.out.println("[INST]126;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
                b = this.readByte();
            }
            return sb.toString();
System.out.println("[INST]129;None;sb.toString();"+sb.toString());
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