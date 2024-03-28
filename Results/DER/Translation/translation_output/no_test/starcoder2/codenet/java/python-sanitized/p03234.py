import sys

mod = 1000000007

n,k = map(int,input().split())
n*=2

a = [0]*(k+1)
b = [0]*(k+1)
f = [0]*(n+1)

for i in range(1,k+1):
    a[i],b[i] = map(int,input().split())
    f[a[i]]=1
    f[b[i]]=1

for i in range(1,n+1):
    f[i]+=f[i-1]

dp = [[-1]*(n+1) for i in range(n+1)]

memoWaysToPair = [-1]*(n+1)

def waysToPair(x):
    if memoWaysToPair[x]!=-1:
        return memoWaysToPair[x]
    if x%2==1:
        memoWaysToPair[x]=0
    elif x==0:
        memoWaysToPair[x]=1
    else:
        memoWaysToPair[x]=waysToPair(x-2)*(x-1)%mod
    return memoWaysToPair[x]

def paired(x,y):
    return f[y]-f[x-1]

def inside(a,x,y):
    return (x<=a and a<=y)

def caldp(x,y):
    if dp[x][y]!=-1:
        return dp[x][y]
    notPairedin