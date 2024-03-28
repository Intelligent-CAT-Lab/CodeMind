```python
import math

class Scanner:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buffer = bytearray()
        self.index = 0
        self.length = 0

    def is_printable_char(self, c):
        return ord('!') <= c <= ord('~')

    def is_digit(self, c):
        return ord('0') <= c <= ord('9')

    def has_next_byte(self):
        if self.index < self.length:
            return True
        else:
            try:
                self.length = self.in_stream.readinto(self.buffer)
                self.index = 0
            except IOError as e:
                print(e)
            return self.length > 0

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.index]):
            self.index += 1
        return self.has_next_byte()

    def read_byte(self):
        return self.buffer[self.index] if self.has_next_byte() else -1

    def next(self):
        if not self.has_next():
            raise RuntimeError("no input")
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode()

    def next_long(self):
        if not self.has_next():
            raise RuntimeError("no input")
        value = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        while self.is_printable_char(b):
            if self.is_digit(b):
                value = value * 10 + (b - ord('0'))
            b = self.read_byte()
        return -value if minus else value

    def next_int(self):
        return int(self.next_long())

    def next_double(self):
        return float(self.next())

class p02677:
    def __init__(self):
        self.sc = Scanner(sys.stdin.buffer)

    def solve(self):
        A = self.sc.next_int()
        B = self.sc.next_int()
        H = self.sc.next_int()
        M = self.sc.next_int()
        a_x = 1.0 * A * math.sin(math.pi * 2 * (H * 60 + M) / 720)
        b_x = 1.0 * B * math.sin(math.pi * 2 * M / 60)
        a_y = 1.0 * A * math.cos(math.pi * 2 * (H * 60 + M) / 720)
        b_y = 1.0 * B * math.cos(math.pi * 2 * M / 60)
        print(math.sqrt((a_x - b_x) * (a_x - b_x) + (a_y - b_y) * (a_y - b_y))
  
main = p02677()
main.solve()
```
