def is_all_8(n):
    while n > 0:
        if n % 10!= 8:
            return False
        n //= 10
    return True

def func(n):
    if n in cache:
        return cache[n]
    
    if is_all_8(n):
        return 1
    
    max_len = len(str(n))
    res = -1
    for dlen in range(max_len, 0, -1):
        for i in range(1 << dlen):
            d = 0
            ten = 1
            for j in range(dlen):
                if (i & (1 << j)) == 0:
                    d += ten * 8
                else:
                    d += ten * 2
                ten *= 10
            if n < d:
                continue
            if n % d == 0:
                res = max(res, func(n // d) + func(d))
    cache[n] = res
    return res

n = int(input())
if n == 1:
    print(-1)
else:
    cache = {}
    print(func(n))