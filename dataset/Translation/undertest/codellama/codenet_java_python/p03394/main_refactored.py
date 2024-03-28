class main:
    import sys
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
            self.buf = bytearray(1024)
            self.curChar = 0
            self.numChars = -1
            self.filter = None
    
        def read(self):
            if self.numChars == -1:
                raise InputMismatchException()
            if self.curChar >= self.numChars:
                self.curChar = 0
                try:
                    self.numChars = self.stream.read(self.buf)
                except IOException:
                    raise InputMismatchException()
                if self.numChars <= 0:
                    return -1
            return self.buf[self.curChar++]
    
        def nextInt(self):
            c = self.read()
            while self.isSpaceChar(c):
                c = self.read()
            sgn = 1
            if c == '-':
                sgn = -1
                c = self.read()
            res = 0
            while not self.isSpaceChar(c):
                if c < '0' or c > '9':
                    raise InputMismatchException()
                res *= 10
                res += c - '0'
                c = self.read()
            return res * sgn
    
        def isSpaceChar(self, c):
            if self.filter != None:
                return self.filter.isSpaceChar(c)
            return isWhitespace(c)
    
        def isWhitespace(c):
            return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1
    
    class OutputWriter: