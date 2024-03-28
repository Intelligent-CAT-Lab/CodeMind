import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = ""
        self.pos = 0
        self.eof = False

    def read(self):
        if self.eof and self.pos >= len(self.buffer):
            return -1
        if self.pos >= len(self.buffer):
            self.buffer = self.stream.readline()
            self.pos = 0
            if len(self.buffer) == 0:
                self.eof = True
                return -1
        ret = self.buffer[self.pos]
        self.pos += 1
        return ret

    def nextInt(self):
        ret = 0
        sign = 1
        while True:
            c = self.read()
            if c == -1:
                break
            if c =='':
                continue
            if c == '-':
                sign = -1
                continue
            if c < '0' or c > '9':
                break
            ret = ret * 10 + (ord(c) - ord('0'))
        return sign * ret

    def nextLong(self):
        ret = 0
        sign = 1
        while True:
            c = self.read()
            if c == -1:
                break
            if c =='':
                continue
            if c == '-':
                sign = -1
                continue
            if c < '0' or c > '9':
                break
            ret = ret * 10 + (ord(c) - ord('0'))
        return sign * ret

    def nextDouble(self):
        ret = 0
        sign = 1
        while True:
            c = self.read()
            if c == -1:
                break
            if c =='':
                continue
            if c == '-':
                sign = -1
                continue
            if c < '0' or c > '9':
                break
            ret = ret * 10 + (ord(c) - ord('0'))
        if c == '.':
            while True:
                c = self.read()
                if c == -1:
                    break
                if c =='':
                    continue
                if c < '0' or c > '9':
                    break
                ret = ret * 10 + (ord(c) - ord('0'))