import math
from io import BytesIO
import sys

sins = []


def solve():
    global sins
    n = int(input())
    K = int(input())
    K -= 1
    sins = [math.sin(2*math.pi*i/n)/2 for i in range(n+1)]

    low, high = 0, 2*math.pi
    for _ in range(50):
        h = (low + high) / 2
        if count(h, n) <= K:
            low = h
        else:
            high = h
    print("{:.14f}".format(high))


def count(h, n):
    ret = 0
    for length in range(1, n):
        low, high = 0, (n-length)//2 + 1
        while high - low > 1:
            q = (high + low) // 2
            if S(length, q, n-length-q) <= h:
                low = q
            else:
                high = q
        ret += low * 2
        if low == (n-length)//2 and (n-length) % 2 == 0:
            ret -= 1
    assert ret * n % 3 == 0
    return ret * n / 3


def S(a, b, c):
    return sins[a] + sins[b] + sins[c]


if __name__ == "__main__":
    solve()