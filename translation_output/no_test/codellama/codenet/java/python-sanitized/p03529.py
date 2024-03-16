import java.util.*;

class p03529:
    static long powerMod(long x, long exponent):
        long prod = 1
        for i in range(63, -1, -1):
            prod = (prod * prod) % MOD
            if (exponent & 1L << i) != 0:
                prod = (prod * x) % MOD
        return prod

    static int f(int n, int k):
        int t = 0
        for i in range(n, 1, -1):
            t += (t + i) / i
        return t

    static final long MOD = 1000000007

    public static void main(String[] args):
        Scanner scan = new Scanner(System.in)
        int n = scan.nextInt()
        int k = scan.nextInt()
        int x = 0
        int l = f(n, k)
        long[][] dp = new long[n + 1][l + 1]
        for i in range(1, n + 1):
            long m = powerMod(k + 1, i - 1)
            for u in range(0, l + 1):
                long t = 0
                for j in range(0, min(i, k) + 1):
                    if u + (u + j) / i <= l:
                        t += dp[i - 1][u + (u + j) / i]
                        t += ((u + j) % i) * m % MOD
                        t %= MOD
                for j in range(min(i, k) + 1, k + 1):
                    t = (t + dp[i - 1][u] + (j + u) * m) % MOD
                dp[i][u] = t
        print(dp[n][0])