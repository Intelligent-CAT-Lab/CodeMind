```python
import sys
from collections import defaultdict

def is_all_8(d):
    while d > 0:
        if d % 10 != 8:
            return False
        d //= 10
    return True

hash_map = defaultdict(int)

def func(n):
    if hash_map[n] != 0:
        return hash_map[n]
    
    same = False
    now = n
    res = -1
    max_len = len(str(n))
    
    for dlen in range(max_len, 0, -1):
        for i in range(1 << dlen):
            d = 0
            ten = 1
            for j in range(dlen):
                if i & (1 << j) == 0:
                    d += ten * 8
                else:
                    d += ten * 2
                ten *= 10
            
            if n == d:
                same = True
                continue
            if now < d:
                continue
            if now % d == 0:
                res = max(res, func(now // d) + func(d))
    
    if same:
        res = max(res, 1)
    elif res == -1:
        res = -100000000
    
    hash_map[n] = res
    return res

def solve():
    n = int(input())
    if n == 1:
        print(-1)
        return
    
    res = func(n)
    print(res if res <= -1 else -1)

if __name__ == "__main__":
    solve()
```

