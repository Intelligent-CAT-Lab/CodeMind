
L, R = list(map(int, input().split()))
modlist =[]
for i in range(L, R):
    for j in range(L+1,R+1):
        nummod = i * j % 2019
        modlist.append(nummod)
        if nummod == 0:
            break
    if nummod == 0:
        break
print((min(modlist)))