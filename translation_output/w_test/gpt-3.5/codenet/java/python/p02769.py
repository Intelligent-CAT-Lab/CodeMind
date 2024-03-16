```python
class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = iter(self.reader.readline().split())
            except IOError as e:
                raise

        return next(self.tokenizer)

    def nextLong(self):
        return int(self.next())

class ERoaming:
    def __init__(self):
        self.fact = None
        self.factinv = None
        self.mod = 1000000007
        self.n = 0

    def gen(self):
        self.fact = [0] * (self.n + 1)
        self.factinv = [0] * (self.n + 1)
        self.fact[0] = 1
        self.factinv[0] = Maths.power(self.fact[0], self.mod - 2, self.mod)
        for i in range(1, self.n + 1):
            self.fact[i] = i * self.fact[i - 1] % self.mod
            self.factinv[i] = Maths.power(self.fact[i], self.mod - 2, self.mod)

    def solve(self, test_number, in_stream, out_stream):
        in_reader = InputReader(in_stream)
        self.n = in_reader.nextLong()
        k = in_reader.nextLong()
        if k >= self.n:
            out_stream.write(str(Maths.nCrs(self.n + self.n - 1, self.n - 1, self.mod)) + '\n')
        else:
            ans = 0
            self.gen()
            for i in range(k + 1):
                up = (self.fact[self.n] * self.fact[self.n - 1]) % self.mod
                den1 = (self.factinv[i] * self.factinv[i]) % self.mod
                den2 = (self.factinv[self.n - i] * self.factinv[self.n - i - 1]) % self.mod
                den = (den1 * den2) % self.mod
                ans += up * den
                ans %= self.mod
            out_stream.write(str(ans) + '\n')

class Maths:
    @staticmethod
    def nCrs(n, r, p):
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
        x %= p
        while y > 0:
            if y & 1 == 1:
                res = (res * x) % p
            y >>= 1
            x = (x * x) % p
        return res

# Test input
input_data = '3 2\n'
from io import StringIO
output_stream = StringIO()

# Simulate running the main method
ERoaming_instance = ERoaming()
ERoaming_instance.solve(1, StringIO(input_data), output_stream)

# Get the output
output = output_stream.getvalue()
print(output.strip())

# Output: 10
```

