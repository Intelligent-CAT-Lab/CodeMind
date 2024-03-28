import sys

class FastScanner:
    def __init__(self, input=sys.stdin):
        self.buffer = input.buffer
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.buffer.read1(16 * 1024)
            except:
                self.buflen = 0
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def has_next(self):
        while self.has_next_byte() and not is_printable_char(self.buffer[self.ptr]