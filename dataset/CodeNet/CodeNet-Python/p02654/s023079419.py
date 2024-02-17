def prepare(n, MOD):
    factorials = [1] * (n + 1)
    for i in range(2, n + 1):
        factorials[i] = factorials[i - 1] * i % MOD
    finvs = [1] * (n + 1)
    finvs[n] = pow(factorials[n], MOD - 2, MOD)
    for i in range(n, 1, -1):
        finvs[i - 1] = finvs[i] * i % MOD
    return factorials, finvs


def solve(n, a):
    MOD = 10 ** 9 + 7
    facts, finvs = prepare(n, MOD)
    invs = [facts[i - 1] * finvs[i] % MOD for i in range(n + 1)]  # invs[0]: undefined
    r = n - a

    ans = 0
    # a個がいずれも自己ループを持たないパターン
    for l in range(a):
        tmp1 = facts[a] * finvs[l] % MOD * finvs[a - l] % MOD
        tmp2 = facts[n - l - 1] * (a - l) % MOD
        ans = (ans + (-1) ** (l & 1) * tmp1 * tmp2) % MOD

    # a個中k+1個目ではじめて自己ループを持つが、それまでのk個で全点灯できるパターン
    for k in range(1, a):
        for l in range(k):
            tmp1 = facts[k] * finvs[l] % MOD * finvs[k - l] % MOD
            tmp2 = facts[n - l - 1] * (k - l) % MOD * invs[r + k - l] % MOD
            ans = (ans + (-1) ** (l & 1) * tmp1 * tmp2) % MOD

    return ans


n, a = map(int, input().split())
print(solve(n, a))
