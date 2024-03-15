import math
import sys
import io
import atexit

# Set up standard input and output streams
if INPUT:
    sys.stdin = io.StringIO(INPUT)

sins = []

def solve():
    n = ni()
    K = nl()
    K -= 1
    global sins
    sins = [math.sin(2 * math.pi * i / n) / 2 for i in range(n + 1)]
    
    low, high = 0, 2 * math.pi
    for rep in range(50):
        h = (low + high) / 2
        if count(h, n) <= K:
            low = h
        else:
            high = h
    print("{:.14f}".format(high))

def count(h, n):
    ret = 0
    for len in range(1, n):
        low, high = 0, (n - len) // 2 + 1
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

def ni():
    return int(ns())

def nl():
    return int(ns())

def ns():
    return sys.stdin.readline().strip()

def main():
    solve()

if __name__ == "__main__":
    main()