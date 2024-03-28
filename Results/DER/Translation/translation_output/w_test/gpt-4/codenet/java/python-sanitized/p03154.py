import sys
from math import factorial

MOD = 1000000007

def modinv(a, mod=MOD):
    return pow(a, mod - 2, mod)

def enum_fif(n, mod=MOD):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i-1] * i % mod
    invf[n] = modinv(f[n])
    for i in range(n-1, -1, -1):
        invf[i] = invf[i+1] * (i+1) % mod
    return f, invf

def P(n, r, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][n-r] % MOD

def C(n, r, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * (fif[1][r] * fif[1][n-r] % MOD) % MOD

def solve(H, W, K):
    fif = enum_fif(20000005)
    ans = 0
    x = ((K+1)*(K+2)//2-1) % MOD
    for n in range(H+1):
        m = K-n
        if m >= 0 and m <= W:
            ans += P(H, n, fif) * P(W, m, fif) % MOD * \
                   (2*C(K+1, 3, fif) * C(K-2, m-1, fif) + x * C(K, m, fif)) % MOD;
            ans %= MOD
    return ans

if __name__ == "__main__":
    # Reading from standard input for test input and converting to integers
    H, W, K = map(int, sys.stdin.readline().split())
    print(solve(H, W, K))