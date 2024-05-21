import sys

class FastScanner:
    def __init__(self):
        self.buffer = bytearray(sys.stdin.buffer.read())
        self.ptr = 0
        self.buflen = len(self.buffer)

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte(): return self.buffer[self.ptr]
        else: return -1

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]): self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next(): raise ValueError("No more input")
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next(): raise ValueError("No more input")
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if b < ord('0') or ord('9') < b:
            raise ValueError("Invalid input")
        while True:
            if ord('0') <= b and b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus