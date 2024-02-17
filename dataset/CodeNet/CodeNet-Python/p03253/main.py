n, m = list(map(int, input().split()))

MAX = 2*10**5+1
MOD = 10**9+7
fact = [0 for i in range(MAX)]
inv = [0 for i in range(MAX)]
invfact = [0 for i in range(MAX)]

def comb_build(n):
  fact[0] = inv[0] = invfact[0] = 1
  fact[1] = inv[1] = invfact[1] = 1
  for i in range(2, n):
    fact[i] = fact[i-1]*i%MOD
    inv[i] = inv[MOD%i]*(MOD-MOD//i)%MOD
    invfact[i] = invfact[i-1]*inv[i]%MOD

def nCk(n, k):
  if n<k or n<0 or k<0:
    return 0
  return (((fact[n]*invfact[k])%MOD)*invfact[n-k])%MOD

def prime_factor(n):
  from collections import defaultdict
  ret = defaultdict(int)
  for i in range(2, int(n**(1/2))+10):
    while n%i==0:
      ret[i] += 1
      n //= i
  if n!=1:
    ret[n] = 1
  return ret

comb_build(MAX)
ans = 1
for e in prime_factor(m).values():
  ans *= nCk(e+n-1, e)%MOD
print(ans%MOD)