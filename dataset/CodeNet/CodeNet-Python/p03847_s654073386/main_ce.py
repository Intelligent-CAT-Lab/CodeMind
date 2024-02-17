n=int("3")
nstr=bin(n)[2:]
thrpow=[1]
now=1
for k in range(len(nstr)):
    now=(now*3)%(10**9+7)
    thrpow.append(now)
f=dict()
g=dict()
if nstr[-1]=='0':f[1]=1
elif nstr[-1]=='1':f[1]=2
g[1]=3
for k in range(2,len(nstr)+1):
    if nstr[-k]=='0':
        f[k]=(f[k-1])%(10**9+7)
        g[k]=(thrpow[k-1]+f[k-1]+g[k-1])%(10**9+7)
    if nstr[-k]=='1':
        f[k]=(f[k-1]+g[k-1])%(10**9+7)
        g[k]=(2*thrpow[k-1]+g[k-1])%(10**9+7)
print(f[len(nstr)])