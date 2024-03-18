```python
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise InputMismatchException()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except IOError:
                raise InputMismatchException()
            if self.numChars <= 0:
                return -1
        result = self.buf[self.curChar]
        self.curChar += 1
        return result

    def nextInt(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        sgn = 1
        if c == 45:
            sgn = -1
            c = self.read()
        res = 0
        while 48 <= c <= 57:
            res = res * 10 + c - 48
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, string):
        self.stream.write(str(string) + '\n')

def factorials(max_val, mod):
    fact = [0] * max_val
    ifact = [0] * max_val
    inv = [0] * max_val
    inv[1] = 1
    for i in range(2, max_val):
        inv[i] = (mod - mod // i) * inv[mod % i] % mod
    fact[0] = 1
    ifact[0] = 1
    for i in range(1, max_val):
        fact[i] = fact[i - 1] * i % mod
        ifact[i] = ifact[i - 1] * inv[i] % mod
    return [fact, ifact, inv]

class TaskE:
    def __init__(self):
        self.mod = 998244353
        self.n = 0
        self.k = 0
        self.fact = None
        self.ifact = None

    def solve(self, in_stream, out_stream):
        in_reader = InputReader(in_stream)
        out_writer = OutputWriter(out_stream)
        self.n = in_reader.nextInt()
        self.k = in_reader.nextInt()
        x = factorials(500010, self.mod)
        self.fact = x[0]
        self.ifact = x[1]

        ans = 0
        for diff in range(self.k % 2, self.k + 1, 2):
            nr = (self.k + diff) // 2
            nb = self.k - nr
            if nr < self.n:
                continue

            if diff == 0:
                ans += self.comb(self.k - 1, nr)
                if ans >= self.mod:
                    ans -= self.mod
                ans -= self.comb(self.k - 1, nb - 1 - (nr - self.n + 1))
                if ans < 0:
                    ans += self.mod
                continue

            r2 = (self.k - diff) // 2 - min(self.k - diff, nr - self.n) - 1
            b2 = self.k - r2

            ans += self.comb(nr + nb, nb) - self.comb(r2 + b2, r2)
            ans %= self.mod
            if ans < 0:
                ans += self.mod

        out_writer.println(ans)

    def comb(self, n, k):
        if k < 0 or k > n:
            return 0
        return self.fact[n] * self.ifact[k] % self.mod * self.ifact[n - k] % self.mod

if __name__ == "__main__":
    solver = TaskE()
    solver.solve(sys.stdin.buffer, sys.stdout.buffer)
```
```
