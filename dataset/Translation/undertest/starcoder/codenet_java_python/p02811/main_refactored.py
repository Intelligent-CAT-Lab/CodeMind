class main:
    import sys
    
    K, X = map(int, sys.stdin.readline().split())
    
    if X <= 500*K:
        print("Yes")
    else:
        print("No")