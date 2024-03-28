```python
class FastInput:
    def __init__(self, is):
        self.is = is
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next_char = 0

    def read(self):
        while self.buf_len == self.buf_offset:
            self.buf_offset = 0
            try:
                self.buf_len = self.is.readinto(self.buf)
            except IOError as e:
                raise RuntimeError(e)
            if self.buf_len == -1:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while 0 <= self.next_char <= 32:
            self.next_char = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self.next_char == ord('+') or self.next_char == ord('-'):
            sign = 1 if self.next_char == ord('+') else -1
            self.next_char = self.read()
        val = 0
        if sign == 1:
            while ord('0') <= self.next_char <= ord('9'):
                val = val * 10 + self.next_char - ord('0')
                self.next_char = self.read()
        else:
            while ord('0') <= self.next_char <= ord('9'):
                val = val * 10 - self.next_char + ord('0')
                self.next_char = self.read()
        return val


class FastOutput:
    def __init__(self, os):
        self.cache = bytearray()
        self.os = os

    def println(self, c):
        self.cache.extend(str(c).encode())
        self.cache.append(ord('\n'))
        return self

    def flush(self):
        try:
            self.os.write(self.cache)
            self.cache = bytearray()
        except IOError as e:
            raise RuntimeError(e)

    def close(self):
        self.flush()
        try:
            self.os.close()
        except IOError as e:
            raise RuntimeError(e)


class TaskC:
    def __init__(self):
        self.f = []
        self.suffix = []
        self.n = 0
        self.mod = NumberTheory.Modular(int(1e9) + 7)

    def solve(self, test_number, fast_input, fast_output):
        self.n = fast_input.read_int()
        self.f = [-1] * (self.n + 1)
        self.suffix = [-1] * (self.n + 1)
        self.f[self.n] = self.n
        self.suffix[self.n] = self.n

        ans = self.f(1)
        fast_output.println(ans)

    def f(self, i):
        if i > self.n:
            return 0
        if self.f[i] == -1:
            self.f[i] = self.f(i + 1)
            if i + 3 <= self.n:
                since = i + 3
                until = self.n - i - 1
                self.f[i] = self.mod.plus(self.f[i], self.suffix(since))
                self.f[i] = self.mod.plus(self.f[i], self.n - until)
                self.f[i] = self.mod.plus(self.f[i], self.mod.mul(self.mod.minus(self.n, 1), self.mod.minus(self.n, 1)))
            else:
                self.f[i] = self.mod.plus(self.f[i], self.mod.mul(self.mod.minus(self.n, 1), self.n))
        return self.f[i]

    def suffix(self, i):
        if i > self.n:
            return 0
        if self.suffix[i] == -1:
            self.suffix[i] = self.mod.plus(self.f[i], self.suffix(i + 1))
        return self.suffix[i]


def main():
    import sys
    task = TaskC()
    fast_input = FastInput(sys.stdin.buffer)
    fast_output = FastOutput(sys.stdout.buffer)
    task.solve(1, fast_input, fast_output)
    fast_output.close()


if __name__ == "__main__":
    main()

class NumberTheory:
    class Modular:
        def __init__(self, m):
            self.m = m

        def value_of_int(self, x):
            x %= self.m
            if x < 0:
                x += self.m
            return x

        def value_of_long(self, x):
            x %= self.m
            if x < 0:
                x += self.m
            return x

        def mul(self, x, y):
            return self.value_of_int(x * y)

        def plus(self, x, y):
            return self.value_of_int(x + y)

        def __str__(self):
            return "mod " + str(self.m)


if __name__ == "__main__":
    main()
```

