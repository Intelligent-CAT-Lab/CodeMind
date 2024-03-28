class main:
    import sys
    
    n, k = map(int, sys.stdin.readline().split())
    print(min(n%k, k-n%k))