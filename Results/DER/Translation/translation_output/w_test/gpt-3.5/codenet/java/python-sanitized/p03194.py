import math

n, p = map(int, input().split())

if n == 1:
    print(p)
    exit()

res = 1
for i in range(2, p):
    if pow(i, n) > p:
        break
    if p % pow(i, n) == 0:
        res = i

print(res)