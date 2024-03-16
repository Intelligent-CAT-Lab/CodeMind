MOD = 10**9 + 7

def main():
    N = int(input())
    n = [0] * 61
    for i in range(61):
        n[i] = N % 2
        N //= 2
    dp = [[0] * 3 for _ in range(61)]
    if n[60] == 0:
        dp[60][0] = 1
    else:
        dp[60][0] = 1
        dp[60][1] = 1
    for i in range(59, -1, -1):
        dp[i][2] = (3 * dp[i + 1][2]) % MOD
        for j in range(3):
            c = 2 + n[i] - j
            if c >= 2:
                dp[i][2] = (dp[i][2] + dp[i + 1][1]) % MOD
            else:
                dp[i][c] = (dp[i][c] + dp[i + 1][1]) % MOD
        for j in range(3):
            c = n[i] - j
            if c >= 0:
                dp[i][c] = (dp[i][c] + dp[i + 1][0]) % MOD
    ans = dp[0][0]
    ans = (ans + dp[0][1]) % MOD
    ans = (ans + dp[0][2]) % MOD
    print(ans)

if __name__ == '__main__':
    main()