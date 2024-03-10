import sys

n, k = map(int, sys.stdin.readline().split())

if k == 1:
    ans = 0
else:
    ans = n - k

print(ans)