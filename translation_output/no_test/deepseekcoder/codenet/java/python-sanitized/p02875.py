import sys

class InputReader:
    def __init__(self, input_stream = sys.stdin):
        self.stream = input_stream
        self.buffer = bytearray(10000)
        self.cur = 0
        self.count = 0

    def is_space(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def read(self):
        if self.count == -1:
            raise Exception("InputMismatchException")
        if self.cur >= self.count:
            self.cur = 0
            self.count = self.stream.readinto(self.buffer)
            if self.count <= 0:
                return -1
        return self.buffer[self.cur]

    def read_skip_space(self):
        c = self.read()
        while self.is_space(c):
            c = self.read()
        return c

    def next_int(self):
        sgn = 1
        c = self.read_skip_space()
        if c == '-':
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space(c):
            if c < '0' or c > '9':
                raise Exception("InputMismatchException")
            res = res * 10 + c - '0'
            c = self.read()
        res *= sgn
        return res

class OutputWriter:
    def __init__(self, output_stream = sys.stdout):
        self.writer = output_stream

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.writer.write(' ')
            self.writer.write(str(objects[i]))

    def print_line(self, *objects):
        self.print(*objects)
        self.writer.write('\n')

    def close(self):
        self.writer.close()

class TaskC:
    MOD = 998244353

    def solve(self, test_number, in_reader, out_writer):
        n = in_reader.next_int() // 2
        res = 7
        p2 = 8
        num = 1
        den = 2
        for i in