a,b=map(int,"-13 3".split())
if a+b>=a-b and a+b>=a*b:
    print(a+b)
elif a-b>=a+b and a-b>=a*b:
    print(a-b)
else:
    print(a*b)