class main:
    import sys
    
    S = int(sys.stdin.readline())
    h = S // 3600
    hi = S % 3600
    m = hi // 60
    s = S % 60
    print(f"{h}:{m}:{s}")