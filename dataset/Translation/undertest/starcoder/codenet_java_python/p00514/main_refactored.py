class main:
    import sys
    
    a,b,c = map(int,sys.stdin.readline().split())
    if a*b>c:
        print(0)
        sys.exit(0)
    c-=a*b
    d=c+a-1
    bi=1
    for i in range(c):
        bi*=d-i
        bi//=(i+1)
    print(bi)