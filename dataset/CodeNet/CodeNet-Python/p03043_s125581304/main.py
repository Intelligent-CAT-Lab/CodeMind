import sys
import math
def input(): return sys.stdin.readline().strip()

mi = lambda: map(int, input().split())

N, K = mi()

ans = 0
for i in range(1,N+1):
  if i >= K:
    ans += 1
  else:
    ans += pow(1/2, math.ceil(math.log2(K/i)))

print(ans/N)