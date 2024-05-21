import sys

class Debug:
    def __init__(self, enable=False):
        self.offline = enable and sys.gettrace() is None

    def debug(self, name, x):
        if self.offline:
            self.debug(name, str(x))
        return self

    def debug(self, name, x, indexes=None):
        if self.offline:
            if indexes is None:
                indexes = []
            if not isinstance(x, (list, tuple)):
                print(f"{name}{''.join(['[{i}]'.format(i) for i in indexes])}={x}")
            else:
                for i, v in enumerate(x):
                    self.debug(name, v, indexes + [i])

class Modular:
    def __init__(self, m):
        self.m = m

    def valueOf(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.valueOf(x * y)

    def plus(self, x, y):
        return self.valueOf(x + y)

    def subtract(self, x, y):
        return self.valueOf(x - y)

class Power:
    def __init__(self, modular):
        self.modular = modular

    def pow(self, x, n):
        if n == 0:
            return self.modular.valueOf(1)
        r = self.pow(x, n >> 1)
        r = self.modular.valueOf(r * r)
        if (n & 1) == 1:
            r = self.modular.valueOf(r * x)
        return r

class FastInput:
    def __init__(self, is_=sys.stdin):
        self.is_ = is_
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0