Here's the translated code from Java to Python:

```python
import sys
import io
import atexit

class Solver:
    def __init__(self, reader, writer):
        self.reader = reader
        self.writer = writer

    def run(self):
        a = self.reader.next_long()
        b = self.reader.next_long()
        c = self.reader.next_long()
        d = c - a - b
        if d > 0 and 4 * a * b < d * d:
            self.writer.write("Yes\n")
        else:
            self.writer.write("No\n")

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
        self.position = 0

    def next(self):
        while True:
            while self.position < len(self.buffer) and not self.buffer[self.position].strip():
                self.position += 1
            if self.position < len(self.buffer):
                result = self.buffer[self.position]
                self.position += 1
                return result
            self.buffer = self.stream.readline().split()
            self.position = 0
            if not self.buffer:
                return ''

    def next_long(self):
        return int(self.next())

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

if __name__ == '__main__':
    # We will decrease Python's default buffer size for standard output.
    bufsize = 0
    sys.stdout = io.TextIOWrapper(sys.stdout.buffer, bufsize, line_buffering=True)
    atexit.register(sys.stdout.detach)

    reader = FastScanner(sys.stdin)
    writer = sys.stdout
    solver = Solver(reader, writer)
    solver.run()
```

This Python code retains the structure and logic of the original Java code, including the Solver class that performs the mathematical check based on the input values, and the FastScanner class that provides the input parsing functionality. The `FastScanner` class in Python is simplified due to Python's inherent capability to handle input more efficiently. The `sys.stdout` buffering configuration is adjusted to mimic the `PrintWriter` flushing behavior from the original Java code.
