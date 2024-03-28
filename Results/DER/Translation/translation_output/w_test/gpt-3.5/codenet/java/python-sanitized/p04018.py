import sys
import math

class Task:
    def __init__(self, io, debug):
        self.io = io
        self.debug = debug

    def solve(self):
        s = [''] * 1000000
        n = self.io.readString(s, 0)

        kmp = KMPAutomaton(n)
        inv = KMPAutomaton(n)
        for i in range(n):
            kmp.build(s[i])
            inv.build(s[n - i - 1])
        p = n - kmp.fail[n]
        if n % p != 0:
            p = n

        if p == 1:
            self.answer(n, 1)
            return
        if p == n:
            self.answer(1, 1)
            return
        cnt = 0
        for i in range(2, n + 1):
            p1 = i - 1 - kmp.fail[i - 1]
            p2 = (n + 1 - i) - inv.fail[n + 1 - i]

            f1 = p1 == (i - 1) or (i - 1) % p1 != 0
            f2 = p2 == (n + 1 - i) or (n + 1 - i) % p2 != 0
            if f1 and f2:
                cnt += 1

        self.answer(2, cnt)

    def answer(self, length, count):
        self.io.cache.append(str(length) + '\n' + str(count))

class KMPAutomaton:
    def __init__(self, cap):
        self.data = [''] * (cap + 2)
        self.fail = [-1] * (cap + 2)
        self.buildLast = 0
        self.matchLast = 0
        self.length = cap

    def visit(self, c, trace):
        while trace >= 0 and self.data[trace + 1] != c:
            trace = self.fail[trace]
        return trace

    def build(self, c):
        self.buildLast += 1
        self.fail[self.buildLast] = self.visit(c, self.fail[self.buildLast - 1]) + 1
        self.data[self.buildLast] = c

class FastIO:
    def __init__(self, isys, osys):
        self.isys = isys
        self.osys = osys
        self.cache = ''
        self.next = -1

    def readString(self, s, offset):
        originalOffset = offset
        self.skipBlank()
        while self.next > 32:
            s[offset] = chr(self.next)
            offset += 1
            self.next = self.read()
        return offset - originalOffset

    def skipBlank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read(self):
        c = self.isys.read(1)
        if not c:
            return -1
        return ord(c)

class Debug:
    def __init__(self, allowDebug):
        self.allowDebug = allowDebug

def main():
    try:
        charset = 'ascii'

        io = FastIO(sys.stdin.buffer, sys.stdout.buffer)
        debug = Debug(False)
        task = Task(io, debug)

        task.solve()

        io.cache += '\n'
        io.osys.write(io.cache.encode(charset))
        io.osys.flush()

    except Exception as e:
        if debug.allowDebug:
            raise e
        sys.exit()

if __name__ == '__main__':
    main()