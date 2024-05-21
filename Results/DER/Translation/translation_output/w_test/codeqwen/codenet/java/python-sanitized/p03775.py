import math

class AtCoder:
    def __init__(self, N):
        self.N = N

    def solve(self):
        sqrt = int(math.sqrt(self.N))
        for i in range(sqrt, 0, -1):
            if self.N % i == 0:
                A = len(str(i))
                B = len(str(self.N // i))
                return max(A, B)

class FastScanner:
    def __init__(self):
        self.inp = input()
        self.ptr = 0
        self.buflen = len(self.inp)

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.inp = input()
            self.buflen = len(self.inp)
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.inp[self.ptr]
        else:
            return -1

    def has_next(self):
        while self.has_next_byte() and not self.inp[self.ptr].isprintable():
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise ValueError("No more input")
        start = self.ptr
        while self.has_next_byte() and self.inp[self.ptr].isprintable():
            self.ptr += 1
        return self.inp[start:self.ptr]

    def next_long(self):
        if not self.has_next():
            raise ValueError("No more input")
        start = self.ptr
        minus = False
        b = self.read_byte()
        if b == '-':
            minus = True
            b = self.read_byte()
        if not b.isdig