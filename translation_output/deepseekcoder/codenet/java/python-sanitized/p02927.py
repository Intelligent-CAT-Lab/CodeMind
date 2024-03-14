import sys

class FastScanner:
    def __init__(self, input=sys.stdin):
        self.input = input

    def nextInt(self):
        return int(self.nextLong())

    def nextLong(self):
        sign = 1
        b = self.input.read(1)
        while b != '-' and b != '+' and (b < '0' or '9' < b):
            b = self.input.read(1)
        if b == '-':
            sign = -1
            b = self.input.read(1)
        elif b == '+':
            b = self.input.read(1)
        ret = b - '0'
        while True:
            b = self.input.read(1)
            if b < '0' or '9' < b:
                return ret * sign