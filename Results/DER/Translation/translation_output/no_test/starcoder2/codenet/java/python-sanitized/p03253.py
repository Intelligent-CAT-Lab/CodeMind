import math
MOD = 1000000007
n = int(input())
m = int(input())
res = m
ans = 1
for i in range(2, int(math.sqrt(res)) + 1):
    cnt = 0
    while res % i == 0:
        cnt += 1
        res //= i
    ans *= math.comb(cnt + n - 1, n - 1)
    ans %= MOD
if res != 1:
    ans *= math.comb(n, 1)
    ans %= MOD
print(ans)