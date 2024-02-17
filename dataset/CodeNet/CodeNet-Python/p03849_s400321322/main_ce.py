# coding: utf-8
# Your code here!
import sys
read = sys.stdin.read
readline = sys.stdin.readline
n, = map(int,read().split())
d = {}
"""
res = [[0]*100 for _ in range(100)]
for i in range(128):
    for j in range(128):
        u = i^j
        v = i+j
        if u<100 and v<100: res[u][v] = 1
x = 0
for i in range(n+1):
    for j in range(n+1):
        x += res[i][j]
for i in res[:10]:
    print(i[:10])
for i in range(100):
    for j in range(1,100):
        res[i][j] += res[i][j-1]
for i in range(1,100):
    for j in range(100):
        res[i][j] += res[i-1][j]
#for i in res[:10]:
#    print(i[:10])
"""
def f(n,m):
    if (n,m) in d: return d[(n,m)]
    if n<0 or m<0:
        return 0
    if n==0:
        return max(1+n//2,1+m//2)
    if m==0:
        return 1
    nn = n>>1 if n&1 else (n>>1)-1
    mm = m>>1 if m&1 else (m>>1)-1
    #print(f"({n},{m})", f(nn,mm),f(n>>1,m>>1),f(n>>1,(m>>1)-1))    
    v =  f(nn,mm) + f(n>>1,m>>1) + f(n>>1,(m>>1)-1)
    d[(n,m)] = v
    #assert v == res[n][m]
    return v
ans = f(n,n)
print(ans%(10**9+7))
