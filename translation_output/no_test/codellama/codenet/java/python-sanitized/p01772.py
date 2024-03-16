import sys

class MyScanner:
    def __init__(self):
        self.input = sys.stdin.readline()
        self.index = 0

    def read(self):
        if self.index >= len(self.input):
            return -1
        else:
            self.index += 1
            return ord(self.input[self.index - 1])

    def isSpaceChar(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def isEndline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def nextInt(self):
        return int(self.next())

    def nextIntArray(self, n):
        array = []
        for i in range(n):
            array.append(self.nextInt())
        return array

    def nextLong(self):
        return long(self.next())

    def nextLongArray(self, n):
        array = []
        for i in range(n):
            array.append(self.nextLong())
        return array

    def nextDouble(self):
        return float(self.next())

    def nextDoubleArray(self, n):
        array = []
        for i in range(n):
            array.append(self.nextDouble())
        return array

    def next(self):
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        res = ''
        while not self.isSpaceChar(c):
            res += chr(c)
            c = self.read()
        return res

    def nextStringArray(self, n):
        array = []
        for i in range(n):
            array.append(self.next())
        return array

    def nextLine(self):
        c = self.read()
        while self.isEndline(c):
            c = self.read()
        res = ''
        while not self.isEndline(c):
            res += chr(c)
            c = self.read()
        return res

def run():
    sc = MyScanner()
    c = sc.next().toCharArray()
    n = len(c)
    s = ''
    for i in range(n):
        if c[i] == 'A' or c[i] == 'Z':
            s += c[i]
    c = s.toCharArray()
    n = len(c)
    s = ''
    for i in range(n):
        if s == '' or s[-1] != c[i]:
            s += c[i]
    if 0 < len(s) and s[0] == 'Z':
        s = s[1:]
    if 0 < len(s) and s[-1] == 'A':
        s = s[:-1]
    if 0 < len(s