class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    res = a
    
    while a >= b:
        res += a // b
        a = a // b + a % b
    
    print(res)