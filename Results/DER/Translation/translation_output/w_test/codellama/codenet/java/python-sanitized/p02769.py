import math

class ERoaming:
    def __init__(self, n, k):
        self.n = n
        self.k = k
        self.fact = [1] * (n + 1)
        self.factinv = [1] * (n + 1)
        self.mod = 1000000007
        self.gen()

    def gen(self):
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1]
            self.fact[i] %= self.mod
            self.factinv[i] = math.pow(self.fact[i], self.mod - 2, self.mod)

    def solve(self):
        if self.k >= self.n:
            return math.nCrs(self.n + self.n - 1, self.n - 1, self.mod)
        else:
            ans = 0
            for i in range(0, self.k + 1):
                up = self.fact[self.n] * self.fact[self.n - 1]
                up %= self.mod
                den1 = self.factinv[i] * self.factinv[i]
                den1 %= self.mod
                den2 = self.factinv[self.n - i] * self.factinv[self.n - i - 1]
                den2 %= self.mod
                den = den1 * den2
                den %= self.mod
                ans += up * den
                ans %= self.mod
            return ans

class Maths:
    @staticmethod
    def nCrs(n, r, p):
        # r is small
        up = 1
        down = 1
        for i in range(n - r + 1, n + 1):
            up *= i
            up %= p
        for i in range(1, r + 1):
            down *= i
            down %= p
        return (up * Maths.power(down, p - 2, p)) % p

    @staticmethod
    def power(x, y, p):
        res = 1
        x = x % p
        while y > 0:
            if y & 1 == 1:
                res = (res * x) % p
            y = y >> 1
            x = (x * x) % p
        return res

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = self.reader.readLine()
            except IOException as e:
                raise RuntimeException(e)
        return self.tokenizer.nextToken()

    def nextLong(self):
        return long(self.next())

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    input_reader = InputReader(input_stream)
    output_writer = PrintWriter(output_stream)
    solver = ERoaming(input_reader.nextLong(), input_reader.nextLong())
    solver.solve(1, input_reader, output_writer)
    output_writer.close()