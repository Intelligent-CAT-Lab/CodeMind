class main:
    import sys
    
    L, R, d = map(int, sys.stdin.readline().split())
    
    print(sum(i % d == 0 for i in range(L, R + 1)))