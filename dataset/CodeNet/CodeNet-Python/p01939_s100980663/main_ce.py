n,m=map(int,"3 9".split())
mod1,mod2=10**9+7,998244353
mod=mod1
ans=(m+1)%mod
if n!=1:
    a=m//(n-1)
    ans=((m+1)*(a+1)+(m+1)*a-(n-1)*a*(a+1))%mod
print(ans)
