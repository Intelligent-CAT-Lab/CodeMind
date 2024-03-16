import sys

class Solver:
    def __init__(self, n, k):
        self.n = n
        self.k = k
        self.mc = ModCalculator(1_000_000_007)

    def calculate_order1(self):
        dptable = [[0] * self.n for _ in range(self.n)]
        dptable[self.n - 1][0] = 1
        for i in range(self.k):
            for j in range(self.n - 1 - i):
                t = self.n - 1 - i - j
                for k in range(1, j + 1):
                    dptable[j - k][t + k - 1] = self.mc.add(dptable[j - k][t + k - 1], dptable[j][t])
                if t > 0:
                    dptable[j][t - 1] = self.mc.add(dptable[j][t - 1], dptable[j][t])

        sum = 0
        for j in range(self.n - self.k + 1):
            sum = self.mc.add(sum, dptable[j][self.n - self.k - j])
        return sum

    def calculate_order2(self):
        dptable = [[0] * self.n for _ in range(self.n)]
        dptable[self.n - 1][0] = 1
        for i in range(self.k - 1):
            dptable[self.n - 2 - i - 1][0] = self.mc.add(dptable[self.n - 1 - i][0], dptable[self.n-2-i-1][1])
            for j in range(1, self.n - 1 - i - 1):
                dptable[self.n - 2 - i - 1 - j][j] = self.mc.add(dptable[self.n - 2 - i - 1 - j + 1][j - 1], dptable[self.n - 2 - i - 1 - j][j + 1])

        sum = 0
        for j in range(self.n - self.k + 1):
            sum = self.mc.add(sum, dptable[j][self.n - self.k - j])
        return sum

    def solve(self):
        self.mc = ModCalculator(1_000_000_007)
        v12 = self.calculate_order2()
        v2 = self.mc.pow(2, self.n - self.k - 1)
        return self.mc.mul(v12, v2)

class ContestReader:
    def __init__(self, in_stream):
        self.reader = in_stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readline())
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

class ModCalculator:
    def __init__(self, mod):
        self.mod = mod
        self.modCombinationCache = self.ModCombinationCache()

    def add(self, a, b):
        return (a + b) % self.mod

    def sub(self, a, b):
        return (a - b + self.mod) % self.mod

    def mul(self, a, b):
        return (a * b) % self.mod

    def pow(self, a, b):
        if b == 0:
            return 1
        v = self.pow(self.mul(a, a), b // 2)
        if b % 2 == 1:
            return self.mul(v, a)
        else:
            return v

    def inverse(self, a):
        return self.pow(a, self.mod - 2)

    def div(self, a, b):
        return self.mul(a, self.inverse(b))

    def getF(self, n):
        return self.modCombinationCache.getF(n)

    def getP(self, n, r):
        return self.modCombinationCache.getP(n, r)

    def getC(self, n, k):
        return self.modCombinationCache.getC(n, k)

    class ModCombinationCache:
        def __init__(self):
            self.factorialCache = [1]
            self.factorialInverseCache = [1]

        def resize(self, n):
            for i in range(len(self.factorialCache), n + 1):
                v = self.mul(self.factorialCache[-1], i)
                self.factorialCache.append(v)
                self.factorialInverseCache.append(self.inverse(v))

        def getF(self, n):
            self.resize(n)
            return self.factorialCache[n]

        def getP(self, n, r):
            self.resize(n)
            return self.mul(self.factorialCache[n], self.factorialInverseCache[n - r])

        def getC(self, n, k):
            self.resize(n)
            return self.mul(self.factorialCache[n], self.mul(self.factorialInverseCache[k], self.factorialInverseCache[n - k]))

class StringTokenizer:
    def __init__(self, s):
        self.tokens = s.strip().split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        token = self.tokens[self.index]
        self.index += 1
        return token

def execute(reader, out):
    n = reader.nextInt()
    k = reader.nextInt()
    out.write(str(Solver(n, k).solve()) + '\n')

if __name__ == '__main__':
    reader = ContestReader(sys.stdin)
    execute(reader, sys.stdout)