import sys

N, K, M = map(int, input().split())

if N < K:
    print(naive())
    sys.exit(0)

dp = [[[0] * (1 << K) for _ in range(K + 1)] for _ in range(2)]

for i in range(1 << K):
    c = 0
    ok = True
    for j in range(K):
        if (i >> (K - 1 - j)) & 1 == 0:
            c -= 1
        else:
            c += 1
        if c < 0:
            ok = False
            break
    if not ok: continue
    u = bin(i).count('1')
    l = K - u
    if u < l: continue
    dp[0][u - l][i] = 1

t = 1
for i in range(K, 2 * N):
    for j in range(i % 2, K + 1, 2):
        l = (i - j) // 2
        u = l + j
        for k in range(1 << K):
            uc = bin(k).count('1')
            if 0 < j <= uc and (l == 0 or k!= (1 << K) - 1):
                dp[t][j - 1][(k << 1) & ((1 << K) - 1)] += dp[1 - t][j][k]
                dp[t][j - 1][(k << 1) & ((1 << K) - 1)] %= M
            if u < N and j < K and k!= 0:
                dp[t][j + 1][((k << 1) + 1) & ((1 << K) - 1)] += dp[1 - t][j][k]
                dp[t][j + 1][((k << 1) + 1) & ((1 << K) - 1)] %= M

ans = sum(dp[1 - t][0]) % M
print(ans)