def main():
    import sys
    input = sys.stdin.readline
    mod = 10**9 + 7
    s = "??2??5".rstrip()
    n = len(s)
    dp = [[0]*13 for _ in range(n)]
    if s[-1]=='?':
        for i in range(10):
            dp[0][i] = 1
    else:
        a = int(s[-1])
        dp[0][a] = 1
    a = 1
    for i in range(1, n):
        a = 10 * a % 13
        if s[-(i+1)] == '?':
            for j in range(10):
                for k in range(13):
                    dp[i][(a*j+k)%13] += dp[i-1][k] % mod
        else:
            j = int(s[-(i+1)])
            for k in range(13):
                dp[i][(a*j+k)%13] += dp[i-1][k] % mod
    print(dp[-1][5]%mod)
if __name__ == '__main__':
    main()
