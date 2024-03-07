import sys

class FasterScanner:
    def __init__(self, input_stream):
        self.input_stream = input_stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0

    def read(self):
        if self.num_chars == -1:
            raise InputMismatchException()
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.input_stream.readinto(self.buf)
            except IOError:
                raise InputMismatchException()
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char++]

    def next_line(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = bytearray()
        while not self.is_end_of_line(c):
            res.append(c)
            c = self.read()
        return res.decode()

    def next_string(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = bytearray()
        while not self.is_space_char(c):
            res.append(c)
            c = self.read()
        return res.decode()

    def next_long(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < '0' or c > '9':
                raise InputMismatchException()
            res *= 10
            res += c - '0'
            c = self.read()
        return res * sgn

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < '0' or c > '9':
                raise InputMismatchException()
            res *= 10