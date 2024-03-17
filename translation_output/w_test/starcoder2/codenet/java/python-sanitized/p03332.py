import sys

n, a, b, k = map(int, sys.stdin.readline().split())

M = 998244353

nck = [1] * (n + 1)
for i in range(1, n + 1):
    nck[i] = nck[i - 1] * (n - i + 1) * pow(i, M - 2, M) % M

ans = 0
for i in range(n + 1):
    if (k - a * i) % b == 0 and (k - a * i) // b <= n:
        ans += nck[i] * nck[(k - a * i) // b] % M

print(ans % M)