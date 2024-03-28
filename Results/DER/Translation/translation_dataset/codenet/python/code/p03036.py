r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)