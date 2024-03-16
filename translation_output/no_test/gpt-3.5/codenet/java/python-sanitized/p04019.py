def main():
    s = input()
    checkS = False
    checkN = False
    checkW = False
    checkE = False
    for i in range(len(s)):
        if s[i] == 'S':
            checkS = True
        elif s[i] == 'N':
            checkN = True
        elif s[i] == 'W':
            checkW = True
        elif s[i] == 'E':
            checkE = True
    if checkS == checkN and checkW == checkE:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()