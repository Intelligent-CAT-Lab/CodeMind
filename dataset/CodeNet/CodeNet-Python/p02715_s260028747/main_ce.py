import math
mod = 10**9+7
n, k = map(int, "3 2".split())
cnt = [0]*(k+1)
for i in range(1, k+1):
    cnt[i] = pow(math.floor(k/i), n, mod)
for i in range(k+1, 0, -1):
    j = 2
    while i*j <= k:
        cnt[i] -= cnt[i*j]
        cnt[i] %= mod
        j += 1
ans = 0
for i in range(1, k+1):
    ans += cnt[i]*i
    ans %= mod
print(ans)
