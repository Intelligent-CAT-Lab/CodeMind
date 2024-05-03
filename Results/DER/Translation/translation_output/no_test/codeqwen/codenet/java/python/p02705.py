```python
import math

class p02705:

    @staticmethod
    def main(args):
        input_stream = sys.stdin
        output_stream = sys.stdout
        sc = InputReader(input_stream)
        out = PrintWriter(output_stream)
        solver = Solver()
        t = sc.nextInt()
        while t != 0:
            solver.solve(sc, out)
            t -= 1
        out.close()

class Solver:
    def solve(self, sc, out):
        r = sc.nextDouble()
        pi = math.pi
        out.println(2 * pi * r)

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0
        self.filter = None

    def read(self):
        if self.num_chars == -1:
            raise ValueError("InputMismatchException")
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError("InputMismatchException")
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]

    def peek(self):
        if self.num_chars == -1:
            return -1
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                return -1
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]

    def nextInt(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()

