n,k=map(int,input().split())
p=998244353
r=range
f=[1]
for i in r(k):f+=[-~i*f[i]%p]
print(sum(f[k-1]*pow(f[i]*f[k-1-i],-1,p)for i in r(n-1,k))%p)