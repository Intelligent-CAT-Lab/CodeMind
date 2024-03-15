from decimal import Decimal, getcontext

# Set precision for Decimal
getcontext().prec = 50

# Read inputs
N = float(input())
d = Decimal(input())
x = Decimal(input())

ans = Decimal('0.0')

while N > 0.5:
    adnum = Decimal(d + x * (N - 0.5))
    ans += adnum
    d = (N +