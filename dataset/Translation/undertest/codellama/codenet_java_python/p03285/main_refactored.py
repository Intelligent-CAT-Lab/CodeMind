class main:
    import sys
    
    N = int(sys.stdin.readline())
    limit7 = N // 7
    check = False
    
    for i in range(limit7 + 1):
        left = N - (i * 7)
        if left % 4 == 0:
            check = True
            break
    
    if check:
        print("Yes")
    else:
        print("No")