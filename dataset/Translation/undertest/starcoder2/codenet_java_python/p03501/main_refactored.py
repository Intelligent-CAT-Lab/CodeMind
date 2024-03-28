class main:
    import sys
    
    N, A, B = map(int, sys.stdin.readline().split())
    print(min(A*N, B))