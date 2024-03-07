import sys

class StdIn:
    def __init__(self):
        self.buffer = []
        self.buffer_size = 1 << 16
        self.buffer_pointer = 0
        self.bytes_read = 0

    def read(self):
        if self.buffer_pointer == self.bytes_read:
            self.fill_buffer()
        return self.buffer[self.buffer_pointer++]

    def fill_buffer(self):
        self.buffer = sys.stdin.read(self.buffer_size)
        self.bytes_read = len(self.buffer)
        if self.bytes_read == 0:
            self.buffer[0] = -1

    def next(self):
        c = self.read()
        while c != -1 and (c == ' ' or c == '\n' or c == '\r'):
            c = self.read()
        s = ''
        while c != -1 and (c != ' ' and c != '\n' and c != '\r'):
            s += chr(c)
            c = self.read()
        return s

    def next_line(self):
        c = self.read()
        while c != -1 and (c == ' ' or c == '\n'