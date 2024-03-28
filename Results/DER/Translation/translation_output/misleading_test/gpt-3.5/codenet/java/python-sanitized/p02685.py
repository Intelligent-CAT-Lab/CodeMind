import sys
import math

class InputReader:
    def __init__(self):
        self.stream = sys.stdin
        self.curChar = 0
        self.numChars = 0
        self.buf = [0] * 1024
        self.filter = None

    def read(self):
        if self.numChars == -1:
            raise Exception("Input Mismatch Exception")
        
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.buf = self.stream.read(1024)
            if not self.buf:
                return -1
            self.numChars = len(self.buf)
        
        result = self.buf[self.curChar]
        self.curChar += 1
        return result

    def nextLine(self):
        try:
            return input()
        except EOFError:
            return None

    def nextInt(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        
        sign = 1
        if c == 45:  # Dash '-'
            sign = -1
            c = self.read()
        
        res = 0
        while 48 <= c <= 57:
            res = res * 10 + c - 48
            c = self.read()

        return res * sign

    def nextLong(self):
        return self.nextInt()

    def nextDouble(self):
        return float(self.readLine())

    def readString(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        
        res = []
        while c > 32:
            res.append(chr(c))
            c = self.read()
        
        return ''.join(res)

    def isSpaceChar(self, c):
        return c <= 32

    def next(self):
        return self.readString()

class Solution:
    def mod_pow(self, a, p, m):
        if a == 1:
            return 1
        ans = 1
        while p > 0:
            if p % 2 == 1:
                ans = (ans * a) % m
            a = (a * a) % m
            p >>= 1
        return ans

    def mod_inv(self, a, m):
        return self.mod_pow(a, m - 2, m)

    def NcR(self, n, r):
        return self.mul(self.fact[n], self.mul(self.ifact[r], self.ifact[n - r]))

    def sub(self, a, b):
        return ((a - b) % self.mod + self.mod) % self.mod

    def mul(self, a, b):
        a %= self.mod
        b %= self.mod
        return (a * b) % self.mod

    def add(self, a, b):
        a %= self.mod
        b %= self.mod
        return (a + b) % self.mod

    def run(self):
        sc = InputReader()
        out = sys.stdout

        n = sc.nextInt()
        m = sc.nextLong()
        k = sc.nextLong()
        ans = 0
        self.fact = [0] * (n + 1)
        self.ifact = [0] * (n + 1)
        self.fact[0] = self.fact[1] = self.ifact[0] = self.ifact[1] = 1

        for i in range(2, n + 1):
            self.fact[i] = (self.fact[i - 1] * i) % self.mod
            self.ifact[i] = self.mod_inv(self.fact[i], self.mod)

        for i in range(k + 1):
            ans = self.add(ans, self.mul(m, self.mul(m, self.NcR(n, i))))

        out.write(str(ans) + "\n")
        out.close()

if __name__ == "__main__":
    Solution().run()