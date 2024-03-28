import sys

def solve(r):
    print(r**2)

if __name__ == '__main__':
    input = sys.stdin
    output = sys.stdout
    solver = ACircle()
    solver.solve(1, input, output)
    output.close()

class ACircle:
    def solve(self, testNumber, input, output):
        r = input.readline().strip()

        output.write(r**2)
        output.write('\n')

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def read(self):
        self.numChars = self.stream.read(self.buf)
        self.curChar = 0
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
        return self.isWhitespace(c)

    def isWhitespace(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

class OutputWriter:
    def __init__(self, outputStream):
        self.writer = PrintWriter(outputStream, flush=True)

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i))
        self.writer.write('\n')