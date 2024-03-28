class main:
    import sys
    
    N, M = map(int, sys.stdin.readline().split())
    
    if N > M:
        print(M//2)
        exit()
    
    if N == 1 and M == 1:
        print(0)
        exit()
    
    if N == 2 and M == 1:
        print(0)
        exit()
    
    if N * 2 > M:
        print(M//2)
        exit()
    
    ans = N + ((M - N * 2) // 4)
    
    print(ans)