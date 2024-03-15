```python
import sys

class FastInput:
    def __init__(self, input_stream):
        self.is_ = input_stream
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next_byte = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf_len = self.is_.readinto(self.buf)
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.next_byte >= 0 and self.next_byte <= 32:
            self.next_byte = self.read()

    def read_int(self):
        sign = 1

        self.skip_blank()
        if self.next_byte == 43 or self.next_byte == 45:
            sign = 1 if self.next_byte == 43 else -1
            self.next_byte = self.read()

        val = 0
        if sign == 1:
            while 48 <= self.next_byte <= 57:
                val = val * 10 + self.next_byte - 48
                self.next_byte = self.read()
        else:
            while 48 <= self.next_byte <= 57:
                val = val * 10 - self.next_byte + 48
                self.next_byte = self.read()

        return val

class FastOutput:
    def __init__(self, output_stream):
        self.cache = bytearray(10 << 20)
        self.os = output_stream

    def println(self, c):
        self.cache.extend(str(c).encode('utf-8') + b'\n')

    def flush(self):
        try:
            self.os.write(self.cache)
            self.os.flush()
            self.cache = bytearray(10 << 20)
        except IOError as e:
            raise e

    def close(self):
        self.flush()
        try:
            self.os.close()
        except IOError as e:
            raise e

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

def solve_nwars(in_stream, out_stream):
    in_stream = FastInput(in_stream)
    out_stream = FastOutput(out_stream)
    n = in_stream.read_int()
    
    f = [-1] * (n + 1)
    suffix = [-1] * (n + 1)
    mod = NumberTheory.Modular(int(1e9) + 7)
    
    f[n] = n
    suffix[n] = n

    def f(i):
        if i > n:
            return 0
        if f[i] == -1:
            f[i] = f(i + 1)
            if i + 3 <= n:
                since = i + 3
                until = n - i - 1
                f[i] = mod.plus(f[i], suffix(since))
                f[i] = mod.plus(f[i], n - until)
                f[i] = mod.plus(f[i], mod.mul(n - 1, n - 1))
            else:
                f[i] = mod.plus(f[i], mod.mul(n - 1, n))
        return f[i]

    def suffix(i):
        if i > n:
            return 0
        if suffix[i] == -1:
            suffix[i] = mod.plus(f[i], suffix(i + 1))
        return suffix[i]

    ans = f(1)
    out_stream.println(ans)
    out_stream.close()

if __name__ == "__main__":
    solve_nwars(sys.stdin.buffer, sys.stdout.buffer)
```
Note: This is a direct translation of the given Java code to Python, including classes and methods. Make sure to test the code with appropriate input/output.
