import sys
from io import StringIO
from typing import List
import math

class P:
    def __init__(self, x: int, d: float):
        self.x = x
        self.d = d

    def __lt__(self, other):
        return self.d > other.d

class Reader:
    def __init__(self, inp: StringIO):
        self.inp = inp
        self.st = None

    def next_string(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.inp.readLine())
        return self.st.nextToken()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())

def db(*os):
    print(*os, file=sys.stderr)

def valid_pos(x: int, y: int, r: int, c: int):
    return 0 <= x < r and 0 <= y < c

def bit(x: int, k: int):
    return (x >> k) & 1

def solve():
    inp = StringIO(sys.stdin.read())
    reader = Reader(inp)
    n = reader.next_int()
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
    lis.sort()
    max_val = 0
    for w in range(len(lis)):
        if max_val < lis[w].x:
            max_val = lis[w].x
            print(max_val)
            n -= 1
            if n == 0:
                break

def main():
    solve()

if __name__ == '__main__':
    main()