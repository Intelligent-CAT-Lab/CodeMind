
```
import math

def gcd(x,y):
    if x<y:
        tmp=x
        x=y
        y=tmp
    if x==0:
        return y
    elif y==0:
        return x
    else:
        while (tmp := x % y) != 0:
            x = y
            y = tmp
        return y

def lcm(a,b):
    return (a*b)//gcd(a,b)

A,B,C,D = map(int,input().split())
n = B-A+1

if C==D:
