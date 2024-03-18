import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int MOD = (int) 1e9 + 7;
        long[] fact = new long[N + 1];
        long[] frev = new long[N + 1];
        long[] dp = new long[N + 1];
        
        dp[0] = 1;
        
        for (int i = 1; i <= N; i++) {
            long v = fact[i] = (fact[i - 1] * i) % MOD;
            frev[i] = pow(v, MOD - 2, MOD);
        }
        
        Long[] Y = new Long[N + 1];
        for (int g = A; g <= Math.min(N / C, B); g++) {
            int p = C * g;
            int q = D * g;
            long y = frev[g];
            for (int j = C; j <= Math.min(D, N / g); j++) {
                for (int i = p; i <= N; i += g) {
                    int minq = Math.min(q, i);
                    for (int k = p; k <= minq; k += g) {
                        dp[i] = (dp[i] + (frev[N - i] * dp[i - j] * fact[N - i + j] * Y[j])) % MOD;
                    }
                }
            }
        }
        
        System.out.println(dp[N] % MOD);
    }
    
    static long pow(long base, long exp, long mod) {
        long res = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}