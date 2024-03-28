import sys

n, p = map(int, sys.stdin.readline().split())

if n == 1:
    print(p)
    exit()

res = 1
for i in range(2, int(p ** (1 / n)) + 1):
    if p % (i ** n) == 0:
        res = i

print(res)