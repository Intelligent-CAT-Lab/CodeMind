from sys import stdin
from decimal import Decimal

for line in stdin:
    a, b = map(int, line.split())
    print(Decimal(a) % Decimal(b))