def solve(n, m, k):
    mod = 1000000007
    fif = enum_fif(1000000, mod)

    xsum = 0
    ysum = 0

    xa = C(n*m-2, k-2, mod, fif) * fif[0][k-2] % mod
    xb = 0
    for i in range(m):
        tmp = i * (m-i) * n * n * 2 % mod
        xb = (xb + tmp) % mod
    xc = xa * xb * C(k, 2, mod, fif) % mod
    xsum = xc * fif[1][k] % mod

    ya = C(n*m-2, k-2, mod, fif) * fif[0][k-2] % mod
    yb = 0
    for i in range(n):
        tmp = i * (n-i) * m * m * 2 % mod
        yb = (yb + tmp) % mod
    yc = ya * yb * C(k, 2, mod, fif) % mod
    ysum = yc * fif[1][k] % mod

    return (xsum + ysum) % mod

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod

def enum_fif(n, mod):
    f = [0] * (n+1)
    invf = [0] * (n+1)
    f[0] = 1
    for i in range(1, n+1):
        f[i] = f[i-1] * i % mod
    a = f[n]
    b = mod
    p = 1
    q = 0
    while b > 0:
        c = a // b
        a, b = b, a % b
        p, q = q, p - c * q
    invf[n] = p + mod if p < 0 else p
    for i in range(n-1, -1, -1):
        invf[i] = invf[i+1] * (i+1) % mod
    return [f, invf]

# Example test case, input: 2 2 2, expected output: 8
if __name__ == "__main__":
    n, m, k = map(int, input().split())
    print(solve(n, m, k))