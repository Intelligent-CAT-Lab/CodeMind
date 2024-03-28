class main:
    import math
    
    N, D = map(int, input().split())
    
    ans = round(N / (D * 2 + 1), 0)
    print(ans)