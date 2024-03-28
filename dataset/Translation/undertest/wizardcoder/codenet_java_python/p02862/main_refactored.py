class main:
    import java.io.*;
    import java.util.*;
    import java.math.*;
    // import java.awt.Point;
    
    public class p02862 {
        InputStream is;
        PrintWriter out;
        String INPUT = "";
    
        static int mod = 1_000_000_007;
        // int mod = 998244353;
        // long inf = Long.MAX_VALUE/2;
        int inf = Integer.MAX_VALUE/2;
    
        void solve(){
            int x = ni();
            int y = ni();
            if ((2*y-x)%3!=0 || 2*y-x<0){
                out.println(0);
                return;
            }
            int a = (2*y-x)/3;
            if ((2*x-y)%3!=0 || 2*x-y<0){
                out.println(0);
                return;
            }
            int b = (2*x-y)/3;
            int[][] fif = enumFIF(3000000, mod);
            out.println(C(a+b,a,mod,fif));
    
        }
    
        public static long C(int n, int r, int mod, int[][] fif) {
            if (n < 0 || r < 0 || r > n)
                return 0;
            return (long) fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod;
        }
    
        public static int[][] enumFIF(int n, int mod) {
            int[] f = new int[n + 1];
            int[] invf = new int[n + 1];
            f[0] = 1;
            for (int i = 1; i <= n; i++) {
                f[i] = (int) ((long) f[i - 1] * i % mod);
            }
            long a = f[n];
            long b = mod;
            long p = 1, q = 0;
            while (b > 0) {
                long c = a / b;
                long d;
                d = a;
                a = b;
                b = d % b;
                d = p;
                p = q;
                q = d - c *