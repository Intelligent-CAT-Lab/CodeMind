s = input()
abc = [False for i in range(3)]
for i in range(3):
    if s[i] == 'a':
        abc[0] = True
    elif s[i] == 'b':
        abc[1] = True
    elif s[i] == 'c':
        abc[2] = True

isOK = all(abc)
print("Yes" if isOK else "No")