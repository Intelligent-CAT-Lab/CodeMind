class main:
    import java.io.*;
    import java.util.*;
    import java.math.*;
    
    public class p03083 {
        InputStream is;
        PrintWriter out;
        String INPUT = "";
    
        static int mod = 1_000_000_007;
        // int mod = 998244353;
        long inf = Long.MAX_VALUE/2;
    
        void solve(){
            int b = ni();
            int w = ni();
            int n = b+w;
            long[] dpw = new long[n+1];
            long[] dpb = new long[n+1];
            int[][] fif = enumFIF(1000000, mod);
            long[] inv = new long[n];
            inv[1] = 1;
            for(int i = 2; i < n; i++) inv[i] = inv[mod%i] * (