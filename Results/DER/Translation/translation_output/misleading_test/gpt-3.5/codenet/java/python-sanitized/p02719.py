import math

n, k = map(int, input().split())
ans = min(n%k, k-(n%k))
print(ans)