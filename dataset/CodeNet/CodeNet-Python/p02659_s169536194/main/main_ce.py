from decimal import Decimal
A,B = list(map(str,"198 1.10".split()))
A = int(A)
B = Decimal(B)
print((int(A * B)))