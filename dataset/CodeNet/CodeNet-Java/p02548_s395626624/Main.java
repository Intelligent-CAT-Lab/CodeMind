import java.io.*;
import java.util.*;
import java.math.BigDecimal;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    final static int MOD = (int)1e9+7;
    
    void solve(){
        int N = in.nextInt();
        
        Sieve sieve = new Sieve(N);
        long ans = 0;
        for(int C = 1; C < N; C++){
            int AB = N - C;
            ArrayList<int[]> run = sieve.primeFactor(AB);
            long m = 1;
            for(int[] e : run){
                m *= (e[1] + 1);
            }
            ans += m;
        }
        out.println(ans);
    }
    
    class Sieve{
        int MAX;
        int[] f;
        ArrayList<Integer> primes;
        
        public Sieve(){
            this((int)1e6);
        }
        
        public Sieve(int m){
            this.MAX = m;
            f = new int[MAX+1];
            primes = new ArrayList<>();
            f[0] = f[1] = -1;
            for(int i = 2; i <= MAX; i++){
                if(f[i] != 0) continue;
                primes.add(i);
                f[i] = i;
                if((long)i*i > MAX) continue;
                for(int j = i*i; j <= MAX; j += i){
                    if(f[j] == 0) f[j] = i;
                }
            }
        }
        
        //xが素数かどうか
        boolean isPrime(int x){ return f[x] == x;}
        
        //xを素因数分解した結果を返す
        private ArrayList<Integer> factorList(int x){
            ArrayList<Integer> res = new ArrayList<>();
            while(x != 1){
                res.add(f[x]);
                x /= f[x];
            }
            return res;
        }
        
        //xを素因数分解した結果をランレングス圧縮して返す
        ArrayList<int[]> primeFactor(int x){
            if(x == 0) return null;
            ArrayList<Integer> fl = factorList(x);
            ArrayList<int[]> res = new ArrayList<>();
            if(fl.size() == 0){ return res;}
            res.add(new int[]{fl.get(0), 0});
            for(int p : fl){
                if(res.get(res.size()-1)[0] == p){
                    res.get(res.size()-1)[1]++;
                }else{
                    res.add(new int[]{p, 1});
                }
            }
            return res;
        }
        
        int[] lcm(int[] a){
            int[] ex = new int[MAX+1];
            for(int i = 0; i < a.length; i++){
                ArrayList<int[]> pf = this.primeFactor(a[i]);
                for(int[] e : pf){
                    int p = e[0], cnt = e[1];
                    ex[p] = Math.max(ex[p], cnt);
                }
            }
            return ex;
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
            String path = "input.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
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
        
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        
        public long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
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
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
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
                while (Character.isWhitespace(b)) {
                    b = input.read();
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
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
        
        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (b != -1 && b != '\n') {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
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