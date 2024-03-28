import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p02636 {

    private static final int MOD = 998244353;
    private static final int N = 2000;
    private static long[] g1 = new long[N+1];
    private static long[] g2 = new long[N+1];
    private static long[] inverse = new long[N+1];

    static {
        g1[0] = g1[1] = 1;
        g2[0] = g2[1] = 1;
        inverse[1] = 1;
        for (int i = 2; i <= N; i++) {
            g1[i] = (g1[i - 1] * i) % MOD;
            inverse[i] = MOD - (inverse[MOD % i] * (MOD / i)) % MOD;
            g2[i] = (g2[i - 1] * inverse[i]) % MOD;
        }
    }

    private static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int N = S.length();
        
        if (N == 1) {
            System.out.println(1);
            return;
        }

        long[][][] dp = new long[N + 1][N + 2][N + 2];
        long[][][] dpf = new long[N + 1][N + 2][N + 2];
        for (long[][] d : dp)
            for (long[] dd : d)
                Arrays.fill(dd, -1000000000000000L);
        for (long[][] d : dpf)
            for (long[] dd : d)
                Arrays.fill(dd, -1000000000000000L);

        dpf[0][0][0] = 1;
        if (S.charAt(0) == '0') {
            dp[1][1][0] = 0;
        }
        if (S.charAt(1) == '0') {
            dp[1][1][0] = 0;
        }
        if (S.charAt(0) == '1') {
            dp[1][0][1] = 0;
        }
        if (S.charAt(1) == '1') {
            dp[1][0][1] = 0;
        }
        dpf[1][0][0] = 2;

        //