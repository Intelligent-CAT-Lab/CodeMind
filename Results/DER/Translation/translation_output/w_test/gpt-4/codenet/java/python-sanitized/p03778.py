import sys

class FastScanner:
    def __init__(self):
        self.stream = sys.stdin.buffer
        self.buffer = b""
        self.ptr = 0
        self.buflen = 0

    def _has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = self.stream.read(1024)
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def _read_byte(self):
        return self.buffer[self.ptr] if self._has_next_byte() else -1

    def _is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self._has_next_byte() and not self._is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self._has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = []
        b = self._read_byte()
        while self._is_printable_char(b):
            sb.append(chr(b))
            b = self._read_byte()
        return "".join(sb)

    def next_int(self):
        return int(self.next())

    def close(self):
        pass  # No close operation needed for sys.stdin in Python


if __name__ == "__main__":
    fsc = FastScanner()
    w = fsc.next_int()
    a = fsc.next_int()
    b = fsc.next_int()
    fsc.close()
    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    elif a + w < b:
        print(b - a - w)
    else:
        print(a - b - w)