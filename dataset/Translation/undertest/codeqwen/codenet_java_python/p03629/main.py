import sys

class InputReader:
    def __init__(self, inp):
        self.inp = inp
        self.buffer = bytearray(1024)
        self.curbuf = 0
        self.lenbuf = 0

    def has_next_byte(self):
        if self.curbuf >= self.lenbuf:
            self.curbuf = 0
            try:
                self.lenbuf = self.inp.readinto(self.buffer)
            except IOError:
                raise ValueError()
            if self.lenbuf <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.curbuf]
        else:
            return -1

    def is_space_char(self, c):
        return not (33 <= c <= 126)

    def skip(self):
        while self.has_next_byte() and self.is_space_char(self.buffer[self.curbuf]):
            self.curbuf += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise ValueError()
        sb = []
        c = self.read_byte()
        while not self.is_space_char(c):
            sb.append(chr(c))
            c = self.read_byte()
        return ''.join(sb)

    def next_int(self):
        if not self.has_next():
            raise ValueError()
        c = self.read_byte()
        while self.is_space_char(c):
            c = self.read_byte()
        minus = False
        if c == ord('-'):
            minus = True
            c = self.read_byte()
        res = 0
        while not self.is_space_char(c):
            if not (ord('0') <= c <= ord('9'))