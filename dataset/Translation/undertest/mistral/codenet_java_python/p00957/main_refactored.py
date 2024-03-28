class main:
    import sys
    
    def input():
        global n, k
        n = int(input())
        k = int(input())
        dp = [[0 for _ in range(n+1)] for _ in range(2)]
        dp[0][0] = 1
        for i in range(1, n+1):
            dp[0][i] += dp[1][i-1]
            dp[1][i] += dp[0][i-1]
            if i >= k:
                dp[1][i] += dp[0][i-k]
        ans = 0
        for i in range(1, n+1):
            ans += dp[1][i]
        print(ans)
    
    input()