Here is the Python version of the Java code:

```python
import sys

class FS:
    def __init__(self):
        self.buffer = sys.stdin.buffer.read()
        self.ptr = 0
        self.buflen = len(self.buffer)

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = sys.stdin.buffer.read()
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        return self.buffer[self.ptr] if self.has_next_byte() else -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode()

    def next_int(self):
        return self.next_long()

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if not self.is_printable_char(b):
            raise ValueError("Invalid input")
        while True:
            if self.is_printable_char(b):
                n *
