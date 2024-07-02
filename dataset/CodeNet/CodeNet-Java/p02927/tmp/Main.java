import java.io.*;
import java.util.*;
import java.util.Map.Entry;

@SuppressWarnings("unused")
public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b ? "Yes" : "No"));}

    void solve() throws Exception{
        int M = in.nextInt(), D = in.nextInt();
        int ans = 0;
        for(int m = 1; m <= M; m++){
            for(int d = 1; d <= D; d++){
                int d1 = d % 10, d2 = d / 10;
                if(d1 >= 2 && d2 >= 2 && d1 * d2 == m) ans++;
            }
        }
        out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        solve();
        out.flush();
System.out.println("[INST]29;None;out.flush();"+out.flush());
    }

    static class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
System.out.println("[INST]43;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]45;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]49;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]51;b;input.read();"+b);
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]55;b;input.read();"+b);
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }

        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
System.out.println("[INST]69;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]71;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]75;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]77;b;input.read();"+b);
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]81;b;input.read();"+b);
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
System.out.println("[INST]88;b;input.read();"+b);
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
System.out.println("[INST]93;b;input.read();"+b);
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                int b = input.read();
System.out.println("[INST]104;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]105;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]106;b;input.read();"+b);
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }

        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
System.out.println("[INST]118;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]119;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]120;b;input.read();"+b);
                }
                while (b != -1 && !Character.isWhitespace(b)) {
System.out.println("[INST]122;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    sb.append((char) b);
System.out.println("[INST]123;None;sb.append((char) b);"+sb.append((char) b));
                    b = input.read();
System.out.println("[INST]124;b;input.read();"+b);
                }
                return sb.toString();
System.out.println("[INST]126;None;sb.toString();"+sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }

        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }

        public Long[] nextWrapperLongArray(int n) {
            Long[] res = new Long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public Long[] nextWrapperLongArrayDec(int n) {
            Long[] res = new Long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public Long[] nextWrapperLongArray1Index(int n) {
            Long[] res = new Long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }
    }
}
/* end Main */