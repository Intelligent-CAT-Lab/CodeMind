import sys

class ContestReader:
    def __init__(self, inp):
        self.inp = inp
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = iter(self.inp.readline().split())
            except Exception as e:
                raise RuntimeError(e)
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_array(self, n):
        return [self.next() for _ in range(n)]

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

    def next_int_matrix(self, n, m):
        return [[self.next_int() for _ in range(m)] for _ in range(n)]

    def next_long_matrix(self, n, m):
        return [[self.next_long() for _ in range(m)] for _ in range(n)]

    def next_double_matrix(self, n, m):
        return [[self.next_double() for _ in range(m)] for _ in range(n)]

class ModCalculator:
    def __init__(self, mod):
        self.mod = mod

    def add(self, a, b):
        return (a + b) % self.mod

    def sub(self, a, b):
        return (a - b + self.mod) % self.mod

    def mul(self, a, b):
        return (a * b) % self.mod

    def pow