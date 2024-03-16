def solve(n, m, mod):
    f = [1, 1] + [0] * (2*n + 1)
    for i in range(2, len(f)):
        f[i] = f[i - 1] + f[i - 2]
        if f[i] >= mod:
            f[i] -= mod
    
    prod = 1
    s = 0
    invs = enum_invs(n + 1, mod)
    for i in range(n - 1, -1, -1):
        s += f[2*i + 1] * prod
        s %= mod
        prod = prod * ((m + n - i - 1) % mod) % mod * invs[n - i] % mod

    ret = fib(m + 2*n, mod) - s
    ret %= mod
    if ret < 0:
        ret += mod

    return ret

def enum_invs(n, mod):
    inv = [0] * (n + 1)
    inv[1] = 1
    for i in range(2, n + 1):
        inv[i] = mod - (mod // i) * inv[mod % i] % mod
    
    return inv

def fib(n, mod):
    a, b, d = 1, 1, 0
    va, vb = 1, 0
    
    n -= 1
    while n > 0:
        if n & 1:
            nva = (a * va + b * vb) % mod
            nvb = (b * va + d * vb) % mod
            va, vb = nva, nvb
        
        na = (a*a + b*b) % mod
        nb = (b * (a + d)) % mod
        nd = (d*d + b*b) % mod
        a, b, d = na, nb, nd
        
        n >>= 1

    return va

if __name__ == "__main__":
    n, m = map(int, input().split())  # Assuming the input format will be two integers separated by space
    mod = 998244353
    result = solve(n - 1, m, mod)
    print(result)