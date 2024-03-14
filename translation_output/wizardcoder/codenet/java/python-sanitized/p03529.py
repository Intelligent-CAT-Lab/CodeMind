import java.util.*;

class p03529:
    @staticmethod
    def powerMod(x, exponent):
        MOD = 1000000007
        prod = 1
        for i in range(63, -1, -1):
            prod = (prod * prod) % MOD
            if (exponent & 1L << i)!= 0:
                prod = (prod * x) % MOD
        return prod
    
    @staticmethod
    def f(n, k):
        t = 0
        for i in range(n, 0, -1):
            t += (t + i) // i
        return t
    
    MOD = 1000000007
    
    @staticmethod
    def main(args):
        scan = Scanner(System.in)
        n = scan.nextInt()
        k = scan.nextInt()
        x = 0
        l = p03529.f(n, k)
        dp = [[0] * (l + 1) for _ in range(n + 1)]
        for i in range(1, n + 1):
            m = p03529.powerMod(k + 1, i - 1)
            for u in range(l + 1):
                t = 0
                for j in range(0, min(i, k) + 1):
                    if u + (u + j) // i <= l:
                        t += dp[i - 1][u + (u + j) // i]
                        t += ((u + j) % i) * m % MOD
                        t %= MOD
                for j in range(min(i, k) + 1, k + 1):
                    t = (t + dp[i - 1][u] + (j + u) * m) % MOD
                dp[i][u] = t
        print(dp[n][0])