class main:
    import sys
    
    a, b = map(int, sys.stdin.readline().split())
    count = 0
    while a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    ans = a // 2 + b // 2
    print(count, ans)