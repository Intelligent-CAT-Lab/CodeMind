n,m,k=map(int,"3 2 1".split())
# 解説動画を見た
mod=998244353
ans=0
#-------------------------------------------------------------------
MAX_N = 10**6
fact = [1]
fact_inv = [0]*(MAX_N+4)
for i in range(MAX_N+3):
  fact.append(fact[-1]*(i+1)%mod)
fact_inv[-1] = pow(fact[-1],mod-2,mod)
for i in range(MAX_N+2,-1,-1):
  fact_inv[i] = fact_inv[i+1]*(i+1)%mod
def mod_comb_k(n,k,mod):
  return fact[n] * fact_inv[k] % mod * fact_inv[n-k] %mod 
#-------------------------------------------------------------------
for x in range(0,k+1):
  ans+=m*pow(m-1,n-1-x,mod)*mod_comb_k(n-1,x,mod)
  ans%=mod
if ans<0:
  ans+=mod
print(ans)