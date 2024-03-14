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

    def nextInt(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        sgn = 1 if c != '-' else -1
        if c == '-' or c == '+':
            c = self.read()
        res = 0
        while c >= '0' and c <= '9':
            res = res * 10 + c - '0'
            c = self.read()
        return res * sgn

class OutputWriter:
    def __init__(self, output_stream = sys.stdout):
        self.writer = output_stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.writer.write(' ')
            self.writer.write(str(objects[i]))

    def println(self, *objects):
        self.print(objects)
        self.writer.write('\n')

    def close(self):
        self.writer.close()

class AC_GC_22_B:
    def solve(self, testNumber, inp, out):
        n = inp.nextInt()