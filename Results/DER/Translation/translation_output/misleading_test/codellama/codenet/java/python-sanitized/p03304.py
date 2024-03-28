import math

n = int(input())
m = int(input())
d = int(input())

s = d if d == 0 else (n - d) * 2
print((s / n / n) * (m - 1))