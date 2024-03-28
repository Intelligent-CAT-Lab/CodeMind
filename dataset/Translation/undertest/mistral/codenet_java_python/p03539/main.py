import sys

def cnt(a, n, k, sum):
    if a == n:
        return sum
    f = 0
    for i in range(k+1):
        f += cnt(a+1, n, k, sum+i)
    return f

n, k = map(int, sys.stdin.readline().strip().split())
pownk1 = 1
for i in range(1, n):
    pownk1 *= (k+1)
    pownk1 %= 1000000007

total = 0
for i in range(k+1):
    total += i * pownk1 % 1000000007
    total %= 1000000007

total *= n
total %= 1000000007

maxha = 100000
dp = [[0 for j in range(maxha+1)] for i in range(n+1)]
dp[n][0] = 1

for head in range(n-1, -1, -1):
    for ha in range(maxha):
        base = dp[head][ha]
        if base == 0:
            continue
        for l in range(k+1):
            if l <= head:
                canha = (ha + l) // head
                dp[head-1][ha+canha] += base
                dp[head-1][ha+canha] %= 1000000007
            else:
                dp[head-1][ha] += base
                dp[head-1][ha] %= 1000000007

for i in range(maxha):
    dec = dp[0][i] * i % 1000000007
    total += 1000000007 - dec
    total %= 1000000007

print(total)