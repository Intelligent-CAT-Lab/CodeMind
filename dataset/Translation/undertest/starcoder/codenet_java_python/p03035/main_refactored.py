class main:
    import sys
    
    a,b = map(int,sys.stdin.readline().split())
    
    if a<=5:
        print(0)
    elif a<=12:
        print(b//2)
    else:
        print(b)