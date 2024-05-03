```python
import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.readline

    def next(self):
        return self.inp().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_float(self):
        return float(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.inp().strip()

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_float_array(self, n):
        return [self.next_float() for _ in range(n)]

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

    def next_string_array(self, n):
        return [self.next() for _ in range(n)]

    def next_char_map(self, n):
        return [list(self.next()) for _ in range(n)]

    def next_int_map(self, n, m):
        return [[self.next_int() for _ in range(m)] for _ in range(n)]

    def next_long_map(self, n, m):
        return [[self.next_long() for _ in range(m)] for _ in range(n)]

    def next_float_map(self, n, m):
        return [[self.next_float() for _ in range(m)] for _ in range(n)]

    def next_double_map(self, n, m):
        return [[self.next_double() for _ in range(m)] for _ in range(n)]

class Task:
    def solve(self, inp, out):
        N = inp.next_long()
        d = inp.next_
