class main:
    import sys
    
    MOD = 998244353
    
    def solve(N, X):
        dp = [[[0]*(X+1) for _ in range(512)] for _ in range(2)]
        for i in range(X+1):
            dp[0][i][i] = 1
        t = 1
        for i in range(1, N):
            for j in range(512):
                dp[t][j] = [0]*(X+1)
            for j in range(512):
                s = sum(dp[1-t][j][:X+1])
                for k in range(X+1):
                    dp[t][j^k][k] += s
                    dp[t][j^k][k] %= MOD
            t = 1 - t
        ans = sum(dp[1-t][X][:X+1])
        return ans % MOD
    
    N, X = map(int, sys.stdin.readline().split())
    print(solve(N, X))