```python
import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.buffer = b""
        self.ptr = 0

    def read_byte(self):
        if self.ptr < len(self.buffer):
            self.ptr += 1
            return self.buffer[self.ptr - 1]
        self.buffer = sys.stdin.buffer.read(1024)
        if not self.buffer:
            return b"\n"
        self.ptr = 1
        return self.buffer[0]

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while bytes([self.read_byte()]) != b"" and not self.is_printable_char(self.buffer[self.ptr - 1]):
            pass

    def has_next(self):
        self.skip_unprintable()
        return bytes([self.read_byte()]) != b""

    def next(self):
        if not self.has_next():
            raise StopIteration
        res = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            res.extend([b])
            b = self.read_byte()
        return res.decode()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

if __name__ == '__main__':
    sc = FastScanner()
    K = sc.next_long()
    A = K // 50
    B = K % 50

    a = [0] * 50
    for i in range(50):
        a[i] = i + A

    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    for i in range(50):
        print(a[i], end='')
        if i != 49:
            print(" ", end='')
    print()
```
