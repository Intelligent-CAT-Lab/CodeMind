n="7"
if n==2:print-1;exit(0)
r=range(n-1)
s=r+[n-1]
A=[[1+(i+j+1)%n for j in r]for i in s]
for i in r:
    for j in s:
        if A[A[j][i]-1][i]==j+1:
            A[j][i],A[j][i-n]=A[j][i-n],A[j][i]
print"\n".join(" ".join(map(str, e))for e in A)