import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = -1

    def read(self):
        if self.numChars == -1:
            raise EOFError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.stream.readinto(self.buf)
            if self.numChars <= 0:
                raise EOFError()
        return self.buf[self.curChar]

    def ni(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        sgn = 1 if c != '-' else -1
        if c == '-' or c == '+':
            c = self.read()
        res = 0
        while '0' <= c <= '9':
            res = res * 10 + ord(c) - ord('0')
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def print(self, *objects):
        print(*objects, file=self.stream)

    def println(self, *objects):
        print(*objects, file=self.stream)

class AOn