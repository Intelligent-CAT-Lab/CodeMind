import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = -1

    def read(self):
        if self.numChars == -1:
            raise Exception("InputMismatchException")
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except:
                raise Exception("InputMismatchException")
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar++]

    def ni(self):
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
                raise Exception("InputMismatchException")
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def isSpaceChar(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

class OutputWriter:
    def __init__(self, output_stream = sys.stdout):
        self.writer = output_stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                print(' ', end='', file=self.writer)
            print(objects[i], end='', file=self.writer)

    def println(self, *objects):
        self.print(objects)
        print('', file=self.writer)

    def close(self):
        self.writer.close()

class AOn