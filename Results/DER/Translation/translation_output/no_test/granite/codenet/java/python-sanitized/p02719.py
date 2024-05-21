import sys

n, k = map(int, sys.stdin.readline().split())
ans = min(n % k, k - (n % k))
print(ans)