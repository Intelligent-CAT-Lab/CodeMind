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

    def next_int(self):
        c = self.read()
        while c <= 32:
            c = self.read()
        sgn = 1 if c != '-' else -1
        if c == '-' or c == '+':
            c = self.read()
        res = 0
        while '0' <= chr(c) <= '9':
            res = res * 10 + sgn * (c - 48)
            c = self.read()
        return res

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, i):
        self.stream.write(str(i) + '\n')

class ACircle:
    def solve(self, test_number, inp, out):
        r = inp.next_int()
        out.println(r * r)

def main():
    inp = InputReader(sys.stdin)
    out = OutputWriter(sys.stdout)
    solver = ACircle()
    solver.solve(1, inp, out)
    out.stream.flush()

if __name__ == "__main__":
    main()