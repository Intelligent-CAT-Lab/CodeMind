class main:
    x, k, d = map(int, input().split())
    
    ans = 0
    absX = abs(x)
    if absX // d >= k:
        ans = absX - k * d
    else:
        sho = absX // d
        amari = absX % d
        if (k - sho) % 2 == 0:
            ans = amari
        else:
            ans = d - amari
    
    print(ans)