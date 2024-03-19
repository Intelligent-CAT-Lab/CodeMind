import sys

class FastScanner:
    def __init__(self, input):
        self.input = input

    def nextInt(self):
        return int(self.nextLong())

    def nextLong(self):
        return int(self.nextDouble())

    def nextDouble(self):
        return float(self.nextStr())

    def nextStr(self):
        return self.input.readline().strip()

    def nextChar(self):
        return self.input.read(1)

    def nextIntArray(self, n):
        return [self.next