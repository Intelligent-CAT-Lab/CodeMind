from sys import stdin, stdout

class CRangeSet:
    def __init__(self):
        self.debug = Debug(False)
        self.mod = Modular(int(1e9) + 7)
        self.pow = Power(self.mod)
        self.a = 0
        self.b = 0
        self.f = []

    def solve(self, testNumber, in_stream, out_stream):
        n, self.a, self.b = map(int, in_stream.readline().split())
        if self.a < self.b:
            self.a, self.b = self.b, self.a

        self.f = [-1] * self.a

        ai = ArrayIndex(n + 1, self.a, 2)
        dp = [0] * ai.totalSize()
        dp[ai.indexOf(0, 0, 0)] = 1
        dp[ai.indexOf(0, 0, 1)] = 1
        sum_vals = [0, 0]
        for i in range(1, n + 1):
            sum_vals = [0, 0]
            for j in range(self.a):
                lend = 1 if j == i - 1 else 0
                sum_vals[0] = self.mod.plus(sum_vals[0], self.mod.mul(dp[ai.indexOf(i - 1, j, 0)], self.f[j - 2 + lend]))
            for j in range(self.b):
                sum_vals[1] = self.mod.plus(sum_vals[1], dp[ai.indexOf(i - 1, j, 1)])

            for k in range(1, self.a):
                if k == 1:
                    dp[ai.indexOf(i, k, 0)] = sum_vals[1]
                else:
                    dp[ai.indexOf(i, k, 0)] = dp[ai.indexOf(i - 1, k - 1, 0)]

            for k in range(1, self.b):
                if k == 1:
                    dp[ai.indexOf(i, k, 1)] = sum_vals[0]
                else:
                    dp[ai.indexOf(i, k, 1)] = dp[ai.indexOf(i - 1, k - 1, 1)]

        sum_vals = [0, 0]
        for j in range(self.a):
            sum_vals[0] = self.mod.plus(sum_vals[0], self.mod.mul(dp[ai.indexOf(n, j, 0)], self.f[j - 1]))

        for j in range(self.b):
            sum_vals[1] = self.mod.plus(sum_vals[1], dp[ai.indexOf(n, j, 1)])

        invalid = self.mod.plus(sum_vals[0], sum_vals[1])
        total = self.pow.pow(2, n)
        valid = self.mod.subtract(total, invalid)
        out_stream.write(str(valid) + "\n")

    def f(self, i):
        if i <= 0:
            return 1
        if self.f[i] == -1:
            self.f[i] = self.f(i - 1)
            for t in range(self.b, i):
                self.f[i] = self.mod.plus(self.f[i], self.f(i - t - 1))
        return self.f[i]

class Power:
    def __init__(self, modular):
        self.modular = modular

    def pow(self, x, n):
        if n == 0:
            return self.modular.valueOf(1)
        r = self.pow(x, n >> 1)
        r = self.modular.valueOf(int(r * r))
        if n & 1 == 1:
            r = self.modular.valueOf(int(r * x))
        return r

class Modular:
    def __init__(self, m):
        self.m = m

    def valueOf(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.valueOf(int(x * y))

    def plus(self, x, y):
        return self.valueOf(x + y)

    def subtract(self, x, y):
        return self.valueOf(x - y)

class FastInput:
    def __init__(self, stream):
        self.is = stream
        self.buf = bytearray()
        self.bufLen = 0
        self.bufOffset = 0
        self.next = 0

    def read(self):
        while self.bufLen == self.bufOffset:
            self.bufOffset = 0
            self.buf = self.is.read(1 << 13)
            if len(self.buf) == 0:
                return -1
            self.bufLen = len(self.buf)
        return self.buf[self.bufOffset]

    def skipBlank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def readInt(self):
        sign = 1
        self.skipBlank()
        if self.next == 43 or self.next == 45:
            sign = 1 if self.next == 43 else -1
            self.next = self.read()

        val = 0
        if sign == 1:
            while self.next >= 48 and self.next <= 57:
                val = val * 10 + self.next - 48
                self.next = self.read()
        else:
            while self.next >= 48 and self.next <= 57:
                val = val * 10 - self.next + 48
                self.next = self.read()

        return val

class ArrayIndex:
    def __init__(self, *dimensions):
        self.dimensions = dimensions

    def totalSize(self):
        ans = 1
        for x in self.dimensions:
            ans *= x
        return ans

    def indexOf(self, a, b, c=-1):
        if c == -1:
            return a * self.dimensions[1] + b
        return self.indexOf(a, b) * self.dimensions[2] + c

def main():
    solver = CRangeSet()
    n, a, b = map(int, input().strip().split())
    solver.solve(1, stdin, stdout)

if __name__ == '__main__':
    main()