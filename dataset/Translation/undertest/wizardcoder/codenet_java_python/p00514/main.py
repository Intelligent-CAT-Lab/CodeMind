import math

a, b, c = map(int, input().split())

if a*b > c:
    print(0)
    exit()

c -= a*b
d = c + a - 1

bi = 1

for i in range(c):
    bi *= d - i
    bi //= i + 1

print(bi)