import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def close(self):
        try:
            self.inp.close()
        except IOError:
            pass

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.inp.readinto(self.buffer)
            except IOError:
                pass
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return '!' <= c and c <= '~'

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == '-':
            minus = True
            b = self.read_byte()
        if b < '0' or '9' < b:
            raise NumberFormatException()
        while True:
            if '0' <= b and b <= '9':
                n *= 10
                n += b - '0'
            elif b == -1 or not self.is_printable_char(b):
                return minus and -n or n
            else:
                raise NumberFormatException()
            b = self.read_byte()

sc = Scanner(sys.stdin)
out = PrintWriter(sys.stdout)

x = sc.next_long()
sc.close()

ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
out.println(ans)
out.flush()