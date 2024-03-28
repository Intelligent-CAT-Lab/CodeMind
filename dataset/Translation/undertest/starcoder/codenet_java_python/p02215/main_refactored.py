class main:
    import sys
    
    MOD = 998244353
    
    def solve(N, X):
        dp = [[[0] * (X + 1) for _ in range(512)] for _ in range(2)]
        for i in range(X + 1):
            dp[0][i][i] = 1
        t = 1
        for i in range(1, N):
            t = 1 - t
            for j in range(512):
                for k in range(X + 1):
                    dp[t][j][k] = 0
                for k in range(X + 1):
                    sum = 0
                    for l in range(X + 1):
                        sum += dp[1 - t][j][l]
                        dp[t][j ^ k][l] += sum
                        dp[t][j ^ k][l] %= MOD
        ans = 0
        for i in range(X + 1):
            ans += dp[1 - t][X][i]
        return ans % MOD
    
    def main():
        N, X = map(int, sys.stdin.readline().strip().split())
        print(solve(N, X))
    
    if __name__ == '__main__':
        main()