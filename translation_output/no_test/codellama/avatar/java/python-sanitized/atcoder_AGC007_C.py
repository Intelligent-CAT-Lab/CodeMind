import math
import decimal

def main():
    N = float(input("Enter N: "))
    d = float(input("Enter d: "))
    x = float(input("Enter x: "))

    ans = decimal.Decimal("0.0")

    while N > 0.5:
        adnum = decimal.Decimal(d + x * (N - 0.5))
        ans += adnum
        d = (N +