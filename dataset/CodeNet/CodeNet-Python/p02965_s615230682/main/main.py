o,f=998244353,[1]
for i in range(1,2500100):f.append(f[-1]*i%o)
c=lambda n,k:f[n]*pow(f[n-k],o-2,o)*pow(f[k],o-2,o)
n,m=list(map(int,input().split()))
w,u=3*m,n-1
a=c(w+u,u)-n*c(n+m-2,u)
if u>m:
 for i in range(m+1,min(w,n)+1):
  if w-i+1&1:a-=c(n,i)*c((w-i)//2+u,u) 
print((a%o))