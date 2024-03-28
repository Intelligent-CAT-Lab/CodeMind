class main:
    import sys
    import math
    
    class InputReader:
        def __init__(self):
            self.buffer = sys.stdin.readline().strip()
            self.pos = 0
    
        def read(self):
            if self.pos == len(self.buffer):
                self.buffer = sys.stdin.readline().strip()
                self.pos = 0
            c = self.buffer[self.pos]
            self.pos += 1
            return c
    
        def nextInt(self):
            num = 0
            sign = 1
            c = self.read()
            while c =='':
                c = self.read()
            if c == '-':
                sign = -1
                c = self.read()
            while c.isdigit():
                num = num * 10 + int(c)
                c = self.read()
            return sign * num
    
        def nextLong(self):
            num = 0
            sign = 1
            c = self.read()
            while c =='':
                c = self.read()
            if c == '-':
                sign = -1
                c = self.read()
            while c.isdigit():
                num = num * 10 + int(c)
                c = self.read()
            return sign * num
    
        def nextDouble(self):
            num = 0
            sign = 1
            decimal = False
            c = self.read()
            while c =='':
                c = self.read()
            if c == '-':
                sign = -1
                c = self.read()
            while c.isdigit():
                num = num * 10 + int(c)
                c = self.read()
            if c == '.':
                decimal = True
                c = self.read()
                while c.isdigit():
                    num = num * 10 + int(c)
                    c = self.read()
            if not decimal:
                return sign * num
            else:
                return sign * num / math.pow(10, len(str(num)))
    
        def readString(self):