import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = []
        self.curchar = None
        self.nextchar = None
        self.eof = False

    def read(self):
        if self.curchar is None:
            self.curchar = self.stream.read(1)
            if self.curchar == '':
                self.eof = True
                self.curchar = None
                return None
            self.nextchar = self.stream.read(1)
        c = self.curchar
        self.curchar = self.nextchar
        self.nextchar = self.stream.read(1)
        return c

    def peek(self):
        if self.curchar is None:
            self.curchar = self.stream.read(1)
            if self.curchar == '':
                self.eof = True
                self.curchar = None
                return None
            self.nextchar = self.stream.read(1)
        return self.curchar

    def next(self):
        c = self.read()
        if c is None:
            raise StopIteration
        return c

    def hasNext(self):
        return not self.eof

class Solution:
    def __init__(self):
        self.reader = InputReader(sys.stdin)
        self.writer = sys.stdout

    def solve(self):
        s = self.reader.next()
        n = len(s)
        dp = [[[0, 0] for i in range(26)] for j in range(n + 1)]
        for i in range(n):
            dp[n][ord(s[i]) - ord('a')] = [ord(s[i]) - ord('a'), 1]
        for i in range(n - 1, -1, -1):
            for j in range(26):