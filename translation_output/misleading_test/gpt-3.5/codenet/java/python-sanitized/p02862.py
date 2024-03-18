mod = 10**9 + 7

def C(n, r):
    if n < 0 or r < 0 or r > n:
        return 0
    return (fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod)

def enumFIF(n):
    f = [0] * (n + 1)
    invf = [0] * (n + 1)
    f[0] = 1
    for i in range(1, n + 1):
        f[i] = f[i - 1] * i % mod
    a = f[n]
    b = mod
    p, q = 1, 0
    while b > 0:
        c = a // b
        d = a
        a = b
        b = d % b
        d = p
        p = q
        q = d - c * q
    invf[n] = p + mod if p < 0 else p
    for i in range(n - 1, -1, -1):
        invf[i] = invf[i + 1] * (i + 1) % mod
    return f, invf

fif = enumFIF(3000000)

def solve():
    x, y = map(int, input().split())
    if (2*y - x) % 3 != 0 or 2*y - x < 0:
        print(0)
        return
    a = (2*y - x) // 3
    if (2*x - y) % 3 != 0 or 2*x - y < 0:
        print(0)
        return
    b = (2*x - y) // 3
    print(C(a + b, a))

if __name__ == "__main__":
    solve()