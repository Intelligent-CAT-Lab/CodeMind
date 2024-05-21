import sys

s = input()
checkS = False
checkN = False
checkW = False
checkE = False

for c in s:
    if c == 'S':
        checkS = True
    elif c == 'N':
        checkN = True
    elif c == 'W':
        checkW = True
    elif c == 'E':
        checkE = True

if checkS == checkN and checkW == checkE:
    print("Yes")
else:
    print("No")