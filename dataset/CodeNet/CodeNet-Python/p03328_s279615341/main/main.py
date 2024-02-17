a,b=list(map(int,input().split()))
lis=[0]*1000
for i in range(1000):
    lis[i]=(i+2)*(i+1)//2
    if i>=1:
        if b-a==lis[i]-lis[i-1]:
            print((lis[i]-b))
            break