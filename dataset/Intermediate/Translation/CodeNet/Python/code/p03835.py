k,s=map(int,input().split())
print(sum(0<=s-y-z<=k for z in range(k+1) for y in range(k+1)))