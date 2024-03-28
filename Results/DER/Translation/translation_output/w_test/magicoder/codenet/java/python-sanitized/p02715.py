import sys

N, K = map(int, sys.stdin.readline().split())
res = 0
MOD = int(1e9+7)

x = [0]*(K+1)
for i in range(K, 0, -1):
    x[i] = pow(K//i, N, MOD)
    for j in range(i*2, K+1, i):
        x[i] -= x[j]
        if x[i] < 0: