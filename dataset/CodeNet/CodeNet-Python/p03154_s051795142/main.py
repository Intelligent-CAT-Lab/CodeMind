mod=10**9+7
def mul(a,b):
    x,y=a,b
    return (x*y)%mod

H,W,K=map(int,input().split())
mod=10**9+7
ans=0
const=1
for i in range(H+W-1,H+W-K,-1):
    const=(const*i)%mod

inv=pow(H+W-1,mod-2,mod)
temp1=mul(H+W,mul((K*(K+1)//2)%mod,const))
const=mul(const,inv)
u=(K*(K**2-1))//6
u%=mod
temp2=mul(2*H*W,mul(u,const))
ans=(temp1+temp2)%mod
const=mul(const,H+W-1)
ans+=mul(K,mul(H+W,const))
ans%=mod
print(ans)
