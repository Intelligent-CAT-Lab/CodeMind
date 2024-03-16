MOD = 998244353

def solve():
    n = ni() - 1
    m = nl()
    f = [0] * (2*n + 3)
    f[0] = f[1] = 1
    for i in range(2, len(f)):
        f[i] = f[i-1] + f[i-2]
        if f[i] >= MOD:
            f[i] -= MOD
    
    prod = 1
    s = 0
    invs = enumInvs(n+1, MOD)
    for i in range(n-1, -1, -1):
        s += f[2*i+1] * prod
        s %= MOD
        prod = prod * ((m+n-i-1) % MOD) * invs[n-i] % MOD
    
    ret = fib(m+2*n, MOD) - s
    ret %= MOD
    if ret < 0:
        ret += MOD
    print(ret)

    
def enumInvs(n, mod):
    inv = [0] * (n + 1)
    inv[1] = 1
    for i in range(2, n+1):
        inv[i] = (inv[mod % i] * (mod - mod // i)) % mod
    return inv

    
def fib(n, mod):
    a, b, d = 1, 1, 0
    va, vb = 1, 0
    
    for _ in range(n-1):
        if n & 1 == 1:
            nva = (a*va + b*vb) % mod
            nvb = (b*va + d*vb) % mod
            va, vb = nva, nvb
        
        na = (a*a + b*b) % mod
        nb = (b*(a+d)) % mod
        nd = (d*d + b*b) % mod
        a, b, d = na, nb, nd
    
    return va

    
def ni():
    return int(input())

def nl():
    return int(input())

solve()