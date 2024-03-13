import io
import math
import sys


def solve():
    n = ni()
    K = nl()
    K -= 1
    sins = [0]*(n+1)
    for i in range(n+1):
        sins[i] = math.sin(2*math.pi*i/n)/2

    low = 0
    high = 2*math.pi
    for rep in range(50):
        h = (low+high)/2
        if count(h, n, sins) <= K:
            low = h
        else:
            high = h
    print("%.14f" % high)

def count(h, n, sins):
    ret = 0
    for len in range(1, n):
        low = 0
        high = (n-len)//2+1
        while high-low > 1:
            q = (high+low)//2
            if S(len, q, n-len-q, sins) <= h:
                low = q
            else:
                high = q
        ret += low*2