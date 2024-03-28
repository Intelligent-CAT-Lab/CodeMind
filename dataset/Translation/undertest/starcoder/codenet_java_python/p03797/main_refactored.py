class main:
    import sys
    
    N, M = map(int, sys.stdin.readline().split())
    
    if N * 2 > M:
        print(M // 2)
    elif M > N * 2:
        print(N + (M - N * 2) // 4)
    else:
        print(N)