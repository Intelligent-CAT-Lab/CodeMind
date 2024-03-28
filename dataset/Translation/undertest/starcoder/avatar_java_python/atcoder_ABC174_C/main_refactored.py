class main:
    import sys
    
    n = int(sys.stdin.readline())
    num = 7
    res = 1
    
    while num < n:
        num = num * 10 + 7
        res += 1
    
    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num in set:
            res = -1
            break
        set.add(num)
        num = num * 10 + 7
    
    print(res)