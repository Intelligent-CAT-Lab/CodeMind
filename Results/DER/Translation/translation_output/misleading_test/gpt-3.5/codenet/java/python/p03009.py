```python
import sys

class FastInput:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray()
        self.buf_len = 0
        self.buf_offset = 0
        self.CACHE_SIZE = 1 << 13
        self.next = 0

    def read(self):
        while self.buf_offset >= self.buf_len:
            self.buf_offset = 0
            self.buf = self.stream.read(self.CACHE_SIZE)
            if not self.buf:
                return -1
            self.buf_len = len(self.buf)
        result = self.buf[self.buf_offset]
        self.buf_offset += 1
        return result

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.next == 43 or self.next == 45:
            sign = 1 if self.next == 43 else -1
            self.next = self.read()
        val = 0
        if sign == 1:
            while 48 <= self.next <= 57:
                val = val * 10 + self.next - 48
                self.next = self.read()
        else:
            while 48 <= self.next <= 57:
                val = val * 10 - self.next + 48
                self.next = self.read()
        return val

class NumberTheory:
    class Modular:
        def __init__(self, m):
            self.m = m

        def value_of(self, x):
            x %= self.m
            if x < 0:
                x += self.m
            return x

        def mul(self, x, y):
            return self.value_of(x * y)

        def plus(self, x, y):
            return self.value_of(x + y)

        def subtract(self, x, y):
            return self.value_of(x - y)

    class Factorial:
        def __init__(self, n, mod):
            self.fact = [0] * (n + 1)
            self.fact[0] = 1
            for i in range(1, n + 1):
                self.fact[i] = mod.mul(self.fact[i - 1], i)

        def fact(self, n):
            return self.fact[n]

def solve(n, h, d, in_stream, out_stream):
    mod = NumberTheory.Modular(int(1e9) + 7)
    fact = NumberTheory.Factorial(n, mod)

    dp = [0] * (h + 1)
    dp[0] = fact.fact(n)

    fact_sum = 0
    for i in range(1, n + 1):
        fact_sum = mod.plus(fact_sum, fact.fact(i))

    pre_dp_sum = [0] * (h + 1)
    pre_dp_sum[0] = dp[0]

    for i in range(1, h + 1):
        dp[i] = pre_dp_sum[i - 1]
        if i - d - 1 >= 0:
            dp[i] = mod.subtract(dp[i], pre_dp_sum[i - d - 1])
        if i < h:
            dp[i] = mod.mul(dp[i], fact_sum)
        pre_dp_sum[i] = mod.plus(pre_dp_sum[i - 1], dp[i])

    out_stream.write(str(dp[h]))

def main():
    in_stream = FastInput(sys.stdin.buffer)
    out_stream = sys.stdout.buffer
    n, h, d = in_stream.read_int(), in_stream.read_int(), in_stream.read_int()
    solve(n, h, d, in_stream, out_stream)

if __name__ == "__main__":
    main()
```
```
