import math
import sys

r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())

x = abs(a1 - b1)
y = abs(a2 - b2)

x = min(x, r - x)
y = min(y, c - y)

z = 1
if x == r - x:
    z *= 2
if y == c - y:
    z *= 2

b = 1
for i in range(min(x, y)):
    b *= (x + y - i) // (i + 1)

print(b * z % 100000007)