Here is the Python equivalent of the Java code you provided:

```python
import sys

class BAlgae:
    def solve(self, testNumber, inp, out):
        r = inp.nextInt()
        d = inp.nextInt()
        x = inp.nextInt()

        for _ in range(10):
            x = r * x - d
            out.println(x)

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0
        self.filter = None

    @staticmethod
    def is_whitespace(c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def read(self):
        if self.num_chars == -1:
            raise ValueError("InputMismatchException")
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError("InputMismatchException")
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]

    def next_int(self):
        c = self.read()
        while self.is_whitespace(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_whitespace(c):
            if c < '0' or c > '9':
                raise ValueError("InputMismatchException")
            res *= 10
            res += ord(c) - ord('0')
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream
        self
