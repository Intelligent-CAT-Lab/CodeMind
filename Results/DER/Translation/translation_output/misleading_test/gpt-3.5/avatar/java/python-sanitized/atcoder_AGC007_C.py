from decimal import Decimal, getcontext

def atcoder_AGC007_C(N, d, x):
    getcontext().prec = 28
    ans = Decimal("0.0")
    
    N = Decimal(N)
    d = Decimal(d)
    x = Decimal(x)

    while N > Decimal("0.5"):
        adnum = d + x * (N - Decimal("0.5"))
        ans += adnum
        d = (N + Decimal("