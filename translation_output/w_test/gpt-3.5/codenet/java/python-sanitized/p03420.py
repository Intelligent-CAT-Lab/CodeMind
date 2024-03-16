import sys
import math

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.has_more_tokens():
            try:
                self.tokenizer = iter(input().split())
            except StopIteration:
                self.tokenizer = None
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, value):
        print(value, file=self.stream)


class TaskD:
    def solve(self, n, k):
        ans = 0
        for i in range(k + 1, n + 1):
            for j in range(0, n // i + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - k
                else:
                    ans += max(i - k - (i * (j + 1) - 1 - n), 0)
        if k == 0:
            ans -= n
        return ans

def main():
    in_stream = InputReader(sys.stdin)
    out_stream = OutputWriter(sys.stdout)
    solver = TaskD()
    n, k = map(int, in_stream.next().split())
    result = solver.solve(n, k)
    out_stream.println(result)

if __name__ == '__main__':
    main()