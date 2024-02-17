a,b=list(map(int,input().split()))
if a+b>=a-b and a+b>=a*b:
    print((a+b))
elif a-b>=a+b and a-b>=a*b:
    print((a-b))
else:
    print((a*b))