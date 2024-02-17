n,m,r=list(map(int,input().split()))
a,b=sorted([n-1,r-m*n])
d=1
for i in range(a):d*=i+1
u=1
for i in range(b,a+b):u*=i+1
print((0 if a<1 else u//d))
