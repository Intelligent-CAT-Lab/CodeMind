def f(n):
    n=str(n)
    if n==n[::-1]:return 1
a=b=int(input())
while 1:
    if f(b): print(b);break
    a-=1
    if f(a):print(a);break
    b+=1