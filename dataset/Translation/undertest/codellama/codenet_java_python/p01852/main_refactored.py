class main:
    import sys
    
    n = int(sys.stdin.readline())
    count = 0
    
    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1
    
    print(count)