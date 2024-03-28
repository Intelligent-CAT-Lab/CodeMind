from math import factorial
a,b,c=map(int,input().split())
if a*b>c:
    print(0)
    exit()
c-=a*b
d=c+a-1
print(factorial(d)//factorial(c)//factorial(d-c))