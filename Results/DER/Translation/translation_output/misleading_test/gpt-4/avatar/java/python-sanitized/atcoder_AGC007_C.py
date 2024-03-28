from decimal import Decimal, getcontext

getcontext().prec = 50  # Set precision for Decimal arithmetic

N, d, x = map(float, input().split())
ans = Decimal("0.0")

while N > 0.5:
    adnum = Decimal(d + x * (N - 0.5))
    ans += adnum
    d = (N +