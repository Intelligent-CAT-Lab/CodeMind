class main:
    import sys
    
    r, g, b = map(int, sys.stdin.readline().split())
    
    if (r + g + b) % 4 == 0:
        print("YES")
    else:
        print("NO")