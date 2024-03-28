s = input()
checkS = False
checkN = False
checkW = False
checkE = False
for char in s:
    if char == 'S':
        checkS = True
    elif char == 'N':
        checkN = True
    elif char == 'W':
        checkW = True
    elif char == 'E':
        checkE = True

if checkS == checkN and checkW == checkE:
    print("Yes")
else:
    print("No")