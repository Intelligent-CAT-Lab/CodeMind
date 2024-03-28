class main:
    import sys
    
    x = int(sys.stdin.readline())
    ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
    print(ans)