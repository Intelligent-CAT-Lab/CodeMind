import math

n, k = map(int, input().split())

if k >= n:
    print(math.comb(n + n - 1, n - 1, mod=1000000007))
else:
    ans = 0
    for i in range(k + 1):
        up = math.comb(n, i, mod=1000000007) * math.comb(n - 1, i, mod=1000000007)
        down = math.comb(n, i, mod=1000000007) * math.comb(n - 1, i, mod=1000000007)
        ans += up * down
        ans %= 1000000007
    print(ans)