a,b,c,d = map(int,input().split())
if d<=a:
    print(d)
else:
    print(a)
    d-=a
    if d<=b:
        print(a)
    else:
        print(a-b)