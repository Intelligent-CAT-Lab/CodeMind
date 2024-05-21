import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0

    def next_ints(self, n):
        ret = [0] * n
        for i in range(n):
            ret[i] = self.next_int()
        return ret

    def next_int_table(self, n, m):
        ret = [[0] * m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                ret[i][j] = self.next_int()
        return ret

    def next_longs(self, n):
        ret = [0] * n
        for i in range(n):
            ret[i] = self.next_long()
        return ret

    def next_long_table(self, n, m):
        ret = [[0] * m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                ret[i][j] = self.next_long()
        return ret

    def next_doubles(self, n):
        ret = [0.0] * n
        for i in range(n):
            ret[i] = self.next_double()
        return ret

    def next(self):
        if self.num_chars == -1:
            raise ValueError("Input stream closed")
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError("Input stream closed")
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]

    def next_char(self):
        c = self.next()
        while c.isspace():
            c =