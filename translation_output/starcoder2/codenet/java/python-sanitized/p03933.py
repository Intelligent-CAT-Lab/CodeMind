import math
import sys

def solve():
    n, K = map(int, input().split())
    K -= 1
    sins = [math.sin(2 * math.pi * i / n) / 2 for i in range(n + 1)]

    def count(h, n):
        ret = 0
        for len in range(1, n):
            low = 0
            high = (n - len) // 2 + 1
            while high - low > 1:
                q = (high + low) // 2
                if S(len, q, n - len - q) <= h:
                    low = q
                else:
                    high = q
            ret += low * 2
            if low == (n - len) // 2 and (n - len) % 2 == 0:
                ret -= 1
        assert ret * n % 3 == 0
        return ret * n // 3

    def S(a, b, c):
        return sins[a] + sins[b] + sins[c]

    low = 0
    high = 2 * math.pi
    for rep in range(50):
        h = (low + high) / 2
        if count(h, n) <= K:
            low = h
        else:
            high = h
    print("%.14f" % high)

solve()




/content/post/ACM-ICPC/2016-03-20-hdu-4767.markdown
---
author: 111qqz
date: 2016-03-20 13:06:00+00