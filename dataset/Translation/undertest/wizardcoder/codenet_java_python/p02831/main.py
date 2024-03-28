import math

A, B = map(int, input().split())

gcd = 0
for i in range(1, max(A, B)):
    if A % i == 0 and B % i == 0:
        gcd = i

lcm = A * B // gcd
print(lcm)