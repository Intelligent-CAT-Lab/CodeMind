```python
import sys
import math

class FastIO:
    def __init__(self, input_stream, output_stream):
        self.input = input_stream
        self.output = output_stream
        self.buffer = ""
        self.buffer_pos = 0

    def read(self):
        if self.buffer_pos >= len(self.buffer):
            self.buffer = self.input.readline().strip()
            self.buffer_pos = 0
        result = self.buffer[self.buffer_pos]
        self.buffer_pos += 1
        return result

    def read_int(self):
        return int(self.read())

    def read_long(self):
        return int(self.read())

    def read_double(self):
        return float(self.read())
        
    def read_string(self):
        return self.read().strip()

    def flush(self):
        self.output.write(self.buffer)
        self.output.flush()

def solve():
    n = io.read_int()
    m = io.read_int()
    l = io.read_int()
    r = io.read_int()
    
    io.buffer += str(solve(n, m, l, r)) + "\n"

def solve(n, m, l, r):
    # Your implementation of solve function from the provided Java code here
    pass

if __name__ == "__main__":
    io = FastIO(sys.stdin, sys.stdout)
    solve()
    io.flush()
```

