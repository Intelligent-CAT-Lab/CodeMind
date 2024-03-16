```python
import sys
import math

class FastScanner:

    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = bytearray()
        self.pos = 0
        self.length = 0

    def nextDouble(self):
        return float(self.next())

    def next(self):
        if not self.has_next():
            raise StopIteration
        start = self.pos
        while self.pos < self.length:
            if self.buffer[self.pos] == 10 or self.buffer[self.pos] == 32:
                break
            self.pos += 1
        self.pos += 1
        return self.buffer[start:self.pos-1].decode()

    def has_next(self):
        if self.pos < self.length:
            return True
        else:
            self.pos = 0
            self.buffer = bytearray()
            try:
                self.buffer = sys.stdin.buffer.read(1024)
                self.length = len(self.buffer)
            except EOFError:
                pass
            if self.length <= 0:
                return False
        return True

def solve(in_stream, out_stream):
    in_stream = FastScanner(in_stream)
    a, b = in_stream.nextDouble(), in_stream.nextDouble()
    out_stream.write(str(4.0/3.0*math.pi*b*b*b) + '\n')


if __name__ == "__main__":
    solve(sys.stdin, sys.stdout)
```

