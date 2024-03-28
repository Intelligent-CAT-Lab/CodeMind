import sys

class TaskA:
    def solve(self, testNumber, in_stream, out_stream):
        n = int(in_stream.readline())
        x = n // 1000
        y = n % 1000
        if y == 0:
            out_stream.write(f"{0}\n")
        else:
            ans = 1000 * (x + 1) - n
            out_stream.write(f"{ans}\n")

if __name__ == "__main__":
    in_stream = sys.stdin
    out_stream = sys.stdout
    solver = TaskA()
    solver.solve(1, in_stream, out_stream)
    out_stream.flush()