```python
import sys

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

class Combination:
    def __init__(self, factorial):
        self.factorial = factorial
        self.modular = factorial.modular
        
class Factorial:
    def __init__(self, fact, inv, reverse_factorial, limit, modular):
        self.modular = modular
        self.fact = fact
        self.inv = inv
        self.fact[0] = self.inv[0] = 1
        
        for i in range(1, limit+1):
            self.fact[i] = self.modular.mul(self.fact[i-1], i)
            self.inv[i] = self.modular.mul(self.inv[i-1], reverse_factorial.inv[i])

class InverseNumber:
    def __init__(self, inv, limit, modular):
        self.inv = inv
        self.inv[1] = 1
        p = modular.m
        
        for i in range(2, limit+1):
            k = p // i
            r = p % i
            self.inv[i] = modular.mul(-k, self.inv[r])

class FastInput:
    def __init__(self, isys):
        self.isys = isys
        self.buf = bytearray()
        self.buf_offset = 0
        self.buf_len = 0
        self.next = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf = self.isys.buffer.read(1 << 20)
            if not self.buf:
                return -1
            self.buf_len = len(self.buf)

        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()

        if self.next == ord('+') or self.next == ord('-'):
            sign = 1 if self.next == ord('+') else -1
            self.next = self.read()

        val = 0
        if sign == 1:
            while self.next >= ord('0') and self.next <= ord('9'):
                val = val * 10 + self.next - ord('0')
                self.next = self.read()
        else:
            while self.next >= ord('0') and self.next <= ord('9'):
                val = val * 10 - self.next + ord('0')
                self.next = self.read()

        return val

class FastOutput:
    def __init__(self, sys):
        self.sys = sys
        self.cache = bytearray()
        self.os = self.sys.stdout

    def append(self, csq):
        self.cache.extend(map(ord, csq))
        return self

    def append_int(self, c):
        self.cache.extend(map(ord, str(c)))
        return self

    def println_int(self, c):
        self.append_int(c)
        return self.println()

    def println(self):
        self.cache.append(ord('\n'))
        return self

    def flush(self):
        self.os.buffer.write(self.cache)
        self.os.flush()
        self.cache = bytearray()

    def close(self):
        self.flush()
        self.os.close()

class DMergeTriplets:
    def __init__(self):
        self.mod = None
        self.comb = None
        self.zero = None
        self.f = None

    def solve(self, test_number, in_reader, out_writer):
        n = in_reader.read_int() * 3
        self.mod = Modular(in_reader.read_int())
        self.comb = Combination(None)

        self.zero = n
        self.f = [[-1] * (n + n + 1) for _ in range(n + 1)]

        ans = 0
        for i in range(n + 1):
            ans = self.mod.plus(ans, self.f(n, i + self.zero))

        out_writer.println_int(ans)

    def f(self, i, j):
        if i == 0:
            return 1 if j == self.zero else 0

        if i < 0 or j >= len(self.f[i]) or j < 0:
            return 0

        if self.f[i][j] == -1:
            self.f[i][j] = self.f(i - 1, j - 1)
            self.f[i][j] = self.mod.plus(self.f[i][j], self.mod.mul(i - 1, self.f(i - 2, j + 1)))
            self.f[i][j] = self.mod.plus(self.f[i][j], self.mod.mul(self.pick2(i - 1), self.f(i - 3, j)))

        return self.f[i][j]

    def pick2(self, n):
        return self.mod.mul(n, (n - 1))

if __name__ == "__main__":
    in_reader = FastInput(sys.stdin)
    out_writer = FastOutput(sys)
    solver = DMergeTriplets()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()
```

