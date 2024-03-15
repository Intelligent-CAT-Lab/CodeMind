a = int(input())
b = int(input())
c = int(input())
d = int(input())
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