import sys

x, y, a, b = map(int, input().split())
res = []
for i in range(a, x + 1):
    for j in range(b, y + 1):
        if i <= j:
            continue
        res.append((i, j))
print(len(res))
for i, j in res:
    print(i, j)