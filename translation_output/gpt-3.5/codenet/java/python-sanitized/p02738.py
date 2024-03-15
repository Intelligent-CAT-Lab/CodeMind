import sys

class FastInput:
    def __init__(self):
        self.buf = sys.stdin.buffer
        self.buf_len = 0
        self.buf_offset = 0
        self.next_byte = None

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            self.buf_len, self.buf = self.buf.readinto(self.buf)
            if self.buf_len == 0:
                return None
        result = self.buf[self.buf_offset]
        self.buf_offset += 1
        return result

    def skip_blank(self):
        while self.next_byte is not None and self.next_byte <= 32:
            self.next_byte = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.next_byte == ord('+') or self.next_byte == ord('-'):
            sign = 1 if self.next_byte == ord('+') else -1
            self.next_byte = self.read()

        val = 0
        if sign == 1:
            while self.next_byte >= ord('0') and self.next_byte <= ord('9'):
                val = val * 10 + self.next_byte - ord('0')
                self.next_byte = self.read()
        else:
            while self.next_byte >= ord('0') and self.next_byte <= ord('9'):
                val = val * 10 - self.next_byte + ord('0')
                self.next_byte = self.read()

        return val

class FastOutput:
    def __init__(self):
        self.out = sys.stdout.buffer
        self.buffer = []

    def write(self, b):
        self.buffer.append(b)
        if len(self.buffer) > 512:
            self.flush()

    def flush(self):
        self.out.write(b''.join(self.buffer))
        self.buffer = []

    def close(self):
        self.flush()

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
    def __init__(self, limit, modular):
        self.factorial = Factorial(limit, modular)
        self.modular = modular

class Factorial:
    def __init__(self, limit, modular):
        self.fact = [0] * (limit + 1)
        self.inv = [0] * (limit + 1)
        self.modular = modular
        self.fact[0] = 1
        self.inv[0] = 1
        for i in range(1, limit + 1):
            self.fact[i] = self.modular.mul(self.fact[i - 1], i)
            self.inv[i] = self.modular.mul(self.inv[i - 1], InverseNumber(i, modular).inv[i])

class InverseNumber:
    def __init__(self, limit, modular):
        self.inv = [0] * (limit + 1)
        self.inv[1] = 1
        p = modular.m
        for i in range(2, limit + 1):
            k = p // i
            r = p % i
            self.inv[i] = modular.mul(-k, self.inv[r])

class DMergeTriplets:
    def __init__(self):
        self.mod = None
        self.comb = None
        self.zero = None
        self.f = None

    def f(self, i, j):
        if i == 0:
            return 1 if j == self.zero else 0
        if i < 0 or j >= len(self.f[i]) or j < 0:
            return 0
        if self.f[i][j] == -1:
            self.f[i][j] = self.f(i - 1, j - 1)
            self.f[i][j] = self.mod.plus(self.f[i][j], self.mod.mul(i - 1, self.f(i - 2, j + 1)))
            self.f[i][j] = self.mod.plus(self.f[i][j], self.mod.mul(self.pick_2(i - 1), self.f(i - 3, j)))

        return self.f[i][j]

    def pick_2(self, n):
        return self.mod.mul(n, n - 1)

    def solve(self, test_number, in_stream, out_stream):
        n = in_stream.read_int() * 3
        self.mod = Modular(in_stream.read_int())
        self.comb = Combination(n, self.mod)
        self.zero = n
        self.f = [[-1] * (n + n + 1) for _ in range(n + 1)]

        ans = 0
        for i in range(n + 1):
            ans = self.mod.plus(ans, self.f(n, i + self.zero))

        out_stream.write(f"{ans}\n")

if __name__ == "__main__":
    input_stream = FastInput()
    output_stream = FastOutput()
    solver = DMergeTriplets()
    solver.solve(1, input_stream, output_stream)
    output_stream.close()