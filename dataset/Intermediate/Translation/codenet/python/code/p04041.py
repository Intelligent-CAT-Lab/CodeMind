# seishin.py
N, X, Y, Z = map(int, input().split())
m = 2**(X+Y+Z)
S = [0]*m

L = max(X, Y, Z)

ss = set()
tt = set()

Z0 = (1 << (Z-1))
Y0 = (1 << (Z+Y-1))
X0 = (1 << (X+Z+Y-1))

for i in range(m):
    if i & Z0 and i & Y0 and i & X0:
        ss.add(i)

MASK = 2**(X+Y+Z)-1
MOD = 10**9 + 7

S[0] = 1
for i in range(N):
    T = [0]*m
    for s in range(m):
        if s in ss:
            # XYZが成立
            continue
        b = (s << 1) | 1
        for k in range(1, L+1):
            t = (b << (k-1)) & MASK
            T[t] = (T[t] + S[s]) % MOD
        for k in range(L+1, 11):
            T[0] = (T[0] + S[s]) % MOD
    S = T
ans = 0
for s in range(m):
    if s in ss:
        continue
    ans = (ans + S[s]) % MOD
ans = (pow(10, N, MOD) + MOD - ans) % MOD
print(ans)