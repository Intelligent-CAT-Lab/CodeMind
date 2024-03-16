import math
import decimal

def main():
    N = float(input())
    d = float(input())
    x = float(input())

    ans = decimal.Decimal('0.0')

    while N > 0.5:
        adnum = decimal.Decimal(d + x * (N - 0.5))
        ans = ans + adnum
        d = (N +