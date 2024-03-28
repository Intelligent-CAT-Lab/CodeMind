class main:
    import sys
    
    t, s, q = map(int, sys.stdin.readline().split())
    
    sum = 0
    while s < t:
        s = s * q
        sum += 1
    
    print(sum)