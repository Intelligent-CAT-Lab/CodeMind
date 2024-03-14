import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.stream = input_stream
        self.buf = bytearray(1 << 16)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise Exception("InputMismatchException")
        elif self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except Exception:
                raise Exception("InputMismatchException")
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar++]

    def nextInt(self):
        c = self.read()
        while InputReader.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == 45:
            sgn = -1
            c = self.read()
        res = 0
        while c >= 48 and c <= 57:
            res *= 10
            res += c - 48
            c = self.read()
            if InputReader.isSpaceChar(c):
                return res * sgn
        raise Exception("InputMismatchException")

    @staticmethod
    def isSpaceChar(c):
        return c == 32 or c == 10 or c == 13 or c == 9 or c == -1

class OutputWriter:
    def __init__(self, output_stream = sys.stdout):
        self.writer = output_stream

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + '\n')

class Factorials:
    @staticmethod
    def getFIF(max, mod):
        fact = [0]*max
        ifact = [0]*max
        inv = [0]*max
        inv[1] = 1
        for i in range(2, max):
            inv[i] = (mod - mod // i) * inv[mod % i] % mod