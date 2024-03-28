class main:
    import sys
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
            self.buf = bytearray(1024)
            self.curChar = 0
            self.numChars = -1
    
        def next(self):
            if self.numChars == -1:
                raise InputMismatchException()
            if self.curChar >= self.numChars:
                self.curChar = 0
                try:
                    self.numChars = self.stream.read(self.buf)
                except IOError:
                    raise InputMismatchException()
                if self.numChars <= 0:
                    return -1
            return self.buf[self.curChar++]
    
        def nextChar(self):
            c = self.next()
            while self.isSpaceChar(c):
                c = self.next()
            if 'a' <= c <= 'z' or 'A' <= c <= 'Z':
                return chr(c)
            raise InputMismatchException()
    
        def nextToken(self):
            c = self.next()
            while self.isSpaceChar(c):
                c = self.next()
            res = ''
            while not self.isSpaceChar(c):
                res += chr(c)
                c = self.next()
            return res
    
        def nextInt(self):
            c = self.next()