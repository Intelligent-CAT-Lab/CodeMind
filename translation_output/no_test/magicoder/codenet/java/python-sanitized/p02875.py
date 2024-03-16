import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(10000)
        self.cur = 0
        self.count = 0

    def read(self):
        if self.count == -1:
            raise EOFError()
        if self.cur >= self.count:
            self.cur = 0
            self.count = self.stream.readinto(self.buffer)
            if self.count <= 0:
                return -1
        return self.buffer[self.cur]

    def read_skip_space(self):
        c = self.read()
        while c in [b' ', b'\n', b'\r', b'\t']:
            c = self.read()
        return c

    def next_int(self):
        sgn = 1
        c = self.read_skip_space()
        if c == b'-':
            sgn = -1
            c = self.read()
        res = 0
        while c not in [b' ', b'\n', b'\r', b'\t']:
            if c < b'0' or c > b'9':
                raise ValueError()
            res = res * 10 + c - b'0'
            c = self.read()
        res *= sgn
        return res

class OutputWriter:
    def __init__(self, stream):
        self.stream = stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.stream.write(b' ')
            self.stream.write(str(objects[i]).encode())

    def print_line(self, *objects):
        self.print(*objects)
        self.stream.write(b'\n')

    def close(self):
        self.stream.close()

class TaskC:
    MOD = 998244353

    def solve(self, test_number, inp, out):
        n = inp.next_int() // 2
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in range(1, n):
            res = (res * 9) % self.MOD
            if i > 1:
                inc = p2
                inc = (inc * num) % self.MOD