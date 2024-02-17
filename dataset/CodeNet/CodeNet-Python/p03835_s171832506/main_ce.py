K,S=map(int, "2 2".split())
ans=0
for i in range(K+1):
    for j in range(K+1):
        k=S-i-j
        if 0<=k<=K:
            ans+=1
print(ans)
