import sys

class FastScanner:
    def __init__(self, input_stream):
        self.input = input_stream

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        sign = 1
        b = self.input.read(1)
        while (b < '0' or '9' < b) and b != '-' and b != '+':
            b = self.input.read(1)
        if b == '-':
            sign = -1
            b = self.input.read(1)
        elif b == '+':
            b = self.input.read(1)
        ret = ord(b) - ord('0')
        while True:
            b = self.input.read(1)
            if b < '