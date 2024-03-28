class main:
    import math
    
    N, D = map(int, input().split())
    
    ans = math.ceil(N / (D * 2 + 1))
    
    print(ans)