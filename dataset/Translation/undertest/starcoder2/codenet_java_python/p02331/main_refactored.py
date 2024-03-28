class main:
    n,k=map(int,input().split())
    ans=1
    for i in range(n):
        ans=(ans*k)%1000000007
    print(ans)