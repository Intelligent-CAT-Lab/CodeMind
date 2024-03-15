> Translate the following python code to java and enclose your solution inside :

n,m,k=map(int,input().split())
ans="No"
for i in range(n//2+1):
  for j in range(m):
    o=i*j+(m-j)*(n-i)
    x=n*m-o
    if o==k or x==k:
      ans="Yes"
print(ans)