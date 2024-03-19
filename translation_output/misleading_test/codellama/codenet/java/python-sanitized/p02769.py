import math

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

class ERoaming:
    def __init__(self):
        self.fact = []
        self.factinv = []
        self.mod = 1000000007
        self.n = 0

    def gen(self):
        self.fact = [1] * (self.n + 1)
        self.factinv = [1] * (self.n + 1)
        self.fact[0] = 1
        self.factinv[0] = Maths.power(self.fact[0], self.mod - 2, self.mod)
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1]
            self.fact[i] %= self.mod
            self.factinv[i] = Maths.power(self.fact[i], self.mod - 2, self.mod)

    def solve(self, test_number, in, out):
        self.n = in.next_long()
        k = in.next_long()
        if k >= self.n:
            out.println(Maths.nCrs(self.n + self.n - 1, self.n - 1, self.mod))
        else:
            ans = 0
            self.gen()
            for i in range(0, k + 1):
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
                # out.println((up*den)%mod)
            out.println(ans)

class InputReader:
    def __init__(self, stream):
        self.reader = BufferedReader(InputStreamReader(stream), 32768)
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise RuntimeException(e)
        return self.tokenizer.nextToken()

    def next_long(self):
        return long(