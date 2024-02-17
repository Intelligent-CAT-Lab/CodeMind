def combs_mod(n,k,mod):
  #nC0からnCkまで
  inv = [1]*(k+1)
  for i in range(1,k+1):
    inv[i] = pow(i,mod-2,mod)
  ans = [1]*(k+1)
  for i in range(1,k+1):
    ans[i] = ans[i-1]*(n+1-i)*inv[i]%mod
  return ans
def solve():
  mod = 998244353
  N, K = list(map(int, input().split()))
  ans = 0
  if K<N:
    return ans
  com = combs_mod(K,K,mod)
  for r in range(K+1):
    b = K-r
    dif = r-b
    if dif<0 or r<N:
      continue
    elif dif==0:
      com2 = combs_mod(K-1,K-1,mod)
      ans += com2[r]
      if N>=2:
        ans -= com2[N-2]
    elif dif<N:
      ans += com[r] - com[N-1-dif]
    else:
      ans += com[r]
    ans %= mod
  return ans
print((solve()))