import sys

class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise ValueError()
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
    def __init__(self, output_stream):
        self.writer = output_stream

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + '\n')

class BAlgae:
    def solve(self, test_number, inp, out):
        r = inp.next_int()
        d = inp.next_int()
        x = inp.next_int()
        for _ in range(10):
            x = r * x - d
            out.println(x)

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = InputReader(input_stream)
    out = OutputWriter(output_stream)
    solver = BAlgae()
    solver.solve(1, inp, out)
    out.close()

if __name__ == "__main__":
    main()