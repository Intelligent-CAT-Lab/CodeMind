class main:
    N = int(input())
    d1 = float(input())
    x = float(input())
    
    ans = 0
    
    for N > 0:
        ans += d1 + (N - 0.5) * x
        d1 = ((2 * N + 2) * d1 + 5 * x) / (2 * N)
        x = ((N + 2) / N) * x
    
    print(ans)