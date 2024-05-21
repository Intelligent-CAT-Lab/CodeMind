import sys

MOD = 100000007

def solve(x, y, z):
    n = 10
    mask = (1 << (x + y + z + 1)) - 1
    dp = [[0] * (mask + 1) for _ in range(n + 1)]
    ng = 1 << z | 1 << (y + z) | 1 << (x + y + z)
    dp[0][1] = 1
    for i in range(n):
        for state in range(mask + 1):
            for j in range(1, 11):
                res = ((state << j) & mask) + 1
                if (res & ng) == ng:
                    continue
                dp[i + 1][res] += dp[i][state]
                dp[i + 1][res] %= MOD
    ans = 1
    for i in range(n):
        ans *= 10
        ans %= MOD
    for i in range(mask + 1):
        ans -= dp[n][i]
        ans %= MOD
    return ans

def main():
    x, y, z = map(int, input().split())
    ans = solve(x, y, z)
    print(ans)

if __name__ == "__main__":
    sys.setrecursionlimit(10**6)
    main()