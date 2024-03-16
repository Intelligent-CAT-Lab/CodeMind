import sys

class FastScanner:
    def __init__(self):
        self.buffer = sys.stdin.read()
        self.ptr = 0
        self.buflen = len(self.buffer)

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            return False

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        s