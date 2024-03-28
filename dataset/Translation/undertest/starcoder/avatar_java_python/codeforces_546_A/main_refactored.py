class main:
    import sys
    
    o, g, x = map(int, sys.stdin.readline().split())
    n = int(sys.stdin.readline())
    
    for i in range(1, g+1):
        x += i * o
    
    borrow = x - n
    
    if borrow <= 0:
        print(0)
    else:
        print(borrow)