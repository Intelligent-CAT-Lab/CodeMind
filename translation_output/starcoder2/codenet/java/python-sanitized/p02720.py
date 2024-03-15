import sys

class FasterScanner:
    def __init__(self, file):
        self.file = file
        self.buf = []
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == 0:
            self.buf = self.file.read(1024)
            self.numChars = len(self.buf)
            self.curChar = 0
        if self.numChars == 0:
            return -1
        else:
            self.numChars -= 1
            return self.buf[self.curChar]

    def isSpaceChar(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def isEndOfLine(self, c):
        return c == '\n' or c == '\r' or c == -1

    def nextLine(self):
        res = ''
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        while not self.isEndOfLine(c):
            res += chr(c)
            c = self.read()
        return res

    def nextString(self):
        res = ''
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        while not self.isSpaceChar(c):
            res += chr(c)
            c = self.read()
        return res

    def nextLong(self):
        res = 0
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        while not self.isSpaceChar(c):
            res *= 10
            res += int(c)
            c = self.read()
        return res * sgn

    def nextInt(self):
        res = 0
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        while not self.isSpaceChar(c):
            res *= 10
            res += int(c)
            c = self.read()
        return res * sgn

    def close(self):
        self.file.close()

def main():
    sc = FasterScanner(sys.stdin)

    k = sc.nextInt()
    list = []
    for i in range(1, 10):
        list.append(i)
    val = -1
    while k > 0:
        val = list[0]
        list.pop(0)
        if val % 10 != 0:
            list.append(10*val + val%10 - 1)
        list.append(10*val + val%10)
        if val % 10 != 9:
            list.append(10*val + val%10 + 1)
        k -= 1
    print(val)

    sc.close()

if __name__ == '__main__':
    main()