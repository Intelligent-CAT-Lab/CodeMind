import sys

N, K = map(int, sys.stdin.readline().split())
MOD = 10**9 + 7
res = 0
x = [0] * (K + 1)
for i in range(K, 0, -1):
    x[i] = pow(K // i, N, MOD)
    for j in range(i * 2, K + 1, i):
        x[i] -= x[j]
        if x[i] < 0:
            x[i] += MOD
    res = (res + i * x[i] % MOD) % MOD
print(res)