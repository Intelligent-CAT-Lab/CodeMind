def egcd(a, b):
    x,y, u,v = 0,1, 1,0
    while a != 0:
        q, r = b//a, b%a
        m, n = x-u*q, y-v*q
        b,a, x,y, u,v = a,r, u,v, m,n
    gcd = b
    return gcd,x,y

a,b = (int(_) for _ in input().split(" "))
gcd,x,y = egcd(a,b)

if y * a + x * b == gcd:
    tmp = x
    x = y
    y = tmp

print(x,y)
