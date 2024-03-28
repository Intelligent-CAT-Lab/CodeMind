class main:
    x,y=map(int,input().split())
    ans=0
    for i in range(x,y+1):
        if i%2==0:
            ans+=1
    print(ans)