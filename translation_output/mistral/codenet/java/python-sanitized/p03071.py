import sys

A = int(input())
B = int(input())
c = 0

for i in range(2):
    if A >= B:
        c += A
        A = A - 1
    else:
        c += B
        B = B - 1

print(c)