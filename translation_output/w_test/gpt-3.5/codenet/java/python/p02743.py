```python
import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.buffer
        self.ptr = 0
        self.buffer = bytearray()

    def read_byte(self):
        if self.ptr < len(self.buffer):
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        self.buffer = bytearray(self.inp.read(1024))
        self.ptr = 0
        if self.ptr < len(self.buffer):
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        return -1

    def is_printable_char(self, c):
        return c >= 33 and c <= 126

    def has_next(self):
        while self.read_byte() != -1:
            if self.is_printable_char(self.buffer[self.ptr - 1]):
                return True
        return False

    def next(self):
        if not self.has_next():
            raise ValueError("No more characters to read")
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

def main():
    sc = FastScanner()
    a, b, c = sc.next_long(), sc.next_long(), sc.next_long()
    d = c - a - b
    if d > 0 and 4 * a * b < d * d:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
```
