import sys

class TaskA:
    def solve(self, testNumber, in_reader, out_writer):
        a = in_reader.read_int()
        b = in_reader.read_int()
        out_writer.write_line(max(a + b, a - b, a * b))

class OutputWriter:
    def __init__(self, out_stream):
        self.writer = out_stream

    def close(self):
        self.writer.close()

    def write_line(self, item):
        self.writer.write(str(item) + '\n')
        self.writer.flush()

class InputReader:
    def __init__(self, in_stream):
        self.stream = in_stream

    def read(self):
        return self.stream.read(1)

    def read_int(self):
        s = ''
        while True:
            char = self.read()
            if char in '0123456789-':
                s += char
            elif s.strip() == '':
                continue  # skip whitespace characters
            else:
                break
        return int(s)

if __name__ == '__main__':
    in_reader = InputReader(sys.stdin)
    out_writer = OutputWriter(sys.stdout)
    solver = TaskA()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()