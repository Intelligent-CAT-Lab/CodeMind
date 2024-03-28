import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class p02170 {
    static int mod = 998244353;
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        solve(sc);
    }
    
    static void solve(FastScanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        long[] lst = new long[k + 1];
        
        lst[k - 1] = 1;
        long A = (long) a * modPow(100 * n, mod - 2, mod) % mod;
        long inv = modPow(n, mod - 2, mod);
        
        for (int i = k - 2; i >= 0; i--) {
            if (k > i + n) {
                lst[i] = (A * (lst[i + 1] - lst[i + n + 1]) + lst[i + 1]) % mod;
            } else {
                lst[i] = (A * (lst[i + 1] - lst[k]) + (n - (k - i) + 1) * inv + lst[i + 1]) % mod;
            }
        }
        
        long result = (lst[0] - lst[1] + mod) % mod;
        System.out.println(result);
    }
    
    static long modPow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}