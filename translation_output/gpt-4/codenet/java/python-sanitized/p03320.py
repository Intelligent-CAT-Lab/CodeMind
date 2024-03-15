import sys
from functools import cmp_to_key

mod = 1000000007


class P:
    def __init__(self, x, d):
        self.x = x
        self.d = d

    def __lt__(self, other):
        return self.d < other.d


def main():
    n = int(input())
    d = [0] * 1000

    lis = []
    a, b = 9, 10
    for i in range(1, 10):
        lis.append(P(i, -11 + i))
    lis.append(P(19, -1))

    for i in range(1, 15):
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

    lis.sort(key=cmp_to_key(lambda p1, p2: -1 if p