class main:
    import sys
    
    a,b = map(int,sys.stdin.readline().split())
    
    print((b-1)//(a-1)+1)