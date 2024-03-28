```python
import sys

class InputReader:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.tokenizer = None

    def next(self):
        while not self.tokenizer or not self.tokenizer.has_more_tokens():
            self.tokenizer = iter(input().split())
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

class OutputWriter:
    def __init__(self, output_stream):
        self.output_stream = output_stream

    def println(self, value):
        print(value)

class TaskD:
    def solve(self, test_number, input_reader, output_writer):
        n = input_reader.next_int()
        K = input_reader.next_int()
        ans = 0
        for i in range(K + 1, n + 1):
            for j in range(n // i + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - K
                else:
                    ans += max(i - K - (i * (j + 1) - 1 - n), 0)
        if K == 0:
            ans -= n
        output_writer.println(ans)

if __name__ == "__main__":
    input_reader = InputReader(sys.stdin)
    output_writer = OutputWriter(sys.stdout)
    solver = TaskD()
    solver.solve(1, input_reader, output_writer)
```

