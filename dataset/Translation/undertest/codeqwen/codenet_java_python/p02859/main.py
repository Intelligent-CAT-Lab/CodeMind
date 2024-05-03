import sys

class ACircle:
    def solve(self, testNumber, inp, out):
        r = inp.nextInt()

        out.println(r * r)

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0
        self.filter = None

    def read(self):
        if self.numChars == -1:
            raise ValueError("No more characters to read")
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError("Error reading from stream")
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar]

    def nextInt(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while not self.isSpaceChar(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError("Invalid integer format")
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def isSpaceChar(self, c):
        if self.filter is not None:
            return self.filter.isSpaceChar(c)
        return self.isWhitespace(c)

    @staticmethod
    def isWhitespace(c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

class OutputWriter:
    def __init__(self, stream):
        self.writer = stream