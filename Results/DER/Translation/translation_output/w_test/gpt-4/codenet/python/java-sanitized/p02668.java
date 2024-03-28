import java.io.*;
import java.util.*;

public class p02668 {
    static final int MOD = (int) 1e9 + 7;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        long[] pow2 = makePower(2, M + 10);
        long[] ipow2 = makePower((1 + MOD) / 2, M + 10);
        
        long[] dp = Arrays.copyOf(pow2, M + 1);
        for (int i = 0; i < N - 1; i++) {
            dp = update(dp, M, pow2, ipow2);
        }
        
        System.out.println(dp[M]);
    }
    
    static long[] makePower(int a, int L) {
        int B = Integer.toBinaryString(L).length();
        long[] x = new long[1 << B];
        x[0] = 1;
        long aLong = a;
        for (int n = 0; n < B; n++) {
            for (int i = 0; i < 1 << n; i++) {
                x[(1 << n) + i] = (x[i] * aLong) % MOD;
            }
            aLong *= aLong;
            aLong %= MOD;
        }
        return Arrays.copyOf(x, L);
    }
    
    static long[] update(long[] dp, int M, long[] pow2, long[] ipow2) {
        long[] B = Arrays.copyOf(dp, dp.length);
        long[] C = new long[M + 1];
        
        for (int i = 0; i <= M; i++) {
            C[i] = dp[i] * i % MOD * ipow2[i] % MOD;
        }
        
        for (int i = 1; i <= M; i++) {
            dp[i] = (dp[i-1] + C[i - 1]) % MOD;
        }

        for (int i = 1; i <= M; i++) {
            dp[i] *= pow2[i - 1];
            dp[i] %= MOD;
        }

        for (int i = 1; i <= M + 1; i++) {
            dp[i - 1] += (long) i * B[i - 1];
            dp[i - 1] %= MOD;
        }
        
        return dp;
    }
}