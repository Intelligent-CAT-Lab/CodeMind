n, m = map(int, "2 2".split())
ans1 = 1
ans2 = 1
mod = 10**9 + 7
if abs(n-m) >= 2:
    print(0)
    exit()
for i in range(1, n+1):
    ans1 *= i
    ans1 %= mod
for j in range(1, m+1):
    ans2 *= j
    ans2 %= mod
if abs(m-n) == 1:
    print(ans1 * ans2 % mod)
else:
    print(2 * ans1 * ans2 % mod)