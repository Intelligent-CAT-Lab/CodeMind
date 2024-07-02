import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    private FastScanner in = new FastScanner(System.in);
    private PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a % b);
    }
    long lcm(long a, long b){
        return a / gcd(a, b) * b; //オーバーフローに注意
    }

    void solve() {
        String S = in.nextStr();
        int[] num = new int[26];
        long ans = (long)(S.length())*(S.length()+1)/2+1;
System.out.println("[INST]19;None;S.length();"+S.length());
System.out.println("[INST]19;None;S.length();"+S.length());
        for(int i = 0; i < S.length(); i++){
System.out.println("[INST]20;None;S.length();"+S.length());
            int c = (S.charAt(i)-'a');
System.out.println("[INST]21;None;S.charAt(i);"+S.charAt(i));
            num[c]++;
            ans -= num[c];
        }
        out.println(ans);
    }
    //end solve

    public static void main(String[] args) {
        new Main().m();
    }

    private void m() {
        solve();
        out.flush();
System.out.println("[INST]35;None;out.flush();"+out.flush());
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
System.out.println("[INST]49;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]51;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]55;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]57;b;input.read();"+b);
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]61;b;input.read();"+b);
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
System.out.println("[INST]75;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]77;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]81;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]83;b;input.read();"+b);
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]87;b;input.read();"+b);
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
System.out.println("[INST]94;b;input.read();"+b);
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
System.out.println("[INST]99;b;input.read();"+b);
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
System.out.println("[INST]110;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]111;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]112;b;input.read();"+b);
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
System.out.println("[INST]124;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]125;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]126;b;input.read();"+b);
                }
                while (b != -1 && !Character.isWhitespace(b)) {
System.out.println("[INST]128;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    sb.append((char) b);
System.out.println("[INST]129;None;sb.append((char) b);"+sb.append((char) b));
                    b = input.read();
System.out.println("[INST]130;b;input.read();"+b);
                }
                return sb.toString();
System.out.println("[INST]132;None;sb.toString();"+sb.toString());
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
    }
}