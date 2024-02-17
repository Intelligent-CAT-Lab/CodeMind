import sys
w=list(raw_input())
n=len(w)
per=-1
def good(s):
    m=len(s);z=[0]*m;c=0;g=[True]*m
    for i in range(1,m):
        if i+z[i-c]<c+z[c]:z[i]=z[i-c]
        else:
            j=max(0,c+z[c]-i)
            while i+j<n and s[j]==s[i+j]:j+=1
            z[i]=j;c=i
    for p in range(1,m):
        for k in range(2,z[p]/p+2):g[k*p-1]=False
    return g
for j in range(1,n/2+1):
    if n%j==0:
        if w[:n-j]==w[j:]:per=j;break
if per==-1:print 1;print 1;sys.exit()
if per==1:print n;print 1;sys.exit()
gl=good(w)
w.reverse()
gr=good(w)
cnt=0
for i in range(n-1):
    if gl[i] and gr[n-2-i]:cnt+=1
print 2
print cnt
