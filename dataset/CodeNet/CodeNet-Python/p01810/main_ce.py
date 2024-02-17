n,k=map(int,"4 2".split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)