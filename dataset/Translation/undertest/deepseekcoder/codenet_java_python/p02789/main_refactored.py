class main:
    import sys
    
    n, m = map(int, sys.stdin.readline().split())
    
    if n == m:
        print("Yes")
    else:
        print("No")