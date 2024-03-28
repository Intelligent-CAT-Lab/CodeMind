import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.reader = input_stream

    def next(self):
        return self.reader.readline().strip()

    def next_int(self):
        return int(self.next())

class TaskA:
    def solve(self, inp, outp):
        n = inp.next_int()
        x = n // 1000
        y = n % 1000
        if y == 0:
            outp.write(str(0))
        else:
            ans = 1000 * (x + 1) - n
            outp.write(str(ans))
        outp.write("\n")
        outp.flush()

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    inp = InputReader(input_stream)
    outp = output_stream
    solver = TaskA()
    solver.solve(inp, outp)

if __name__ == "__main__":
    main()