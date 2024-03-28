MOD = 1000000007

def solve(H, W, K):
    fif = enumFIF(20000005, MOD)
    ans = 0
    x = ((K + 1) * (K + 2) // 2 - 1) % MOD
    for n in range(H + 1):
        m = K - n
        if 0 <= m <= W:
            ans += P(H, n, fif) * P(W, m, fif) % MOD * (
                (2 * C(K + 1, 3, fif) * C(K - 2, m - 1, fif) + x * C(K, m, fif)) % MOD
            )
            ans %= MOD
    return ans

def C(n, r, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % MOD * fif[1][n - r] % MOD

def P(n, r, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][n - r] % MOD

def enumFIF(n, mod):
    f = [1] * (n + 1)
    invf = [1] * (n + 1)
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    a = f[n]
    b = mod
    p, q = 1, 0
    while b > 0:
        c, d = divmod(a, b)
        a, b = b, d
        p, q = q, p - c * q
    invf[n] = p + mod if p < 0 else p
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    return f, invf

# Sample test
if __name__ == "__main__":
    input_data = list(map(int, input().split()))
    H, W, K = input_data[0], input_data[1], input_data[2]
    print(solve(H, W, K))