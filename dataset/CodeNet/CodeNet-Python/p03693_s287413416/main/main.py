r, g, b = list(map(int,input().split()))

answer = r*100 + g*10 + b

if answer % 4 == 0:
    print("YES")
else:
    print("NO")
