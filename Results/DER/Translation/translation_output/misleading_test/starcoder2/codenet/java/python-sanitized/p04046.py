import sys

h, w, a, b = map(int, sys.stdin.readline().split())

mod = 1000000007

fac = [1] * (200005)
inv = [1] * (200005)

for i in range(1, 200005):
    fac[i] = fac[i - 1] * i % mod

inv[200004] = pow(fac[200004], mod - 2, mod)

for i in range(200003, -1, -1):
    inv[i] = inv[i + 1] * (i + 1) % mod

def comb(n, k):
    if n < k:
        return 0
    return fac[n] * inv[k] % mod * inv[n - k] % mod

res = 0
for i in range(h - a):
    res += comb(b - 1 + i, i) * comb(w - b - 1 + h - 1 - i, h - 1 - i) % mod

print(res % mod)