import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.stream = input_stream
        self.buf = bytearray(1 << 16)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise Exception("Input is exhausted")
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except EOFError:
                return -1
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar++]

    def nextInt(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        sgn = 1 if c != 45 else -1
        c = self.read() if c == 45 else c
        res = 0
        while c >= 48 and c <= 57:
            res = res * 10 + c - 48
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, output_stream = sys.stdout):
        self.writer = output_stream

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + '\n')

class TaskE:
    mod = 998244353

    def comb(self, n, k):
        if k < 0 or k > n: return 0
        return self.fact[n] * self.ifact[k] % self.mod * self.ifact[n - k] % self.mod

    def solve(self, testNumber, inp, out):
        self.n = inp.nextInt()
        self.k = inp.nextInt()
        x = Factorials.getFIF(500010, self.mod