class main:
    import sys
    
    a,b,c = map(int,sys.stdin.readline().split())
    
    print(min(a,b)+min(b,c))