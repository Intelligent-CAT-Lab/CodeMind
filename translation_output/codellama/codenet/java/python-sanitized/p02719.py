import math

n = int(input())
k = int(input())
ans = min(n % k, k - (n % k))
print(ans)