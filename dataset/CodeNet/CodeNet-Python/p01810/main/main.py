n,k=list(map(int,input().split()))
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)