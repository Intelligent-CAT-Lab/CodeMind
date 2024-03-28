import sys

def solve():
    n, x, y, z = map(int, input().split())
    sum = x + y + z + 1
    mask = (1 << sum) - 1
    dp = [[0] * (mask + 1) for _ in range(n + 1)]
    ng = 1 << z
    ng |= 1 << (y + z)
    ng |= 1 << (x + y + z)
    dp[0][1] = 1
    for i in range(1, n + 1):
        for state in range(0, mask + 1):
            for j in range(1, 11):
                res = ((state << j) & mask) + 1
                if ((res & ng) == ng):
                    continue
                dp[i][res] += dp[i - 1][state]
                dp[i][res] %= 1000000007
    ans = 1
    for i in range(1, n + 1):
        ans *= 10
        ans %= 1000000007
    for i in range(0, mask + 1):
        ans -= dp[n][i]
        ans %= 1000000007
    print((ans + 1000000007) % 1000000007)

if __name__ == "__main__":
    solve()