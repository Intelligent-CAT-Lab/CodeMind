class main:
    import sys
    
    def solve(S):
        S = "0" + S
        N = len(S)
        dp = [[float('inf')] * 2 for _ in range(N + 1)]
        dp[N][0] = int(S[0])
        dp[N][1] = 10 - int(S[0])
    
        for i in range(N - 1, -1, -1):
            for j in range(2):
                for k in range(10):
                    tmp = int(S[i]) + j
                    tmp = k - tmp
                    if tmp < 0:
                        dp[i][1] = min(dp[i][1], dp[i + 1][j] + tmp + 10 + k)
                    else:
                        dp[i][0] = min(dp[i][0], dp[i + 1][j] + tmp + k)
    
        return dp[0][0]
    
    S = sys.stdin.readline().rstrip()
    print(solve(S))