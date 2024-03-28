class main:
    s = input()
    abc = [False, False, False]
    for i in range(3):
        if s[i] == 'a':
            abc[0] = True
        if s[i] == 'b':
            abc[1] = True
        if s[i] == 'c':
            abc[2] = True
    
    isOK = True
    for i in range(3):
        isOK = isOK and abc[i]
    
    if isOK:
        print("Yes")
    else:
        print("No")