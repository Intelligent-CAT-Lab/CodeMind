import sys

class FastScanner:
    def __init__(self, input):
        self.input = input

    def nextInt(self):
        return int(self.input.readline())

    def nextLong(self):
        return int(self.input.readline())

    def nextDouble(self):
        return float(self.input.readline())

    def nextChar(self):
        return self.input.readline()[0]

    def nextStr(self):
        return self.input.readline().strip()

    def nextIntArray(self, n):
        return [self.nextInt()