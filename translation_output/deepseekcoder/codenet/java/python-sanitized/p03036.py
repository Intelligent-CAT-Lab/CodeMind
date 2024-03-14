import sys

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = output_stream

    def close(self):
        self.writer.close()

    def println(self, i):
        self.writer.write(str(i) + '\n')


class InputReader:
    def __init__(self, input_stream):
        self.stream = input_stream

    def read(self):
        return self.stream.read(1)

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1 if c != '-' else -1
        if c == '-' or c == '+':
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            res = res * 10 + ord(c) - ord('0')
            c = self.read()
        return res * sgn

    def is_space_char(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == ''


class BAlgae:
    def solve(self, test_number, in_reader, out_writer):
        r = in_reader.next_int()
        d = in_reader.next_int()
        x = in_reader.next_int()
        for _ in range(10):
            x = r * x - d
            out_writer.println(x)


def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = OutputWriter(output_stream)
    solver = BAlgae()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()


if __name__ == "__main__":
    main()