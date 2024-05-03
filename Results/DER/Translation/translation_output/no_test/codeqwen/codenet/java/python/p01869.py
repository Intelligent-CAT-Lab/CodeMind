```python
import sys

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.stream = stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0

    def read(self):
        if self.num_chars == -1:
            raise ValueError("EOF")
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError("IOError")
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]

    def is_space_char(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

    def is_endline_char(self, c):
        return c == ord('\n') or c == ord('\r') or c == -1

    def next_int(self):
        return int(self.next())

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_int_map(self, n, m):
        return [self.next_int_array(m) for _ in range(n)]

    def next_long(self):
        return int(self.next())

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_long_map(self, n, m):
        return [self.next_long_array(m) for _ in range(n)]

    def next_double(self):
        return float(self.next())

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

    def next_double_map(self, n,
