from math import factorial as fc

MOD=10**9+7
n,k=list(map(int,input().split()))

for i in range(1,k+1):
    if n-k+1<i:
        print((0))
        continue
    b=fc(n-k+1)//fc(i)//fc(n-k+1-i)
    r=fc(k-1)//fc(i-1)//fc(k-1-(i-1))
    print((b%MOD*r%MOD))
