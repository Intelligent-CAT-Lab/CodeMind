class main:
    import sys
    
    L, R, d = map(int, sys.stdin.readline().split())
    
    ans = 0
    for i in range(L, R+1):
        if i % d == 0:
            ans += 1
    
    print(ans)