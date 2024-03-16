Here's the translated code from Java to Python:
```python
import sys
from io import BufferedReader, InputStreamReader, BufferedWriter, OutputStreamWriter

class TaskD:
    def solve(self, test_number, in_reader, out_writer):
        n, K = map(int, in_reader().split())
        ans = 0
        for i in range(K + 1, n + 1):
            for j in range((n // i) + 1):
                if i * (j + 1) - 1 <= n:
                    ans += i - K
                else:
                    ans += max(i - K - (i * (j + 1) - 1 - n), 0)
        if K == 0:
            ans -= n
        out_writer(str(ans) + '\n')

class InputReader:
    def __init__(self, stream):
        self.reader = BufferedReader(InputStreamReader(stream))
        self.tokenizer = None

    def __call__(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            line = self.reader.readLine()
            if line is None:
                return None
            self.tokenizer = StringTokenizer(line)
        return self.tokenizer.nextToken()

    def next_int(self):
        return int(self())

class OutputStream:
    def __init__(self):
        self.writer = BufferedWriter(OutputStreamWriter(sys.stdout))
    
    def write(self, s):
        self.writer.write(s)
    
    def flush(self):
        self.writer.flush()

    def close(self):
        self.writer.close()

class StringTokenizer:
    def __init__(self, string):
        self.tokens = string.split()
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self):
        token = self.tokens[self.index]
        self.index += 1
        return token

if __name__ == "__main__":
    in_reader = InputReader(sys.stdin)
    out_writer = OutputStream()
    solver = TaskD()
    solver.solve(1, in_reader, out_writer)
    out_writer.close()
```

Please note that the original Java code includes custom classes for I/O operations. This Python translation maintains the same structure but replaces the operations with Python equivalents. The `InputReader` and `OutputStream` classes provide a similar interface to the original Java classes they're based on. The tokenizer functionality is slightly adapted since Python strings already have `split()` functionality.
