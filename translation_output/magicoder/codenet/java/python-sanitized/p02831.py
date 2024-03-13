import math

A, B = map(int, input().split())

gcd = math.gcd(A, B)
lcm = A * B // gcd

print(lcm)