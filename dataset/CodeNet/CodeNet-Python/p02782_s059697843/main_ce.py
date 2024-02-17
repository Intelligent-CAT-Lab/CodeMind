r1, c1, r2, c2 = map(int, "1 1 2 2".split())
L = 10 ** 9 + 7
# 互除法
def get_euclidian (A, B):
  if B == 1:
    return (1)
  else:
    return (int((1 - A * get_euclidian (B, A % B)) / B))
# 階乗計算
F = [1]
for i in range(1, r2 + c2 + 3):
  F.append((F[i - 1] * i) % L)
# 組み合わせ計算
def get_combi (n, r):
  Euc = get_euclidian(L, (F[r] * F[n - r]) % L)
  return ((F[n] * Euc) % L)
combi1 = get_combi(r2 + c2 + 2, r2 + 1)
combi2 = get_combi(r2 + c1 + 1, c1)
combi3 = get_combi(r1 + c2 + 1, r1)
combi4 = get_combi(r1 + c1, r1)
print ((int(combi1 - combi2 - combi3 + combi4) + L) % L)