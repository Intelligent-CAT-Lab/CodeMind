class main:
    import sys
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
            self.buf = bytearray()
            self.curChar = None
            self.numChars = None
    
        def nextInts(self, n):
            ret = []
            for i in range(n):
                ret.append(self.nextInt())
            return ret
    
        def nextIntTable(self, n, m):
            ret = []
            for i in range(n):
                row = []
                for j in range(m):
                    row.append(self.nextInt())
                ret.append(row)
            return ret
    
        def nextLongs(self, n):
            ret = []
            for i in range(n):
                ret.append(self.nextLong())
            return ret
    
        def nextLongTable(self, n, m):
            ret = []
            for i in range(n):
                row = []
                for j in range(m):
                    row.append(self.nextLong())
                ret.append(row)
            return ret
    
        def nextDoubles(self, n):
            ret = []
            for i in range(n):
                ret.append(self.nextDouble())
            return ret
    
        def next(self):
            if self.numChars is None:
                self.buf = self.stream.readline().strip()
                self.numChars = len(self.buf)
                self.curChar = 0
            if self.curChar >= self.numChars:
                return -1
            c = self.buf[self.curChar]
            self.curChar += 1
            return c
    
        def nextChar(self):
            c = self.next()
            while c == ord(' '):
                c = self.next()
            if 'a' <= chr(c) <= 'z':
                return chr(c)
            if 'A' <= chr(c) <= 'Z':
                return chr(c)
            raise InputMismatchError()
    
        def nextToken(self):
            c = self.next()
            while c == ord(' '):
                c = self.next()
            start = self.curChar - 1
            while c!= ord(' ') and c!= -1:
                c = self.next()
            return self.buf[start:self.curChar-1].decode()
    
        def nextInt(self):
            c = self.next()
            while c == ord(' '):
                c = self.next()
            sgn = 1
            if c == ord('-'):
                sgn = -1
                c = self.next()
            res = 0
            while c!= ord(' ') and c!= -1:
                if c < ord('0') or c > ord('9'):
                    raise InputMismatchError()
                res *= 10
                res +=