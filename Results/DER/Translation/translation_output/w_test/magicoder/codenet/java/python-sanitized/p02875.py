import sys

class OutputWriter:
    def __init__(self, writer):
        self.writer = writer

    def print(self, *args):
        for i in range(len(args)):
            if i != 0:
                self.writer.write(' ')
            self.writer.write(str(args[i]))

    def printLine(self, *args):
        self.print(*args)
        self.writer.write('\n')

    def close(self):
        self.writer.close()

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def read(self):
        return self.stream.read(1)

    def readSkipSpace(self):
        c = self.read()
        while c == ' ':
            c = self.read()
        return c

    def nextInt(self):
        c = self.readSkipSpace()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while c >= '0' and c <= '9':
            res = res * 10 + ord(c) - ord('0')
            c = self.read()
        return res * sgn

class TaskC:
    def __init__(self):
        self.mod = 998244353

    def solve(self, testNumber, inp, out):
        n = inp.nextInt() // 2
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in range(1, n):
            res = (res * 9) % self.mod
            if i > 1:
                inc = p2
                inc = (inc * num) % self.mod
                inc = (inc * pow(den, self.mod - 2, self.mod)) % self.mod
                res = (res + inc) % self.mod
            p2 = (p2 * 2) % self.mod
            k = i
            num = (num * 2 * k) % self.mod
            num = (num * (2 * k + 1)) % self.mod
            if k > 1:
                den = (den * (k - 1)) % self.mod
            den = (