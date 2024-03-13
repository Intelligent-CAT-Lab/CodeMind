import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        sign = 1
        b = self.stream.read(1)
        while b != '-' and b != '+' and (b < '0' or '9' < b):
            b = self.stream.read(1)
        if b == '-':
            sign = -1
            b = self.stream.read(1)
        elif b == '+':
            b = self.stream.read(1)
        ret = b - '0'
        while True:
            b = self.stream.read(1)
            if b < '0' or '9' < b:
                return ret * sign
            ret *= 10