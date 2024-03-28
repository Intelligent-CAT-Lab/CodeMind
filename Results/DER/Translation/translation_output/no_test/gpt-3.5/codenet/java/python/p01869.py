```python
import sys
from collections import defaultdict

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.buf = ""
        self.curChar = 0

    def read(self):
        while self.curChar >= len(self.buf):
            self.buf = self.stream.readline()
            self.curChar = 0
            if not self.buf:
                return -1
        char = self.buf[self.curChar]
        self.curChar += 1
        return char

    def isSpaceChar(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def isEndline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def next(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = ""
        while not self.isSpaceChar(c):
            res += c
            c = self.read()
        return res

class Solution:
    def __init__(self):
        self.hash = defaultdict(int)

    def is_all_8(self, d):
        while d > 0:
            if d % 10 != 8:
                return False
            d //= 10
        return True

    def func(self, n):
        if n in self.hash:
            return self.hash[n]

        same = False
        now = n
        res = -1
        max_len = len(str(n))
        
        for dlen in range(max_len, 0, -1):
            for i in range(1 << dlen):
                d = 0
                ten = 1
                for j in range(dlen):
                    if not i & (1 << j):
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
                    res = max(res, self.func(now // d) + self.func(d))

        if same:
            res = max(res, 1)
        elif res == -1:
            res = -100000000

        self.hash[n] = res
        return res

    def solve(self):
        n = int(input())
        if n == 1:
            print(-1)
            return

        res = self.func(n)
        print(res if res >= -1 else -1)

if __name__ == '__main__':
    Solution().solve()
```
