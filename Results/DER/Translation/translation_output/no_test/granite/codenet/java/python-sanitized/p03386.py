import sys

a, b, k = map(int, sys.stdin.readline().split())

s = set()

for i in range(a, b + 1):
    s.add(i)
    if len(s) == k:
        break

for i in range(b, a - 1, -1):
    s.add(i)
    if len(s) == k:
        break

for i in sorted(s):
    print(i)