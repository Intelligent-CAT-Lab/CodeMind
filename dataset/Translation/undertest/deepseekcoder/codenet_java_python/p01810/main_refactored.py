class main:
    import sys
    
    def p01810():
        N, K = map(int, sys.stdin.readline().split())
        ans = 0
        for i in range(N - 1):
            ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
        print(ans)
    
    p01810()