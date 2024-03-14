import sys
import io

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = io.BytesIO()
        self.curChar = None
        self.numChars = None

    def read(self):
        if self.numChars == -1:
            raise EOFError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except EOFError:
                raise EOFError()
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar++]

    def nextInt(self):
        c = self.read()
        while isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == '-'.encode()[0]:
            sgn = -1
            c = self.read()
        res = 0
        while not isSpaceChar(c):
            if c < '0'.encode()[0] or c > '9'.encode()[0]:
                raise ValueError()
            res *= 10
            res += c - '0'.encode()[0]
            c = self.read()
        return res * sgn

def isSpaceChar(c):
    return c == ' '.encode()[0] or c == '\n'.encode()[0] or c == '\r'.encode()[0] or c == '\t'.encode()[0] or c == -1

class DIrohaAndAGrid:
    def modExp(self, x, y, mod):
        if y == 0:
            return 1 % mod
        ret = self.modExp(x, y >> 1, mod)
        ret = ret * ret % mod
        if y & 1 == 1:
            ret = ret * (x % mod) % mod
        return ret

    def solve(self, testNumber, s, w):
        r = s.nextInt()
        c = s.nextInt()
        a = s.nextInt()
        b = s.nextInt()
        mod = (10**9) + 7
        fact = [0]*(r + c)
        ifact = [0]*(r + c)
        fact[0] = 1
        ifact[0] = 1
        for i in range(1, r + c):
            fact[i] = fact[i - 1] * i % mod
            ifact[i] = ifact[i - 1] * self.modExp(i, mod - 2, mod) % mod
        res = fact[r - 1 + c - 1] * ifact[r - 1] % mod * ifact[c - 1] % mod
        sub = 0
        for x in range(b):
            v1 = fact[r - a - 1 + x] * ifact[r - a - 1] % mod * ifact[x] % mod
            v2 = fact[a - 1 + c - 1 - x] * ifact[a - 1] % mod * ifact[c - 1 - x] % mod
            sub = (sub + v1 * v2 % mod) % mod
        res = (res - sub