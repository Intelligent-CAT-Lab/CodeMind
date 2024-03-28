import sys

class Scanner:
    def __init__(self, input_stream):
        self.inp = input_stream
        self.buffer = b''
        self.ptr = 0
        self.buflen = 0

    def close(self):
        self.inp.close()

    def fill_buffer(self):
        self.buffer = self.inp.buffer.read()
        self.buflen = len(self.buffer)
        self.ptr = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.fill_buffer()
            return self.ptr < self.buflen

    def read_byte(self):
        if self.has_next_byte():
            self.ptr += 1
            return self.buffer[self.ptr - 1]
        return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next_long(self):
        if not self.has_next():
            raise ValueError("No more input")
        
        n = 0
        minus = False
        b = self.read_byte()
        if b == 45:  # ASCII value for '-'
            minus = True
            b = self.read_byte()

        while 48 <= b <= 57:  # ASCII values for '0' and '9'
            n = 10 * n + (b - 48)
            b = self.read_byte()

        return -n if minus else n


def main():
    sc = Scanner(sys.stdin)

    x = sc.next_long()

    ans = x // 11 * 2 + (x % 11) // 7 + min(x % 11, 1)
    print(ans)


if __name__ == "__main__":
    main()