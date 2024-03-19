import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1 << 16)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise EOFError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except EOFError:
                self.numChars = -1
            if self.numChars <= 0:
                raise EOFError()
        return self.buf[self.curChar]

    def nextInt(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        sgn = 1 if c != 45 else -1
        if c == 45:
            c = self.read()
        res = 0
        while c >= 48 and c <= 57:
            res = res * 10 + c - 48
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, i):
        self.stream.write(str(i).encode())
        self.stream.write(b'\n')

class TaskE:
    def __init__(self):
        self.mod = 998244353
        self.n = 0
        self.k = 0
        self.fact = []
        self.ifact = []

    def comb(self, n, k):
        if k < 0 or k > n:
            return 0
        return self.fact[n] * self.ifact[k] % self.mod * self.ifact[n - k] % self.mod

    def solve(self, testNumber, inp, out):
        self.n = inp.nextInt()
        self.k = inp.nextInt()
        self.fact,