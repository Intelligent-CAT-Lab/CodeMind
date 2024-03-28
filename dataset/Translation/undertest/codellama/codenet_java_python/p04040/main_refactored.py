class main:
    import sys
    
    class DIrohaAndAGrid:
        def modExp(self, x, y, mod):
            if y == 0:
                return 1 % mod
            ret = self.modExp(x, y >> 1, mod)
            ret = ret * ret % mod
            if (y & 1) == 1:
                ret = ret * (x % mod) % mod
            return ret
    
        def solve(self, testNumber, in, out):
            r = in.nextInt()
            c = in.nextInt()
            a = in.nextInt()
            b = in.nextInt()
            mod = 1000000007
            fact = [1] * (r + c)
            ifact = [1] * (r + c)
            fact[0] = 1
            ifact[0] = 1
            for i in range(1, r + c):
                fact[i] = fact[i - 1] * i % mod
                ifact[i] = ifact[i - 1] * self.modExp(i, mod - 2, mod) % mod
            res = fact[r - 1 + c - 1] * ifact[r - 1] % mod * ifact[c - 1] % mod
            sub = 0
            for x in range(0, b):
                v1 = fact[r - a - 1 + x] * ifact[r - a - 1] % mod * ifact[x] % mod
                v2 = fact[a - 1 + c - 1 - x] * ifact[a - 1] % mod * ifact[c - 1 - x] % mod
                sub = (sub + v1 * v2 % mod) % mod
            res = (res - sub + mod) % mod
            out.println(res)
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
            self.buf = bytearray(1024)
            self.curChar = 0
            self.numChars = -1
            self.filter = None
    
        def read(self):
            if self.numChars == -1:
                raise InputMismatchException()
            if self.curChar >= self.numChars:
                self.curChar = 0
                try:
                    self.numChars = self.stream.read(self.buf)
                except IOException:
                    raise InputMismatchException()
                if self.numChars <= 0:
                    return -1
            return self.buf[self.curChar++]
    
        def nextInt(self):
            c = self.read()
            while self.isSpaceChar(c):
                c = self.read()
            sgn = 1
            if c == '-':
                sgn = -1
                c = self.read()
            res = 0
            while not self.isSpaceChar(c):
                if c < '0' or c > '9':
                    raise InputMismatchException()
                res *= 1