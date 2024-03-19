def p04019(s):
    checkS = 'S' in s
    checkN = 'N' in s
    checkW = 'W' in s
    checkE = 'E' in s

    if checkS == checkN and checkW == checkE:
        return "Yes"
    else:
        return "No"

print(p04019(input()))