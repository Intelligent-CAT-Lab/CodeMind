class main:
    s = input()
    abc = [False]*3
    for i in range(3):
        if s[i] == 'a':
            abc[0] = True
        if s[i] == 'b':
            abc[1] = True
        if s[i] == 'c':
            abc[2] = True
    
    isOK = True
    for i in range(3):
        isOK &= abc[i]
    
    print("Yes" if isOK else "No")