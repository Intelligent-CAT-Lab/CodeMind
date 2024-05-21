import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

class ACircle:
    def solve(self, r):
        return r * r

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0
        self.spaceCharFilter = None

    def read(self):
        if self.numChars == -1:
            raise InputMismatchException()
        if self.curChar >= self.numChars:
            self.curChar = 0
            self.numChars = self.stream.read(self.buf)
            if self.numChars == -1:
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
        if self.spaceCharFilter is not None:
            return self.spaceCharFilter.isSpaceChar(c)
        return self.isWhitespace(c)

    @staticmethod
    def isWhitespace(c):
        return c =='' or c == '\n' or c == '\r' or c == '\t' or c == -1

class OutputWriter:
    def __init__(self, writer):
        self.writer = writer

    def print(self, obj):
        self.writer.write(str(obj))

    def println(self, obj):
        self.writer.write(str(obj))
        self.writer.write('\n')

    def close(self):
        self.writer.close()

if __name__ == '__main__':
    import sys
    input = InputReader(sys.stdin)
    output = OutputWriter(sys.stdout)
    r = input.nextInt()
    solver = ACircle()
    output.println(solver.solve(r))
    output.close()