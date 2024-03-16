import sys

class FastScanner:
    def __init__(self):
        self.input_buffer = sys.stdin.buffer
        self.next_byte_idx = 0
        self.buffer_size = 0

    def has_next_byte(self):
        if self.next_byte_idx < self.buffer_size:
            return True
        else:
            self.next_byte_idx = 0
            try:
                self.input_buffer = self.input_buffer.read(1024)
            except IOError:
                raise IOError()
            if self.buffer_size <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.next_byte_idx]
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.next_byte_idx]):
            self.next_byte_idx += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration()
        sb = ""
        b = self.read_byte()
        while self.is_printable_char(b):
            sb += chr(b)
            b = self.read_byte()
        return sb

    def next_long(self):
        if not self.has_next():
            raise StopIteration()
        n = 0
        minus = False
        b = self.read_byte()
        if b == '-':
            minus = True
            b = self.read_byte()
        if b < ord('0') or ord('9') < b:
            raise ValueError()
        while True:
            if ord('0') <= b and b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError()
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -sys.maxsize - 1 or nl > sys.maxsize:
            raise ValueError()
        return int(nl)

    def next_double(self):
        return float(self.next())

def main():
    sc = FastScanner()
    s = sc.next()
    t = ""
    for i in range(len(s)):
        if s[i] != 'B':
            t += s[i]
        elif not t:
            continue
        else:
            t = t[:-1]
    print(t)

if __name__ == '__main__':
    main()