MOD = 1000000007

def main():
    n, m, k = map(int, input().split())
    
    fact = [0] * (n + m + 2 * k + 1)
    fact[0] = 1
    fact[1] = 1
    for i in range(2, n + m + 2 * k + 1):
        fact[i] = (i * fact[i - 1]) % MOD

    ans = 0
    for i in range(k + 1):
        a = 1
        b = 1
        j = k - i
        if i >= 1:
            a = (nCk(n + 2 * i, i, fact) - nCk(n + 2 * i, i - 1, fact)) % MOD
        if j >= 1:
            b = (nCk(m + 2 * j, j, fact) - nCk(m + 2 * j, j - 1, fact)) % MOD
        ans += (nCk(n + m + 2 * k, n + 2 * i, fact) * a * b) % MOD
        ans %= MOD

    while ans < 0:
        ans += MOD
    print(ans)

def nCk(n, k, fact):
    if n < k:
        return 0
    else:
        return (fact[n] * inv(fact[n - k], MOD) * inv(fact[k], MOD)) % MOD

def inv(a, mod):
    a = a % mod
    b = mod
    p, q = 1, 0

    while b > 1:
        c = b // a
        b = b % a
        q = q - p * c
        d = b
        b = a
        a = d
        d = p
        p = q
        q = d
    while q < 0:
        q += mod
    return q % MOD

if __name__ == "__main__":
    main()