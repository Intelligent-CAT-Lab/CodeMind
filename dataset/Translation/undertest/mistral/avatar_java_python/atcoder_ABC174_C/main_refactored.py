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
        if num not in set:
            set.add(num)
        else:
            res = -1
            break
        num = num * 10 + 7
    
    print(res)