w=list(input())
n=len(w)
t=-1
def Z(s):
    m=len(s);z=[0]*m;c=0;f=[1]*m;
    for i in range(1,m):
        if i+z[i-c]<c+z[c]:z[i]=z[i-c]
        else:
            j=max(0,c+z[c]-i)
            while i+j<n and s[j]==s[i+j]:j=j+1
            z[i]=j;c=i
    for p in range(1,m):
        for k in range(2,z[p]//p+2):f[k*p-1]=0
    return f
for j in range(1,n//2+1):
    if n%j==0 and w[:n-j]==w[j:]:t=j;break;
if t==-1:print ('1\n1')
elif t==1:print (n);print (1)
else:
    zl=Z(w)
    w.reverse()
    zr=Z(w)
    cnt=0
    for i in range(0,n-1):
        if zl[i] and zr[n-2-i]:cnt=cnt+1
    print(2);print(cnt);
