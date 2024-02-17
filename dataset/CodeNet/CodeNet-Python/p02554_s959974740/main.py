n=int(input())
ans=1
sub=1
sub2=1
for i in range(n):
    ans*=10
    ans%=(10**9+7)
    sub*=9
    sub%=(10**9+7)
    sub2*=8
    sub2%=(10**9+7)
ans-=2*sub-sub2
print(ans%(10**9+7))


