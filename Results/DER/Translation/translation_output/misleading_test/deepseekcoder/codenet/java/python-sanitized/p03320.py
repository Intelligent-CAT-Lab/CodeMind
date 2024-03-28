import sys
from collections import namedtuple

P = namedtuple('P', ['x', 'd'])

def db(*os):
    print(os, file=sys.stderr)

def validpos(x, y, r, c):
    return 0 <= x < r and 0 <= y < c

def bit(x, k):
    return (x >> k) & 1

def main():
    n = int(input())
    out = sys.stdout
    lis = []
    a = 9
    b = 10
    for i in range(1, 10):
        lis.append(P(i, -11 + i))
    lis.append(P(19, -1))

    for _ in range(1, 15):
        for w in range(1, 1000):
            x = w * b + a
            y = x
            e = 0
            while x > 0:
                e += x % 10
                x //= 10
            lis.append(P(y, y / e))
        b *= 10
        a *= 10
        a += 9

    lis.sort(key=lambda p: p.d)
    max = 0
    for w in range(len(lis)):
        if max < lis[w].x:
            max = lis[w].x
            print(max)
            n -= 1
            if n == 0:
                break

if __name__ == "__main__":
    main()