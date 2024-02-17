X,Y=map(int,"3 20".split())
ans=0
seki=X
while seki <= Y:
    seki*=2
    ans+=1
print(ans)