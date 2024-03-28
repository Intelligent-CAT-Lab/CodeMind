import sys

class Reader:
    def __init__(self, source):
        self.source = source
        self.buf = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        self.ptr = 0
        try:
            self.buflen = self.source.readinto(self.buf)
        except IOError:
            pass
        if self.buflen <= 0:
            return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buf[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable_char(self.buf[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException
        minus = False
        num = self.read_byte()
        if num == '-':
            num = 0
            minus = True
        elif not (33 <= num <= 126):
            raise NumberFormatException
        else:
            num -= 48
        while True:
            b = self.read_byte()
            if 48 <= b <= 57:
                num = num * 10 + (b - 48)
            elif b == -1 or not self.is_printable_char(b):
                return minus and -num or num
            else:
                raise NoSuchElementException

    def next_int(self):
        num = self.next_long()
        if num < sys.maxint or sys.maxint < num:
            raise NumberFormatException
        return num

    def next_double(self):
        return float(self.next())

    def next_char(self):
        if not self.has_next():
            raise NoSuchElementException
        return chr(self.read_byte())

    def next_line(self):
        while self.has_next_byte() and (self.buf[self.ptr] == '\n' or self.buf[self.ptr] == '\r'):
            self.ptr += 1
        if not self.has_next_byte():
            raise NoSuchElementException
        sb = []
        b = self.read_byte()
        while b != '\n' and b != '\r':
            sb.append(chr(b))
            b = self.read_byte()