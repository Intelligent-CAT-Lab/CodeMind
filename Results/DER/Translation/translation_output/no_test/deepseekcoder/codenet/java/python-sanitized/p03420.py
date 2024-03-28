import sys
import math

class InputReader:
    def __init__(self, stream):
        self.reader = iter(stream.readline().split())

    def next(self):
        return next(self.reader)

    def next_int(self):
        return int(self.next())


class OutputWriter:
    def __init__(self, stream):
        self.writer = stream

    def print(self, *args):
        print(*args, file=self.writer)

    def close(self):
        self.writer.close()


class TaskD:
    def solve(self, test_number, in_reader, out_writer):
        n, K = in_reader.next_int(), in_reader.next_int()
        ans = 0
        for i in range(K + 1, n + 1):
            for j in range(0, n // i + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - K
                else:
                    ans += max(i - K - (i * (j + 1) - 1 - n), 0)
        if K == 0:
            ans -= n
        out_writer.print(ans)


def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = OutputWriter(output_stream)
    solver = TaskD()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()


if __name__ == "__main__":
    main()