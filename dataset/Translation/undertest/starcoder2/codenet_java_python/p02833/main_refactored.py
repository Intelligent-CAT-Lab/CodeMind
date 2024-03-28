class main:
    import sys
    
    n = int(sys.stdin.readline())
    if n % 2 == 1:
        print(0)
        exit()
    
    ans = 0
    base = 10
    while True:
        if base > n:
            break
        ans += n // base
        base *= 5
    print(ans)