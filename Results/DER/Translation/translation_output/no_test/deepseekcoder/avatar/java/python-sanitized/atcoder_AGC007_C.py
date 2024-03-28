import decimal
import sys

def solve():
    N = float(input())
    d = float(input())
    x = float(input())

    ans = decimal.Decimal(0.0)
    decimal.getcontext().prec = 20

    while N > 0.5:
        adnum = decimal.Decimal(d + x * (N - 0.5))
        ans += adnum
        d = (N +