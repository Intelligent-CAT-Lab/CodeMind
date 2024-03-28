import sys
from collections import defaultdict

class FastInput:
    def __init__(self):
        self.buffer = sys.stdin.buffer
        self.NI = iter(self.buffer.read().decode().splitlines()).__next__
    
    def I(self):
        return int(self.NI())

class FastOutput:
    def __init__(self):
        self.buffer = []
        self.write = sys.stdout.write

    def flush(self):
        self.write('\n'.join(self.buffer))
        self.write('\n')
        self.buffer = []

    def w(self, s):
        self.buffer.append(str(s))
    
    def writeln(self, s):
        self.buffer.append(str(s))
        self.flush()

class CRangeSet:
    def __init__(self):
        self.mod = 10**9 + 7
        self.a = 0
        self.b = 0
        self.f = {}

    def solve(self, testNumber, in_obj, out_obj):
        n = in_obj.I()
        self.a, self.b = map(int, in_obj.NI().split())
        if self.a < self.b:
            self.a, self.b = self.b, self.a

        for i in range(self.a):
            self.f[i] = -1

        ai = ArrayIndex(n + 1, self.a, 2)
        dp = defaultdict(int)
        dp[ai.indexOf(0, 0, 0)] = 1
        dp[ai.indexOf(0, 0, 1)] = 1
        sum = [0, 0]

        for i in range(1, n + 1):
            sum[0] = 0
            sum[1] = 0

            for j in range(self.a):
                lend = 1 if j == i - 1 else 0
                sum[0] = (sum[0] + dp[ai.indexOf(i - 1, j, 0)] * self.f[j - 2 + lend]) % self.mod

            for j in range(self.b):
                sum[1] = (sum[1] + dp[ai.indexOf(i - 1, j, 1)]) % self.mod

            for k in range(1, self.a):
                if k == 1:
                    dp[ai.indexOf(i, k, 0)] = sum[1]
                else:
                    dp[ai.indexOf(i, k, 0)] = dp[ai.indexOf(i - 1, k - 1, 0)]

            for k in range(1, self.b):
                if k == 1:
                    dp[ai.indexOf(i, k, 1)] = sum[0]
                else:
                    dp[ai.indexOf(i, k, 1)] = dp[ai.indexOf(i - 1, k - 1, 1)]

        sum = [0, 0]
        for j in range(self.a):
            sum[0] = (sum[0] + dp[ai.indexOf(n, j, 0)] * self.f[j - 1]) % self.mod

        for j in range(self.b):
            sum[1] = (sum[1] + dp[ai.indexOf(n, j, 1)]) % self.mod

        invalid = (sum[0] + sum[1]) % self.mod
        total = pow(2, n, self.mod)
        valid = (total - invalid) % self.mod
        out_obj.writeln(valid)

    def f(self, i):
        if i <= 0:
            return 1
        if i not in self.f:
            self.f[i] = self.f(i - 1)
            for t in range(self.b, i):
                self.f[i] = (self.f[i] + self.f(i - t - 1)) % self.mod
        return self.f[i]

class Power:
    def __init__(self, modular):
        self.modular = modular

    def pow(self, x, n):
        if n == 0:
            return 1
        r = self.pow(x, n // 2)
        r = (r * r) % self.modular
        if n % 2 == 1:
            r = (r * x) % self.modular
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
        return self.valueOf(x * y)

    def plus(self, x, y):
        return self.valueOf(x + y)

    def subtract(self, x, y):
        return self.valueOf(x - y)

class ArrayIndex:
    def __init__(self, *dimensions):
        self.dimensions = dimensions

    def totalSize(self):
        ans = 1
        for x in self.dimensions:
            ans *= x
        return ans

    def indexOf(self, a, b, c=None):
        if c is not None:
            return self.indexOf(a, b) * self.dimensions[2] + c
        return a * self.dimensions[1] + b

def main():
    inp = FastInput()
    out = FastOutput()
    solver = CRangeSet()
    solver.solve(1, inp, out)

    out.flush()

if __name__ == '__main__':
    main()