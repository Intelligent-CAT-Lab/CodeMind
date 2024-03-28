import sys

sys.setrecursionlimit(1000000)

n, h, d = map(int, input().split())
mod = 10 ** 9 + 7
fact = [1] * (n + 1)
for i in range(1, n + 1):
    fact[i] = fact[i - 1] * i % mod

dp = [0] * (h + 1)
dp[0] = fact[n]
fact_sum = 0
for i in range(1, n + 1):
    fact_sum = (fact_sum + fact[i]) % mod

pre_dp_sum = [0] * (h + 1)
pre_dp_sum[0] = dp[0]
for i in range(1, h + 1):
    dp[i] = pre_dp_sum[i - 1]
    if i - d - 1 >= 0:
        dp[i] = (dp[i] - pre_dp_sum[i - d - 1]) % mod
    if i < h:
        dp[i]