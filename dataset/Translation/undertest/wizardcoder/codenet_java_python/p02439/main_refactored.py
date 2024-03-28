class main:
    import sys
    
    a, b, c = map(int, sys.stdin.readline().split())
    
    min_ab = min(a, b)
    max_ab = max(a, b)
    
    print(min(min_ab, c), max(max_ab, c))