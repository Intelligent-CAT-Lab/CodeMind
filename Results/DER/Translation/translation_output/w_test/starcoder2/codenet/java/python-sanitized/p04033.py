a,b=map(int,input().split())
if a<=0 and 0<=b:
    print("Zero")
else:
    if (min(0,b)-min(-1,a))%2==1:
        print("Positive")
    else:
        print("Negative")