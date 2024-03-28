class main:
    import math
    
    N, d, x = map(int, input().split())
    
    ans = 0
    while N > 0.5:
        ans += d + x * (N - 0.5)
        d = (N +