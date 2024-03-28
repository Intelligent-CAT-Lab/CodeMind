class main:
    import sys
    
    A, B = map(int, sys.stdin.readline().split())
    ans = A + B - 24 if A + B > 23 else A + B
    print(ans)