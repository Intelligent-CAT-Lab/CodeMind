import math
import io
import sys

def solve():
    n, K = map(int, input().split())
    K -= 1
    sins = [math.sin(2*math.pi*i/n)/2 for i in range(n+1)]
    low, high = 0, 2*math.pi
    for _ in range(50):
        h = (low+high)/2
        if count(h, n, sins) <= K:
            low = h
        else:
            high = h
    print("{:.14f}".format(high))

def count(h, n, sins):
    ret = 0
    for len in range(1, n):
        low, high = 0, (n-len)//2+1
        while high-low > 1:
            q = (high+low)//2
            if S(len, q, n-len-q, sins)