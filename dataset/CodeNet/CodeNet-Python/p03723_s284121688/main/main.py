a,b,c=list(map(int,input().split()))
d=0
while a%2==0 and b%2==0 and c%2==0:
    if a==b==c:
        print((-1))
        break
    d+=1
    ha=a//2
    hb=b//2
    hc=c//2
    a=hb+hc
    b=ha+hc
    c=ha+hb
else:print(d)