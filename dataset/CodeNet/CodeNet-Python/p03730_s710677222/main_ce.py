a,b,c=list(map(int,"7 5 1".split()))
for n in range(101):
    if (a*n) % b ==c:
        print("YES")
        exit()
print("NO")
