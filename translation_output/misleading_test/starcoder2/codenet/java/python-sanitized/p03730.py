a,b,c = map(int,input().split())
for i in range(5000):
    if a*i%b==c:
        print("YE")
        break
else:
    print("NO")