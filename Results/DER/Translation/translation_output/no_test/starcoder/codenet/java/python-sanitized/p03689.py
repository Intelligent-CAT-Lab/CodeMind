import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def nextChar(self):
        if self.numChars == -1:
            raise InputMismatchException()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except:
                raise InputMismatchException()
            if self.numChars <= 0:
                return -1
        self.curChar += 1
        return self.buf[self.curChar-1]

    def nextInt(self):
        c = self.nextChar()
        while c <= 32:
            c = self.nextChar()
        if c == -1:
            return -1
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.nextChar()
        res = 0
        while c > 32:
            if c < '0' or c > '9':
                raise InputMismatchException()
            res *= 10
            res += c - '0'
            c = self.nextChar()
        return res * sgn

    def nextLong(self):
        c = self.nextChar()
        while c <= 32:
            c = self.nextChar()
        if c == -1:
            return -1
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.nextChar()
        res = 0
        while c > 32:
            if c < '0' or c > '9':
                raise InputMismatchException()
            res *= 10
            res += c - '0'
            c = self.nextChar()
        return res * sgn

    def nextDouble(self):
        return float(self.nextToken())

    def nextToken(self):
        c = self.nextChar()
        while c <= 32:
            c = self.nextChar()
        if c == -1:
            return -1
        s = []
        while c > 32:
            s.append(chr(c))
            c = self.nextChar()
        return ''.join(s)

    def nextString(self):
        c = self.nextChar()
        while c <= 32:
            c = self.nextChar()
        if c == -1:
            return -1
        s = []
        while c > 32:
            s.append(chr(c))
            c = self.nextChar()
        return ''.join(s)

    def nextLine(self):
        c = self.nextChar()
        while c <= 32:
            c = self.nextChar()
        if c == -1:
            return -1
        s = []
        while c > 32:
            s.append(chr(c))
            c = self.nextChar()
        return ''.join(s)

    def nextBoolean(