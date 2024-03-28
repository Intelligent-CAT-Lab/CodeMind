class main:
    import sys
    
    N = int(sys.stdin.readline())
    
    for A in range(1, 10):
        if N % A == 0 and N / A < 10:
            print("Yes")
            break
    else:
        print("No")