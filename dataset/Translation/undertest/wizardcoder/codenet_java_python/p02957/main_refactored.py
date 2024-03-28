class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    k = a + b
    
    if k % 2 == 0:
        print(k // 2)
    else:
        print("IMPOSSIBLE")