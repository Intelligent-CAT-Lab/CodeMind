import sys

class ACircle:
    def solve(self, testNumber, in_stream, out_stream):
        r = in_stream.read_int()
        out_stream.write(f"{r * r}\n")

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def read(self):
        return self.stream.read(1)

    def read_int(self):
        c = self.read_spaces()
        negative = False
        if c == '-':
            negative = True
            c = self.read()
        result = 0
        while c.isdigit():
            result = result * 10 + int(c)
            c = self.read()
        return -result if negative else result

    def read_spaces(self):
        c = self.read()
        while c.isspace():
            c = self.read()
        return c

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def write(self, s):
        self.stream.write(s)

    def close(self):
        self.stream.flush()

def main():
    in_stream = InputReader(sys.stdin)
    out_stream = OutputWriter(sys.stdout)
    solver = ACircle()
    solver.solve(1, in_stream, out_stream)
    out_stream.close()

if __name__ == "__main__":
    main()