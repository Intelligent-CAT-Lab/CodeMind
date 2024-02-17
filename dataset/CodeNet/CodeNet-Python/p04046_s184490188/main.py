from math import factorial

h, w, a, b = map(int, input().split())
MOD = 10**9+7

fact = [1]

# 累積乗を作る
for i in range(1, h+w-1):
    fact.append(fact[-1] * i % MOD)

# 累積乗の逆元
inv_fact = [pow(fact[-1], MOD-2, MOD)] # x^(-1) = x^(10^9+5) % (10^9+7), フェルマーの小定理
for i in range(h+w-2, 0, -1): # xが最大の場合を求め、後ろ向きに計算していく
    inv_fact.append(inv_fact[-1] * i % MOD)
inv = list(reversed(inv_fact)) # 逆順に取得

#print(fact, inv_fact, inv)
def comb(x, y):
    return (fact[x] * inv[y] * inv[x-y])

ans = 0
for x in range(b, w):
    ans += ((comb((h-a-1 + x), x)) * (comb((a-1 + w-x-1), a-1)) % MOD)
    ans %= MOD

print(ans)
