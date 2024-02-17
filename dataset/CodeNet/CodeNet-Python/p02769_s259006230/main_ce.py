import sys
input=sys.stdin.readline
n,k=map(int,"3 2".split())
INF=10**9+7
p=[0]*n
p[0]=1
def modinv(a,m):
    b=m
    (x,lastx)=(0,1)
    (y,lasty)=(1,0)
    while not b==0:
        q=a//b
        (a,b)=(b,a%b)
        (x, lastx) = (lastx - q * x, x)
        (y, lasty) = (lasty - q * y, y)
    return lastx%m
x=n-1
y=n
for i in range(1,n):
    p[i]=(x*y)%INF
    a=n-1-i
    b=modinv(i+1,INF)
    x=(x*a*b)%INF
    a = n - i
    b = modinv(i+1, INF)
    y = (y * a * b) % INF
ans=0
if k>=n:
    for i in range(n):
        ans=(ans+p[i])%INF
else:
    for i in range(k+1):
        ans=(ans+p[i])%INF
print(ans)
