class main:
    import sys
    
    a, b, x = map(int, sys.stdin.readline().split())
    count = b // x - a // x
    if a % x == 0:
        count += 1
    print(count)