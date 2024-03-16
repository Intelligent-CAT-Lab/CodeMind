import sys
from io import StringIO, BytesIO

class TaskA:
    def solve(self, test_number, in_stream, out_stream):
        s = in_stream.read().strip()
        c_index = s.find('C')
        f_index = s.rfind('F')
        if c_index == -1 or f_index == -1 or f_index < c_index:
            out_stream.write("No\n")
        else:
            out_stream.write("Yes\n")

class FastInput:
    def __init__(self, input_stream):
        self.input_stream = input_stream

    def read(self):
        return self.input_stream.read(1)

    def read_string(self):
        return self.input_stream.readline().strip()

class FastOutput:
    def __init__(self, output_stream):
        self.output_stream = output_stream

    def write(self, s):
        self.output_stream.write(s)

    def close(self):
        self.output_stream.close()

def main():
    input_stream = FastInput(sys.stdin)
    output_stream = FastOutput(sys.stdout)
    solver = TaskA()
    solver.solve(1, input_stream, output_stream)
    output_stream.close()

if __name__ == "__main__":
    main()