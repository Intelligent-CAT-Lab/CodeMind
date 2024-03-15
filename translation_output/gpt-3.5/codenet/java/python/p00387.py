```python
import sys
import math

class Methods:
    def print(self, *ar):
        print(*ar)

    def maximum(self, *ar):
        return max(ar)

class FastScanner:
    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = bytearray()
        self.length = 0
        self.p = 0

    def read(self, size=1024):
        while not self.buffer or len(self.buffer) - self.p < size:
            chunk = self.in_stream.read(max(size, len(self.buffer)))
            if not chunk:
                break
            self.buffer.extend(chunk)
        return len(self.buffer) - self.p

    def read_byte(self):
        if self.read() > 0:
            self.p += 1
            return self.buffer[self.p-1]
        return -1

    def skip(self):
        while self.read() > 0 and not 33 <= self.buffer[self.p] <= 126:
            self.p += 1

    def has_next(self):
        self.skip()
        return self.read() > 0

    def next(self):
        if not self.has_next():
            raise StopIteration
        start = self.p
        while self.read() > 0 and 33 <= self.buffer[self.p] <= 126:
            self.p += 1
        return self.buffer[start:self.p].decode() if start < self.p else ""

    def next_int(self):
        return int(self.next())

    def close(self):
        self.in_stream.close()

def solve(scanner, out, ms):
    a = scanner.next_int()
    b = scanner.next_int()
    out.write(str(max(1, (b+a-1)//a))+'\n')


def main():
    scanner = FastScanner(sys.stdin.buffer)
    out = sys.stdout
    ms = Methods()
    solve(scanner, out, ms)
    scanner.close()

if __name__ == "__main__":
    main()
```

