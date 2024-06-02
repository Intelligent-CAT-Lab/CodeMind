mod = 10**9+7
rng = 2000100
fctr = [1]+[0]*(rng-1)
for i in range(1,rng):
  fctr[i] = fctr[i-1]*i%mod
def finv(x):
  return pow(fctr[x],mod-2,mod)
def cmb(n,k):
  if n<0 or k<0:
    return 0
  else:
    return fctr[n]*finv(n-k)*finv(k)%mod

x1,y1,x2,y2 = map(int,input().split())
print((cmb(x2+y2+2,x2+1)-cmb(x2+y1+1,y1)-cmb(x1+y2+1,x1)+cmb(x1+y1,x1))%mod)