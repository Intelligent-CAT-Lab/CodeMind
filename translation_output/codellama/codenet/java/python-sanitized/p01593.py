import math
import sys

EPS = 1e-12

n, m = map(int, input().split())

dp = [1] + [0] * n
for j in range(1, n + 1):
    for i in range(1, min(m, j) + 1):
        dp[j] += dp[j - i] / j

print(f"{dp[n]:.12f}")