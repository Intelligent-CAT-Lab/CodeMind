from decimal import Decimal

a, b = map(Decimal, input().split())
result = a - b
print(int(result))