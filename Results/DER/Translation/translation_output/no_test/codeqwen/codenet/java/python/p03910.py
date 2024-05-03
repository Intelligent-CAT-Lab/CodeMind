Here is the Python equivalent of the Java code you provided:

```python
import sys

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read()
        self.index = 0

    def has_next_byte(self):
        return self.index < len(self.buffer)

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.index]
        else:
            return -1

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.index]):
            self.index += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise ValueError("No more input")
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise ValueError("No more input")
        nl = 0
        minus = False
        b = self.read_byte()
        if b == '-':
            minus = True
            b = self.read_byte()
        if not ('0' <= b <= '9'):
            raise ValueError("Invalid input")
        while True:
            if '0' <= b <= '9':
                nl *= 10
                nl += ord(b) - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -nl if minus else nl
            else:
                raise ValueError("Invalid input")
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError("Invalid input")
        return int(nl)

    def is
