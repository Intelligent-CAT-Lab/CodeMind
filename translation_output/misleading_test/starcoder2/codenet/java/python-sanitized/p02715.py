import sys

N, K = map(int, sys.stdin.readline().split())

res = 0
MOD = 1000000007

for i in range(K, 0, -1):
    x = pow(K // i, N, MOD)
    for j in range(i * 2, K + 1, i):
        x -= x[j]
        if x < 0:
            x += MOD
    res = (res + i * x % MOD) % MOD

print(res)