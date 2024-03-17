n,a,b = map(int,input().split())
if a>b or (n==1 and a!=b):
    print(0)
elif a==b:
    print(1)
else:
    print((n-2)*(b-a)+1)