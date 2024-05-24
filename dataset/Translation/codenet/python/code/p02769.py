def i1():
 return int(input())
def i2():
 return [int(i) for i in input().split()]
mod=10**9+7
def bp(a,n):
        r=1
        while(n):
           if n%2:
              r=r*a%mod
           a=a*a%mod
           n>>=1
        return r
[n,k]=i2()
if n<=k:
   x=1
   for i in range(n-1):
      x*=2*n-1-i
      x%=mod
   y=1
   for i in range(n-1):
      y*=i+1
      y%=mod
   print((x*bp(y,10**9+5))%mod)   
   
else:
   x=1
   y=1
   t=1
   for i in range(k):
      t*=i+1
      t%=mod
      y*=n-1-i
      y%=mod
      y*=n-i
      y%=mod
      c=bp(t,10**9+5)
      x+=y*c*c
      x%=mod
   print(x)   