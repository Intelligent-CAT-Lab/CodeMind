import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b;}
    
    void solve(){
        long N = in.nextLong(), A = in.nextLong(), B = in.nextLong();
        if((B - A) % 2 == 0){
            out.println((B - A) / 2);
        }else{
            out.println((Math.min(A - 1, N - B) +  + 1 + (B - A) / 2));
        }
    }
    
    public static void main(String[] args) {
        new Main().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "output.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
System.out.println("[INST]37;None;out.flush();"+out.flush());
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
System.out.println("[INST]60;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]62;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]66;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]68;b;input.read();"+b);
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]72;b;input.read();"+b);
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
System.out.println("[INST]86;b;input.read();"+b);
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
System.out.println("[INST]88;b;input.read();"+b);
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
System.out.println("[INST]92;b;input.read();"+b);
                } else if (b == '+') {
                    b = input.read();
System.out.println("[INST]94;b;input.read();"+b);
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
System.out.println("[INST]98;b;input.read();"+b);
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
System.out.println("[INST]105;b;input.read();"+b);
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
System.out.println("[INST]110;b;input.read();"+b);
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
System.out.println("[INST]121;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]122;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]123;b;input.read();"+b);
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
System.out.println("[INST]135;b;input.read();"+b);
                while (Character.isWhitespace(b)) {
System.out.println("[INST]136;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    b = input.read();
System.out.println("[INST]137;b;input.read();"+b);
                }
                while (b != -1 && !Character.isWhitespace(b)) {
System.out.println("[INST]139;None;Character.isWhitespace(b);"+Character.isWhitespace(b));
                    sb.append((char) b);
System.out.println("[INST]140;None;sb.append((char) b);"+sb.append((char) b));
                    b = input.read();
System.out.println("[INST]141;b;input.read();"+b);
                }
                return sb.toString();
System.out.println("[INST]143;None;sb.toString();"+sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
System.out.println("[INST]153;b;input.read();"+b);
                while (b != -1 && b != '\n') {
                    sb.append((char) b);
System.out.println("[INST]155;None;sb.append((char) b);"+sb.append((char) b));
                    b = input.read();
System.out.println("[INST]156;b;input.read();"+b);
                }
                return sb.toString();
System.out.println("[INST]158;None;sb.toString();"+sb.toString());
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