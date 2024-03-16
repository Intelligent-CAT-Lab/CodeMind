import math

n = int(input())
p = int(input())

if n == 1:
    print(p)
    return

res = 1
for i in range(2, int(math.pow(n, n))):
    if p % math.pow(i, n) == 0:
        res = i

print(res)