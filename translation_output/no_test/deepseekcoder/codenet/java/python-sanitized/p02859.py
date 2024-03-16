import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise ValueError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except ValueError:
                raise ValueError()
            if self.numChars <= 0:
                return -1
        return self.buf[self.curChar++]

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
                raise ValueError()
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def isSpaceChar(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

class OutputWriter:
    def __init__(self, output_stream = sys.stdout):
        self.writer = output_stream

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + '\n')

class ACircle:
    def solve(self, testNumber, inp, out):
        r = inp.nextInt()
        out.println(r * r)

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = InputReader(input_stream)
    out = OutputWriter(output_stream)
    solver = ACircle()
    solver.solve(1, inp, out)
    out.close()

if __name__ == "__main__":
    main()