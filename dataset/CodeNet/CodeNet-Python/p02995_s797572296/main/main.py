import math

a,b,c,d=list(map(int,input().split()))

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

gcd_ = int(gcd(c,d))

cc = (c//gcd_ * d)


mm1 = b//c
mm2 = b//d
mmc = b//cc
A1 = b - (mm2 + mm1 - mmc)
# print(A1, b, mm2, mm1, mmc)

a-=1
mm1 = a//c
mm2 = a//d
mmc = a//cc
A2 = a - (mm2 + mm1 - mmc)
# print(A2, a, mm2, mm1, mmc)


print((A1 - A2))