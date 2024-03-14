import sys
import math

class Scanner:
    def __init__(self, f):
        self.f = f
        self.buffer = ""
        self.pos = 0
        self.fill()

    def fill(self):
        while True:
            if self.pos == len(self.buffer):
                self.buffer = self.f.readline()
                self.pos = 0
                if self.buffer == "":
                    return
            if self.buffer[self.pos] == " ":
                self.pos += 1
            else:
                break

    def token(self):
        while True:
            if self.pos == len(self.buffer):
                self.buffer = self.f.readline()
                self.pos = 0
                if self.buffer == "":
                    return None
            if self.buffer[self.pos] == " ":
                self.pos += 1
            else:
                break
        start = self.pos
        while True:
            if self.pos == len(self.buffer):
                self.buffer = self.f.readline()
                self.pos = 0
                if self.buffer == "":
                    return self.buffer[start:self.pos]
            if self.buffer[self.pos] == " ":
                return self.buffer[start:self.pos]
            self.pos += 1

class Arr:
    def __init__(self, n, init):
        self.n = n
        self.a = [init] * n

    def __getitem__(self, i):
        return self.a[i]

    def __setitem__(self, i, x):
        self.a[i] = x

    def __str__(self):
        return str(self.a)

    def __repr__(self):
        return str(self.a)

    def __iter__(self):
        return self.a.__iter__()

    def __reversed__(self):
        return self.a.__reversed__()

    def __contains__(self, x):
        return self.a.__contains__(x)

    def __len__(self):
        return self.n

    def __add__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n + m, [0] * (n + m))
        elif isinstance(b, int):
            return Arr(n + 1, [0] * (n + 1))
        else:
            raise TypeError

    def __sub__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n - m, [0] * (n - m))
        elif isinstance(b, int):
            return Arr(n - 1, [0] * (n - 1))
        else:
            raise TypeError

    def __mul__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n * m, [0] * (n * m))
        elif isinstance(b, int):
            return Arr(n * 1, [0] * (n * 1))
        else:
            raise TypeError

    def __floordiv__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n // m, [0] * (n // m))
        elif isinstance(b, int):
            return Arr(n // 1, [0] * (n // 1))
        else:
            raise TypeError

    def __mod__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n % m, [0] * (n % m))
        elif isinstance(b, int):
            return Arr(n % 1, [0] * (n % 1))
        else:
            raise TypeError

    def __pow__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n ** m, [0] * (n ** m))
        elif isinstance(b, int):
            return Arr(n ** 1, [0] * (n ** 1))
        else:
            raise TypeError

    def __lshift__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n << m, [0] * (n << m))
        elif isinstance(b, int):
            return Arr(n << 1, [0] * (n << 1))
        else:
            raise TypeError

    def __rshift__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n >> m, [0] * (n >> m))
        elif isinstance(b, int):
            return Arr(n >> 1, [0] * (n >> 1))
        else:
            raise TypeError

    def __and__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n & m, [0] * (n & m))
        elif isinstance(b, int):
            return Arr(n & 1, [0] * (n & 1))
        else:
            raise TypeError

    def __xor__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n ^ m, [0] * (n ^ m))
        elif isinstance(b, int):
            return Arr(n ^ 1, [0] * (n ^ 1))
        else:
            raise TypeError

    def __or__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            return Arr(n | m, [0] * (n | m))
        elif isinstance(b, int):
            return Arr(n | 1, [0] * (n | 1))
        else:
            raise TypeError

    def __iadd__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b = b.a
            for i in range(n):
                a[i] += b[i]
            return self
        elif isinstance(b, int):
            for i in range(n):
                a[i] += b
            return self
        else:
            raise TypeError

    def __isub__(self, b):
        n = self.n
        a = self.a
        if isinstance(b, Arr):
            m = b.n
            b