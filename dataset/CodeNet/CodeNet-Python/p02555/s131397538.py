s=int(input())
if  s<3:print(0);exit()
n=s//3
mod=10**9+7
fact=[1]*(2*s+1)
inv=[1]*(2*s+1)
for i in range(2,2*s+1):
    fact[i]=i*fact[i-1]%mod
inv[-1]=pow(fact[-1],-1,mod)
for i in range(2*s,1,-1):
    inv[i-1]=inv[i]*i%mod
def comb(x,y):return fact[x]*inv[y]%mod*inv[x-y]%mod if x>=y>=0 else 0
ans=0
for i in range(1,s+1):
    ans=(ans+comb(s-3*i+i-1,i-1))%mod
print(ans)