class main:
    import sys
    
    n = int(sys.stdin.readline())
    minute = 12 * 60 * n / 360
    print(minute // 60, minute % 60)