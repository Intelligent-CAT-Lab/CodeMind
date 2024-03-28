class main:
    import sys
    a,b=map(int,sys.stdin.readline().split())
    print(min(a*b,b*a))