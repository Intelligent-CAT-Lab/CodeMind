Here is the Python equivalent of the Java code:

```python
class Reader:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buf = []
        self.bufidx = -1

    def read_buf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.input_stream.readline().split()
            self.bufidx = 0

    def s(self):
        self.read_buf()
        return self.buf[self.bufidx]

    def i(self):
        return int(self.s())

    def l(self):
        return int(self.s())

    def d(self):
        return float(self.s())

    def sa(self):
        self.read_buf()
        if self.bufidx != 0:
            raise RuntimeError("illegal read")
        self.bufidx = -1
        return self.buf

    def ia(self):
        sa = self.sa()
        return [int(x) for x in sa]

    def la(self):
        sa = self.sa()
        return [int(x) for x in sa]

    def da(self):
        sa = self.sa()
        return [float(x) for x in sa]

    def im(self, N):
        return [self.ia() for _ in range(N)]

    def lm(self, N):
        return [self.la() for _ in range(N)]

    def dm(self, N):
        return [self.da() for _ in range(N)]


def main():
    with Reader(sys.stdin) as r:
        N = r.i()
        print((N - 1) // 2)


if __name__ == "__main__":
    import sys
    main()
```

This Python code does the same thing as the Java code: it reads an integer from the standard input, calculates the result of the expression `(N - 1) / 2`, and prints the result. The `Reader` class
