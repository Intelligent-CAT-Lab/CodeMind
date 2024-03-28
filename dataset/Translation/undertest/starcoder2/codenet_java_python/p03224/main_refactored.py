class main:
    import sys
    
    N = int(sys.stdin.readline())
    l = 1
    while l < N:
        N -= l
        l += 1
    if N != l:
        print("No")
        sys.exit()
    print("Yes")
    print(l+1)
    
    answer = [[0 for i in range(l)] for j in range(l+1)]
    for i in range(l+1):
        string = str(l)
        for j in range(i):
            string += " " + str(answer[j][i-1])
        for j in range(i, l):
            string += " " + str(answer[i][j] = Index)
            Index += 1
        print(string)
    
    /p03224.py
    import sys
    
    N = int(sys.stnge(i, l):
            string += " " + str(answer[i][j] = Index)
            Index += 1
        print(string)
    din.readline())
    l = 1
    while l < N:
        N -= l
        l += 1
    if N != l:
        print("No")
        sys.exit()
    print("Yes")
    print(l+1)
    
    answer = [[0 for i in range(l)] for j in range(l+1)]
    for i in range(l+1):
        string = str(l)
        for j in range(i):
            string += " " + str(answer[j][i-1])
        for j in ra