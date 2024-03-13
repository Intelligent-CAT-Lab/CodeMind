import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream

    def close(self):
        self.stream.close()

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        sign = 1
        b = self.stream.read(1)
        while ((b < '0' or '9' < b) and b != '-' and b != '+') and b != '\n':
            b = self.stream.read(1)
        if b == '-':
            sign = -1
            b = self.stream.read(1)
        elif b == '+':
            b = self.stream.read(1)
        ret = b - '0'
        while