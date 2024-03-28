MOD = 1000000007

def solve():
    n = int(input())
    dp = [1, 0, 0]

    inv = [0] * (n + 7)
    inv[1] = 1
    for x in range(2, len(inv)):
        inv[x] = MOD - (MOD // x) * inv[MOD % x] % MOD

    coef = 1
    ret = 0
    for k in range(1, n + 1):
        nxt = [0, 0, 0]
        for j1 in range(3):
            for j2 in range(3):
                if j1 != j2:
                    nxt[j2] += dp[j1]
                    if nxt[j2] >= MOD:
                        nxt[j2] -= MOD

        dp = nxt

        coef = (coef * (n - k + 1) % MOD) * inv[k] % MOD

        ways = (dp[1] * coef % MOD)

        delta = (inv[3] * inv[n] % MOD * inv[k] % MOD * ways % MOD)

        ret += delta

    ret %= MOD

    for i in range(1, n):
        ret = ret * inv[3] % MOD

    print(ret)

if __name__ == "__main__":
    solve()