class main:
    import sys
    
    N, K = map(int, sys.stdin.readline().split())
    
    if K % 2 == 0:
        c1 = N // K
        c2 = N // (K // 2) - c1
        print(c1 * c1 * c1 + c2 * c2 * c2)
    else:
        c = N // K
        print(c * c * c)
    
    
    
    
    import sys
    
    N = int(sys.stdin.readline())
    
    for i in range(N):
        print(i + 1)
    
    /p0000