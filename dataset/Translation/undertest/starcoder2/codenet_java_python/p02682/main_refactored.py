class main:
    a,b,c,d = map(int,input().split())
    sum = 0
    if d<=a:
        print(d)
    else:
        sum = a
        d -= a
        if d<=b:
            print(sum)
        else:
            d-=b
            sum -= d
            print(sum)