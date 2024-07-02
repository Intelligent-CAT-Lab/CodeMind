import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b;}
    
    void solve(){
        int N = in.nextInt(), K = in.nextInt();
        int base = 1, cnt = 0;
        while(base <= N){
            cnt++;
            base *= K;
        }
        out.println(cnt);
    }
    
    public static void main(String[] args) {
        new Main().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "input.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
System.out.println("[INST]38;None;out.flush();"+out.flush());
        in.close();
        out.close();
    }
    
    static class FastScanner {
        private Reader input;
        
        public FastScanner() {this(System.in);}
        public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
        public void close() {
            try {
                this.input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        public int nextInt() {return (int) nextLong();}
        
        public long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
System.out.println("[INST]61;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]63;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]67;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]69;b;input.read();"+b);
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]73;b;input.read();"+b);
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
        
        public double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
System.out.println("[INST]87;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]89;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]93;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]95;b;input.read();"+b);
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]99;b;input.read();"+b);
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
System.out.println("[INST]106;b;input.read();"+b);
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
System.out.println("[INST]111;b;input.read();"+b);
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
        
        public char nextChar() {
            try {
                int b = input.read();
System.out.println("[INST]122;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]123;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]124;b;input.read();"+b);
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
        
        public String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
System.out.println("[INST]136;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]137;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]138;b;input.read();"+b);
                }
                while (b != -1 && !Character.isWhitespace(b)) {
System.out.println("[INST]140;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    sb.append((char) b);
System.out.println("[INST]141;None;sb.append((char) b);"+sb.append((char) b));
                    b = input.read();
System.out.println("[INST]142;b;input.read();"+b);
                }
                return sb.toString();
System.out.println("[INST]144;None;sb.toString();"+sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
System.out.println("[INST]154;b;input.read();"+b);
                while (b != -1 && b != '\n') {
                    sb.append((char) b);
System.out.println("[INST]156;None;sb.append((char) b);"+sb.append((char) b));
                    b = input.read();
System.out.println("[INST]157;b;input.read();"+b);
                }
                return sb.toString();
System.out.println("[INST]159;None;sb.toString();"+sb.toString());
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