import sys

class ContestReader:
    def __init__(self, inp):
        self.reader = inp
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = sys.stdin.readline()
            except Exception as e:
                raise RuntimeError(e)
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def next(self, n):
        array = []
        for i in range(n):
            array.append(self.next())
        return array

    def nextInt(self, n):
        array = []
        for i in range(n):
            array