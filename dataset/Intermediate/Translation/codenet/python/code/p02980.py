N, M = map(int, input().split())
mod = 998244353

if N > M:
  N, M = M, N

fact = [0] * (M + 1)
powm = [0] * (M + 1)
pown = [0] * (M + 1)
fact[0] = 1
powm[0] = 1
pown[0] = 1
for i in range(1, M + 1):
  fact[i] = fact[i - 1] * i % mod
  powm[i] = powm[i - 1] * (M + 1) % mod
  pown[i] = pown[i - 1] * (N + 1) % mod

def pow(n, m):
  if m == 0:
    return 1
  elif m == 1:
    return n
  elif m % 2 == 0:
    return pow(n, m // 2)**2 % mod
  else:
    return pow(n, m // 2)**2 % mod * n % mod

inv_fact = [0] * (M + 1)
inv_fact[M] = pow(fact[M], mod-2)
for i in reversed(range(0, M)):
  inv_fact[i] = inv_fact[i + 1] * (i + 1) % mod
    
def C(n, r):
  return fact[n] * inv_fact[r] % mod * inv_fact[n - r] % mod
  
ans = 0
for i in range(N+1):
  ans += (-1)**i * C(N, i) * C(M, i) * fact[i] * powm[N - i] * pown[M - i]
  ans = ans % mod

print(ans)
