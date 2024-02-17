r1,c1,r2,c2 = map(int,input().split())


def cmb(n, r, mod):
    if (r < 0) or (n < r):
        return 0
    r = min(r, n - r)
    return (fact[n] * factinv[r] * factinv[n-r])%mod

mod=10**9 + 7
fact=[1,1]
factinv=[1,1]
inv=[0,1]
N=r2+c2+3
mod=10**9+7
 
for i in range(2, N + 1):
    fact.append((fact[-1] * i) % mod)
    inv.append((-inv[mod % i] * (mod // i)) % mod)
    factinv.append((factinv[-1] * inv[-1]) % mod)
    
#二次元累積和もどき，i,jのマスを考える，
a=cmb(r2+c2+2,r2+1,mod) 
b=cmb(r1+c2+1,r1,mod)
c=cmb(r2+c1+1,c1,mod)
d=cmb(r1+c1,r1,mod)
ans=a-b-c+d
print(ans%mod)


