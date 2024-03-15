import sys

def solve(a, b):
    return max(max(a+b, a-b), a*b)

def main():
    input = sys.stdin
    output = sys.stdout
    solver = TaskA()
    solver.solve(1, input, output)

class TaskA:
    def solve(self, testNumber, input, output):
        a = input.readline().strip().split()[0]
        b = input.readline().strip().split()[0]
        output.write(str(max(max(int(a)+int(b), int(a)-int(b)), int(a)*int(b))))
        output.write("\n")

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = -1
        self.filter = None

    def read(self):
        if self.numChars == -1:
            raise InputMismatchException()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.read(self.buf)
            except IOError:
                raise InputMismatchException()
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar++]

    def nextInt(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not self.isSpaceChar(c):
            if c < '0' or c > '9':
                raise InputMismatchException()
            res *= 10
            res += c - '0'
            c = self.read()
        return res * sgn

    def isSpaceChar(self, c):
        if self.filter is not None:
            return self.filter.isSpaceChar(c)
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream
        self.writer = sys.stdout.buffer

    def write(self, s):
        self.writer.write(s.encode())

    def flush(self):
        self.writer.flush()


if __name__ == '__main__':
    main()