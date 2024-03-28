s = input()
checkS = 'S' in s
checkN = 'N' in s
checkW = 'W' in s
checkE = 'E' in s

if checkS == checkN and checkW == checkE:
    print("Yes")
else:
    print("No")