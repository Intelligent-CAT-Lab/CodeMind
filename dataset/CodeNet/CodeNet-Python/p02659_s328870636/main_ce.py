from decimal import Decimal
a, b = "198 1.10".split()
a = int(a)
b = Decimal(b)
print(int(a * b))
