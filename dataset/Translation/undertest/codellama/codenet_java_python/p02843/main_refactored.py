class main:
    import sys
    
    x = int(sys.stdin.readline())
    if x % 100 <= x // 100 * 5:
        print(1)
    else:
        print(0)