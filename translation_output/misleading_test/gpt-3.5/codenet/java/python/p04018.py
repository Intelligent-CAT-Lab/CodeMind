```python
import sys

class KMPAutomaton:
    def __init__(self, cap):
        self.data = [''] * (cap + 2)
        self.fail = [0] * (cap + 2)
        self.buildLast = 0
        self.matchLast = 0
        self.length = cap

    def isMatch(self):
        return self.matchLast == self.length

    def length(self):
        return self.length

    def beginMatch(self):
        self.matchLast = 0

    def match(self, c):
        self.matchLast = self.visit(c, self.matchLast) + 1

    def visit(self, c, trace):
        while trace >= 0 and self.data[trace + 1] != c:
            trace = self.fail[trace]
        return trace

    def build(self, c):
        self.buildLast += 1
        self.fail[self.buildLast] = self.visit(c, self.fail[self.buildLast - 1]) + 1
        self.data[self.buildLast] = c

class FastIO:
    def __init__(self, is=sys.stdin, os=sys.stdout):
        self.cache = []
        self.is = is
        self.os = os
        self.charset = 'ascii'
        self.defaultStringBuf = []
        self.buf = is.read(1 << 13)
        self.bufLen = len(self.buf)
        self.bufOffset = 0
        self.next = 0

    def read(self):
        while self.bufOffset == self.bufLen:
            self.bufOffset = 0
            self.buf = self.is.read(1 << 13)
            if not self.buf:
                return -1
            self.bufLen = len(self.buf)
        result = self.buf[self.bufOffset]
        self.bufOffset += 1
        return result

    def skipBlank(self):
        while 0 <= self.next <= 32:
            self.next = self.read()

    def readInt(self):
        sign = 1

        self.skipBlank()
        if self.next in [43, 45]:
            sign = 1 if self.next == 43 else -1
            self.next = self.read()

        val = 0
        if sign == 1:
            while 48 <= self.next <= 57:
                val = val * 10 + self.next - 48
                self.next = self.read()
        else:
            while 48 <= self.next <= 57:
                val = val * 10 - self.next + 48
                self.next = self.read()

        return val

    def readLine(self):
        line = ''
        while self.next != -1 and self.next != 10:
            line += chr(self.next)
            self.next = self.read()
        return line

def solve(io):
    s = ['' for _ in range(1000000)]
    n = io.readString(s, 0)

    kmp = KMPAutomaton(n)
    inv = KMPAutomaton(n)
    for i in range(n):
        kmp.build(s[i])
        inv.build(s[n - i - 1])
    
    p = n - kmp.fail[n]
    if n % p != 0:
        p = n

    if p == 1:
        answer(1, n, io)
        return
    if p == n:
        answer(1, 1, io)
        return
    cnt = 0
    for i in range(2, n + 1):
        p1 = i - 1 - kmp.fail[i - 1]
        p2 = (n + 1 - i) - inv.fail[n + 1 - i]

        f1 = p1 == (i - 1) or (i - 1) % p1 != 0
        f2 = p2 == (n + 1 - i) or (n + 1 - i) % p2 != 0
        if f1 and f2:
            cnt += 1

    answer(2, cnt, io)

def answer(len, cnt, io):
    io.cache.append(str(len) + '\n' + str(cnt))

if __name__ == '__main__':
    io = FastIO()
    solve(io)
    io.flush()
```

