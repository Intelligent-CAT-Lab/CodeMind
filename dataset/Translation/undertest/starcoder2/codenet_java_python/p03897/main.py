import sys

n = int(sys.stdin.readline())

ans = set()
for i in range(1, n, 2):
    ans.add((i, 0))
    ans.add((0, i))

for i in range(n % 2, n, 2):
    ans.add((i, n - 1))
    ans.add((n - 1, i))

offset = 0
d = 2
for _ in range(10):
    for i in range(1, n, 2 * d):
        for j in range(offset, n, 2 * d):
            ans.add((i, j))
    for i in range(d + 1, n, 2 * d):
        for j in range(offset + d, n, 2 * d):
            ans.add((i, j))

    offset += d
    d *= 2

print(len(ans))
for x, y in ans:
    print(x, y)