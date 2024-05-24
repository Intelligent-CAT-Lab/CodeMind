n=int(input())
ans=[]
for i in range(n-1):
  if i%2:
    ans+=[(i,0)]
for i in range(n-1):
  if i%6==1:
    for j in range(2,n):
      if j%2==0:
        ans+=[(i,j)]
  if i%6==4:
    for j in range(n):
      if j%2:
        ans+=[(i,j)]
for j in range(n):
  if(n-1+j)%2:
    ans+=[(n-1,j)]
print(len(ans))
for x,y in ans:
  print(x,y)