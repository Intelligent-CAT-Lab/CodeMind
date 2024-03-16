import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1 << 16)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise ValueError
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except EOFError:
                raise ValueError
            if self.numChars <= 0:
                return -1
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
    MOD = 998244353

    def __init__(self):
        self.fact = [0] * 500010
        self.ifact = [0] * 500010

    def comb(self, n, k):
        if k < 0 or k > n:
            return 0
        return self.fact[n] * self.ifact[k] % self.MOD * self.ifact[n - k] % self.MOD

    def solve(self, testNumber, inp, out):
        n = inp.nextInt()
        k = inp.nextInt()
        self.fact[0] = self.ifact[0] = 1
        for i in range(1, 500010):
            self.fact[