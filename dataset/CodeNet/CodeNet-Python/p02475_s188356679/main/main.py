a,b=list(map(int,input().split() ))
if a*b>=0:
    print((a//b))
else:
    print((-(-a//b)))
