import sys
import io
import string
import collections

class LightScanner:
    def __init__(self, inp):
        self.inp = inp
        self.tokens = None

    def string(self):
        if self.tokens is None or len(self.tokens) == 0:
            self.tokens = self.inp.readline().split()
        return self.tokens.pop(0)

    def ints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.breaked = True

    def print(self, c):
        self.out.write(c)
        self.breaked = False

    def print(self, s):
        self.out.write(s)
        self.breaked = False

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        self.print(s)

    def ans(self, i):
        self.ans(str(i))

    def ln(self):
        self.print('\n')
        self.breaked = True

class Vec2i:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __hash__(self):
        return hash((self.x, self.y))

    def __str__(self):
        return "({}, {})".