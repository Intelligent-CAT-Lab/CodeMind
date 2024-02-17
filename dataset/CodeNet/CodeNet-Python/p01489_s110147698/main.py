import sys
readline = sys.stdin.readline
write = sys.stdout.write

def fibonacci(N, M):
    RA = RD = 1; RB = RC = 0
    XA = XB = XC = 1; XD = 0
    while N:
        if N & 1:
            RA, RB, RC, RD = (RA*XA + RB*XC) % M, (RA*XB + RB*XD) % M, (RC*XA + RD*XC) % M, (RC*XB + RD*XD) % M
        XA, XB, XC, XD = (XA**2 + XB*XC) % M, XB*(XA + XD) % M, XC*(XA + XD) % M, (XB*XC + XD**2) % M
        N >>= 1
    return RC

def solve():
    MOD = 10**9 + 7
    K = int(readline())
    k0 = (int((1 + 4*K)**.5) - 1) // 2
    if k0**2 + k0 == K:
        k0 -= 1
    kk = k0**2+k0
    if K - kk > k0+1:
        m0 = 2*k0+1
        b = K - kk - (k0+1) - 1
    else:
        m0 = 2*k0
        b = K - kk - 1

    if k0//2+1 > b:
        v = fibonacci(2+2*b, MOD) * fibonacci(m0+2-2*b, MOD) % MOD
    else:
        b1 = k0+1 - b-1
        v = fibonacci(3+2*b1, MOD) * fibonacci(m0+1-2*b1, MOD) % MOD
    write("%d\n" % v)
solve()

