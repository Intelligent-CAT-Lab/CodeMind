import sys
import random

class p03571:
    P = 1_000_000_007

    def __init__(self):
        self.a = 0
        self.b = 0
        self.c = 0
        self.d = 0
        self._submit()
        sys.stdout.flush()

    def count(self, a, b, c=None, d=None):
        if c is None and d is None:
            c, d = a, b
            a, b = 0, self.a - 1
        return max(min(b, d) - max(a, c) + 1, 0)

    def count_variables(self, x, y, z):
        return self.count(x - self.d, x + self.d, 0, self.a - 1) \
               * self.count(y - self.d, y + self.d, 0, self.b - 1) % self.P \
               * self.count(z - self.d, z + self.d, 0, self.c - 1) % self.P

    def countX(self, x, y, z):
        return (self.count(x - self.d + 1, x + self.d, 0, self.a - 1)
                * self.count(y - self.d, y + self.d, 0, self.b - 1) % self.P
                * self.count(z - self.d, z + self.d, 0, self.c - 1) % self.P)

    def countY(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1)
                * self.count(y - self.d + 1, y + self.d, 0, self.b - 1) % self.P
                * self.count(z - self.d, z + self.d, 0, self.c - 1) % self.P)

    def countZ(self, x, y, z):
        return (self.count(x - self.d, x + self.d, 0, self.a - 1)
                * self.count(y - self.d, y + self.d, 0, self.b - 1) % self.P
                * self.count(z - self.d + 1, z + self.d, 0, self.c - 1) % self.P)

    def gcd(self, a, b):
        return a if b == 0 else self.gcd(b, a % b)

    def _submit(self):
        self.a = self._next_int()
        self.b = self._next_int()
        self.c = self._next_int()
        self.d = self._next_int()
        print(self.fast())

    def _next_int(self):
        try:
            return int(input().strip())
        except EOFError:
            return None

    def _rand(self, l, r):
        return random.randint(l, r)

# Because the original Java implementation is using custom Item class and sort,
# additional implementation is needed to provide a full Python equivalent,
# especially for methods such as checkX, checkY, checkZ, fast, slow, etc.
# As these methods are missing essential definitions about the context in the
# given snippet, a complete translation would require additional Java code
# that defines the missing parts.

# Since the provided code snippet is incomplete and lacks the context of the
# original Java problem, certain assumptions had to be made which might not 
# correspond exactly to the desired functionality.