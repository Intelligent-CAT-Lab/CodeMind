import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0
        self.filter = None

    def read(self):
        if self.num_chars == -1:
            raise InputMismatchException()
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                raise InputMismatchException()
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]

    def ni(self):
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

    def is_space_char(self, c):
        if self.filter is not None:
            return self.filter.is_space_char(c)
        return is_whitespace(c)

    def is_whitespace(c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

class OutputWriter:
    def __init__(self, output_stream):
        self.writer = PrintWriter(BufferedWriter(OutputStreamWriter(output_stream)))

    def print(self, *objects):
        for i in range(len(objects)):
            if i != 0:
                self.writer.print(' ')
            self.writer.print(objects[i])

    def println(self, *objects):
        self.print(objects)
        self.writer.println()

    def close(self):
        self.writer.close()

class AOn