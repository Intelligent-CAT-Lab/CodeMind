def solve(n, x, y, z):
    MOD = 1_000_000_007
    sum_ = x + y + z + 1
    mask = (1 << sum_) - 1
    ng = (1 << z) | (1 << (y + z)) | (1 << (x + y + z))
    dp = [[0] * (mask + 1) for _ in range(n + 1)]
    dp[0][1] = 1

    for i in range(n):
        for state in range(mask + 1):
            for j in range(1, 11):
                res = ((state << j) & mask) + 1
                if (res & ng) == ng:
                    continue
                dp[i + 1][res] += dp[i][state]
                dp[i + 1][res] %= MOD

    ans = pow(10, n, MOD)

    for i in range(mask + 1):
        ans -= dp[n][i]
        ans %= MOD

    return (ans + MOD) % MOD

if __name__ == "__main__":
    n, x, y, z = map(int, input().split())
    result = solve(n, x, y, z)
    print(result)