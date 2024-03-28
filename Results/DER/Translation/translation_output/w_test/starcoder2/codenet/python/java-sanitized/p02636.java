import java.util.*;
import java.io.*;

public class p02636 {
    static int mod = 998244353;
    static int N = 2*1000;
    static long[] g1 = new long[N+1];
    static long[] g2 = new long[N+1];
    static long[] inverse = new long[N+1];
    static long[][][] dp = new long[N+1][N+2][N+2];
    static long[][][] dpf = new long[N+1][N+2][N+2];
    static long[][][] data = new long[N+1][N+2][N+2];
    static long ans = 0;
    static int Zero = 0;
    static int One = 0;
    static int zero = 0;
    static int one = 0;
    static int n = 0;
    static String S = "";
    static String[] s = new String[N];
    static Set<String> check = new HashSet<>();
    static Set<String> ncheck = new HashSet<>();
    static long cmb(int n, int r, int mod) {
        if ( r<0 || r>n ) {
            return 0;
        }
        r = Math.min(r, n-r);
        return g1[n] * g2[r] * g2[n-r] % mod;
    }
    static void init() {
        g1[0] = 1;
        g2[0] = 1;
        inverse[0] = 0;
        for (int i = 1; i <= N; i++) {
            g1[i] = (g1[i-1] * i) % mod;
            inverse[i] = ( -inverse[mod % i] * (mod/i) ) % mod;
            g2[i] = (g2[i-1] * inverse[i]) % mod;
        }
    }
    static void init_dp() {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
                    dp[i][j][k] = -1000000000000000000L;
                    dpf[i][j][k] = -1000000000000000000L;
                    data[i][j][k] = 0;
                }
            }
        }
    }
    static void init_check() {
        check.clear();
        ncheck.clear();
    }
    static void init_ans() {
        ans = 0;
    }
    static void init_Zero() {
        Zero = 0;
    }
    static void