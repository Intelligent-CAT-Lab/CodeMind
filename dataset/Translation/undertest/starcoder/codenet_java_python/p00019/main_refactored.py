class main:
    import sys
    
    N = int(sys.stdin.readline())
    
    ans = 1
    for i in range(N-1):
    	ans *= N
    
    print(ans)