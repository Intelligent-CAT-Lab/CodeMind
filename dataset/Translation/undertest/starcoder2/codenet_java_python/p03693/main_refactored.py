class main:
    r,g,b = map(int,input().split())
    r*=100
    g*=10
    sum = r+g+b
    if sum%4==0:
        print("YES")
    else:
        print("NO")