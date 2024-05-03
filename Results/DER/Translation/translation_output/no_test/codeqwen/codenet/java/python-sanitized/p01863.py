import sys

class MyScanner:
    def __init__(self):
        self.buffer = []

    def read(self):
        if not self.buffer:
            self.buffer = sys.stdin.readline().split()
        return self.buffer.pop(0)

    def next_int(self):
        return int(self.read())

    def next_double(self):
        return float(self.read())

    def next_long(self):
        return int(self.read())

    def next(self):
        return self.read()

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_int2d_array(self, n, m):
        return [self.next_int_array(m) for _ in range(n)]

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_char_field(self, n, m):
        return [list(self.next()) for _ in range(n)]

class RollingHash:
    def __init__(self):
        self.S = ""
        self.N = 0
        self.l = 0
        self.r = 0
        self.B1 = 1007
        self.B2 = 1009
        self.H1 = 1000000007
        self.H2 = 1000000009
        self.Base1 = [0] * (self.N + 1)
        self.Base2 = [0] * (self.N + 1)
        self.Hash1 = [0] * self.N
        self.Hash2 = [0] * self.N

    def init(self, s):
        self.S = s
        self.N = len(s)
        self.l = 0
        self.r = self.N - 1