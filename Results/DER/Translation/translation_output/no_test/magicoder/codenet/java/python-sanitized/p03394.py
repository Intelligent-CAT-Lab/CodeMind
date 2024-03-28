import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = stream.readinto(self.buf)

    def read(self):
        if self.numChars == -1:
            raise EOFError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.stream.readinto(self.buf)
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar]

    def nextInt(self):
        c = self.read()
        while isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not isSpaceChar(c):
            if c < '0' or c > '9':
                raise ValueError()
            res *= 10
            res += c - '0'
            c = self.read()
        return res * sgn

def isSpaceChar(c):
    return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.stream.write(b' ')
            self.stream.write(str(objects[i]).encode())

    def println(self, *objects):
        self.print(*objects)
        self.stream.write(b'\n')

class AC_GC_22_B:
    def solve(self, testNumber, inp, out):
        n = inp.nextInt()