import sys

class FastScanner:
    def __init__(self, file):
        self.reader = (line for line in file)
        self.tokenizer = None

    def next(self):
        while True:
            if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                try:
                    line = next(self.reader)
                except StopIteration:
                    return None
                self.tokenizer = FastScanner.StringTokenizer(line)
            else:
                return self.tokenizer.nextToken()

    def hasMoreTokens(self):
        while True:
            if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                try:
                    line = next(self.reader)
                except StopIteration:
                    return False
                self.tokenizer = FastScanner.StringTokenizer(line)
            else:
                return True

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    class StringTokenizer:
        def __init__(self, string):
            self.string = string.strip()
            self.start = 0
            self.end = 0

        def hasMoreTokens(self):
            return self.start < len(self.string)

        def nextToken(self):
            if self.hasMoreTokens():
                end = self.string.find(' ', self.start)
                if end == -1:
                    end = len(self.string)
                token = self.string[self.start:end]
                self.start = end + 1
                return token
            else:
                return None

def solve():
    M = 2222
    mod = int(1e9 + 7)

    c = [[0]*M for _ in range(M)]
    c[0][0] = 1
    for i in range(1, M):
        c[i][0] = 1
        for j in range(1, M):