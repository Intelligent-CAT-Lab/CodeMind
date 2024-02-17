a,b,c=list(map(int,input().split()))
ans=0
for i in range(a,b+1):
    if c%i==0:
        ans+=1
print(ans)
