import java.io.*;
import java.util.*;

public class p02715 {
    static int N, K;
    static long res = 0;
    static final int MOD = (int)1e9+7;

    public static void main(String[] args) throws IOException {
        N = in.iscan(); K = in.iscan(); 
        long[] x = new long[K+1];
        for (int i = K; i >= 1; i--) {
            x[i] = UTILITIES.fast_pow_mod(K/i, N, MOD);
            for (int j = i*2; j <= K; j += i) {
                x[i] -= x[j];
                if (x[i] < 0) x[i] += MOD;
            }
            res = (res + i*x[i]%MOD) % MOD;
        }
        out.println(res);
        out.close();
    } 
    
    static INPUT in = new INPUT(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    private static class INPUT {

        private InputStream stream;
        private byte[] buf =