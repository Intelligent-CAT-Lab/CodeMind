class main:
    import sys
    
    n = int(input())
    num = 7
    res = 1
    
    while num < n:
        num = num * 10 + 7
        res += 1
    
    set = set()
    
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