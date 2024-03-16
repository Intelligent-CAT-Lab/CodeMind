import sys

class BAlgae:
    def solve(self, test_number, inp, out):
        r = inp.next_int()
        d = inp.next_int()
        x = inp.next_int()

        for i in range(10):
            x = r * x - d
            out.println(x)

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = sys.stdout

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + "\n")

class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0
        self.filter = None

    def read(self):
        if self.num_chars == -1:
            raise InputMismatchException()
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                raise InputMismatchException()
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char++]

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < '0' or c > '9':
                raise InputMismatchException()
            res *= 10
            res += c - '0'
            c = self.read()
        return res * sgn

    def is_space_char(self, c):
        if self.filter is not None:
            return self.filter.is_space_char(c)
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    class SpaceCharFilter:
        def is_space_char(self, ch):
            return ch == ' ' or ch == '\n' or ch == '\r' or ch == '\t' or ch == -1

if __name__ == "__main__":
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = InputReader(input_stream)
    out = OutputWriter(output_stream)
    solver = BAlgae()
    solver.solve(1, inp, out)
    out.close()