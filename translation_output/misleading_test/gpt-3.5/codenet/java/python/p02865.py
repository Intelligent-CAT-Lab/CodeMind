```python
import sys

class Reader:
    def __init__(self, input_func=input):
        self.input_func = input_func
        self.buf = None
        self.bufidx = -1

    def read_buf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.input_func().split()
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
        return [int(x) for x in self.sa()]

    def la(self):
        return [int(x) for x in self.sa()]

    def da(self):
        return [float(x) for x in self.sa()]

    def im(self, N):
        return [self.ia() for _ in range(N)]

    def lm(self, N):
        return [self.la() for _ in range(N)]

    def dm(self, N):
        return [self.da() for _ in range(N)]

if __name__ == "__main__":
    with Reader(input) as r:
        N = r.i()
        print((N - 1) // 2)
```

