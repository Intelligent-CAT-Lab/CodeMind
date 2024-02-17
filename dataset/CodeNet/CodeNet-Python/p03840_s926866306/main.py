i,o,t,j,l,s,z=map(int,input().split())
ans=o
ans+=i-(i%2)
ans+=l-(l%2)
ans+=j-(j%2)
if i%2+j%2+l%2==3:
  ans+=3
elif i%2+j%2+l%2==2:
  if i*j*l>0:
    ans+=1
print(ans)