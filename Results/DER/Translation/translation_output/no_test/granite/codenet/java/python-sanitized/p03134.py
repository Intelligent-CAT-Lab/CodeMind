import sys

MOD = 998244353

def main():
    s = sys.stdin.readline().strip()
    n = len(s)
    r = s.count('1')
    b = s.count('2')
    dp = [[0] * (n + 1) for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        if s[i] == '0':
            r -= 1
            b -= 1
        elif s[i] == '1':
            r -= 1
        else:
            b -= 1
        for j in range(i + 1):
            if j < r:
                dp[i + 1][j + 1] += dp[i][j]
                dp[i + 1][j + 1] %= MOD
            if j < b:
                dp[i + 1][j] += dp[i][j]
                dp[i + 1][j] %= MOD
    c = [[0] * (n + 1) for _ in range(n + 1)]
    for i in range(n + 1):
        c[i][0] = 1
        c[i][i] = 1
    for i in range(2, n + 1):
        for j in range(1, i):
            c[i][j] = (c[i - 1][j - 1] + c[i - 1][j]) % MOD
    ans = 0
    for i in range(min(r, n) + 1):
        ans += dp[n][i] * c[n][r - i]
        ans %= MOD
    print(ans)

if __name__ == '__main__':
    main()