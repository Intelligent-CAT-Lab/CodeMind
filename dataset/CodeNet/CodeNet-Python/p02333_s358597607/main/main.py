N, K = list(map(int, input().split()))
MOD = 10 ** 9 + 7

# 逆元の前計算
factorial = [1, 1]
inverse = [1, 1]
invere_base = [0, 1]
for i in range(2, K + 1):
    factorial.append((factorial[-1] * i) % MOD)
    invere_base.append((-invere_base[MOD % i] * (MOD // i)) % MOD)
    inverse.append((inverse[-1] * invere_base[-1]) % MOD)


# フェルマーの小定理を用いたMOD上Combination
def nCr(n, r):
    if (r < 0 or r > n):
        return 0
    r = min(r, n - r)
    return factorial[n] * inverse[r] * inverse[n - r] % MOD


# 包除原理
ans = pow(K, N, MOD)
for r in range(1, K + 1):
    ans -= ((-1) ** ((r % 2) ^ 1)) * nCr(K, r) * pow(K - r, N, MOD) % MOD

print((ans % MOD))

