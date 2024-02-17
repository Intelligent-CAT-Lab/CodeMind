from decimal import Decimal
A,B = list(map(str,input().split()))

A = int(A)
B = Decimal(B)

print((int(A * B)))