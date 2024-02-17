r,d,x = (int(i) for i in "2 10 20".split())
for i in range(1,11):
    x = r*x-d
    print(x)