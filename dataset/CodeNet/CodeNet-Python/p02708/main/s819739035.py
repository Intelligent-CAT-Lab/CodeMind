n, k = list(map(int, input().split()))
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print((ans%(10**9+7)))