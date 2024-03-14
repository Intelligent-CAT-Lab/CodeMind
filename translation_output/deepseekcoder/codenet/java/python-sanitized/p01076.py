import sys
import io

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.buffer = io.BufferedReader(inp)
        self.data = []
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.buffer.read(self.data)
            except EOFError:
                return False
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.data[self.ptr]
        else:
            return -1

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.data[self.ptr]):
            self.ptr += 1

    def is_printable_char(self, c):
        return 33 <= c and c <= 126