class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    
    d = a // b
    r = a % b
    f = "{:.5f}".format(a / b)
    
    print(d, r, f)