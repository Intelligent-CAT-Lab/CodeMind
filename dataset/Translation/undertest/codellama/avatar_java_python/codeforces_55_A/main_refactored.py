class main:
    import sys
    
    n = int(sys.stdin.readline())
    if n & (n - 1) == 0:
        print("YES")
    else:
        print("NO")