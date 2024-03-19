import sys

a, b = map(float, sys.stdin.readline().split())
bb = int(100 * b + 0.1)
ans = int(a * bb / 100)
print(ans)