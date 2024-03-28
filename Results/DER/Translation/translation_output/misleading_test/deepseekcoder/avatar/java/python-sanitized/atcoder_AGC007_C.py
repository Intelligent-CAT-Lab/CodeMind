import decimal

def solve():
    N, d, x = map(decimal.Decimal, input().split())

    ans = decimal.Decimal(0.0)
    decimal.getcontext().prec = 20

    while N > decimal.Decimal(0.5):
        adnum = d + x * (N - decimal.Decimal(0.5))
        ans += adnum
        d = (N + decimal.Decimal(