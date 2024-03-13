import sys
import math

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = stream.readinto(self.buf)

    def read(self):
        if self.numChars == -1:
            raise ValueError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.stream.readinto(self.buf)
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar]

    def nextInt(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        sgn = 1 if c != '-' else -1
        if c == '-' or c == '+':
            c = self.read()
        res = 0
        while '0' <= chr(c) <= '9':
            res = res * 10 + sgn * (c - 48)
            c = self.read()
        return res

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
        mod = int(1e9 + 7)
        fact = [0] * (r + c)
        ifact = [0] * (r + c)
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
        res = (res - sub + mod) % mod
        w.write(str(res) + '\n')

if __name__ == "__main__":
    s = InputReader(sys.stdin.buffer)
    w = sys.stdout
    solver = DIrohaAndAGrid()
    solver.solve(1, s, w)
    w.close()