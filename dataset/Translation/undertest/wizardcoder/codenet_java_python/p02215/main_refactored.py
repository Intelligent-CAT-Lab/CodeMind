class main:
    import sys
    
    MOD = 998244353
    
    def pow(x, n):
        if n == 0:
            return 1
        y = pow(x, n // 2)
        if n % 2 == 0:
            return (y * y) % MOD
        else:
            return ((x * y) * y) % MOD
    
    def main():
        N, X = map(int, input().split())
        dp = [[[0] * (X + 1) for _ in range(512)] for _ in range(2)]
        for i in range(X + 1):
            dp[0][i][i] = 1
        t = 1
        for i in range(1, N):
            for j in range(512):
                for k in range(X + 1):
                    dp[t][j][k] = 0
                    for l in range(X + 1):
                        dp[t][j][k] += dp[1 - t][j][l] * pow(2, X - l)
                        dp[t][j][k] %= MOD
            t = 1 - t
        ans = 0
        for i in range(X + 1):
            ans += dp[1 - t][X][i]
        print(ans % MOD)
    
    if __name__ == '__main__':
        main()