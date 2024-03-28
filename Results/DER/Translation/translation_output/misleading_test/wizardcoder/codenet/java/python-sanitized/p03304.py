import math

n, m, d = map(int, input().split())

if d == 0:
    s = n
else:
    s = (n - d) * 2

result = s / n / n * (m - 1)

print(result)