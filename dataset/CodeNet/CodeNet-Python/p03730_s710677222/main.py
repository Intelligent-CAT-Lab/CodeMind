a,b,c=list(map(int,input().split()))
for n in range(101):
    if (a*n) % b ==c:
        print("YES")
        exit()
print("NO")
