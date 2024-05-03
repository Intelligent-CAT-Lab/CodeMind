import sys

x, y, a, b = map(int, sys.stdin.readline().split())
res = []
for i in range(a, x+1):
    for j in range(b, y+1):
        if i <= j: continue
        res.append(f"{i} {j}")
print(len(res))
for str in res:
    print(str)