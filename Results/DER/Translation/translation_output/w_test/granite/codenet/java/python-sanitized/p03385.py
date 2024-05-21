def main():
    s = input()
    abc = [False] * 3
    for c in s:
        if c == 'a':
            abc[0] = True
        elif c == 'b':
            abc[1] = True
        elif c == 'c':
            abc[2] = True
    isOK = True
    for b in abc:
        isOK &= b
    print("Yes" if isOK else "No")

if __name__ == '__main__':
    main()