def ex_euclid(x,y):
    c0,c1 = x,y
    a0,a1 = 1,0
    b0,b1 = 0,1
    while c1:
        a0,a1 = a1,a0-c0//c1*a1
        b0,b1 = b1,b0-c0//c1*b1
        c0,c1 = c1,c0%c1
    return c0,a0,b0

x,y = map(int,input().split())
c,a,b = ex_euclid(x,y)
print(a,b)

