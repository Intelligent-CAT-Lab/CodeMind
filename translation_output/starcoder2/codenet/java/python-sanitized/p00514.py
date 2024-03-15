import math
a,b,c=map(int,input().split())
if a*b>c:
    print(0)
    exit(0)
c-=a*b
d=c+a-1
print(math.factorial(d)//math.factorial(c)//math.factorial(d-c))