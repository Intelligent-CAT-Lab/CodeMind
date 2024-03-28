import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.stream = input_stream

    def read(self):
        return self.stream.read(1)

    def next_int(self):
        return int(self.stream.readline().strip())

class OutputWriter:
    def __init__(self, output_stream = sys.stdout):
        self.writer = output_stream

    def println(self, i):
        self.writer.write(str(i) + '\n')

    def close(self):
        self.writer.close()

class ACircle:
    def solve(self, inp, out):
        r = inp.next_int()
        out.println(r * r)

def main():
    input_reader = InputReader()
    output_writer = OutputWriter()
    solver = ACircle()
    solver.solve(input_reader, output_writer)
    output_writer.close()

if __name__ == "__main__":
    main()