def main():
    mod = 10**9+7
    n, m = map(int, input().split())
    dp = [[[0 for _ in range(2)] for _ in range(n+1)] for _ in range(2)]
    dp[0][0][1] = 1
    for i in range(1, n+1):
        dp[0][i][0] = 1
    for i in range(m):
        for j in range(n+1):
            for k in range(2):
                if j == 0:
                    if k == 0:
                        dp[(i+1)%2][0][0] = 0
                    else:
                        dp[(i+1)%2][0][1] = (dp[i%2][0][1] + (dp[i%2][1][0] + dp[i%2][1][1])%mod)%mod
                elif j == 1:
                    if k == 0:
                        if n < 2:
                            dp[(i+1)%2][j][k] = 0
                        else:
                            dp[(i+1)%2][1][0] = (dp[i%2][1][0]+dp[i%2][2][0])%mod
                    else:
                        if n < 2:
                            dp[(i+1)%2][1][1] = (dp[i%2][1][0] + (dp[i%2][1][1]+dp[i%2][0][1])%mod)%mod
                        else:
                            dp[(i+1)%2][1][1] = (((dp[i%2][1][0]+dp[i%2][0][1])%mod + dp[i%2][1][1]*2%mod)%mod + dp[i%2][2][1])%mod
                else:
                    dp[(i+1)%2][j][k] = (dp[i%2][j][k]+dp[i%2][j-1][k])%mod
                    if j+1 <= n:
                        dp[(i+1)%2][j][k] = (dp[(i+1)%2][j][k] + (dp[i%2][j][k]+dp[i%2][j+1][k])%mod)%mod
    ans = 0
    for i in range(n+1):
        ans = (ans + dp[m%2][i][1])%mod
    print(ans)

if __name__ == '__main__':
    main()