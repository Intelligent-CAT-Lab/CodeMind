import sys

class FastInput:
    def __init__(self, is):
        self.buf = bytearray()
        self.bufLen = 0
        self.bufOffset = 0
        self.next = -1
        self.is = is
    
    def read(self):
        while self.bufLen == self.bufOffset:
            self.bufOffset = 0
            self.buf = self.is.read(1 << 13)
            self.bufLen = len(self.buf)
            if self.bufLen == 0:
                return -1
        self.next = self.buf[self.bufOffset]
        self.bufOffset += 1
        return self.next
    
    def skipBlank(self):
        while self.next >= 0 and self.next <= 32:
            self.read()
    
    def readInt(self):
        sign = 1
        self.skipBlank()
        if self.next == 43 or self.next == 45:
            sign = 1 if self.next == 43 else -1
            self.read()
        
        val = 0
        if sign == 1:
            while self.next >= 48 and self.next <= 57:
                val = val * 10 + self.next - 48
                self.read()
        else:
            while self.next >= 48 and self.next <= 57:
                val = val * 10 - self.next + 48
                self.read()
        
        return val

class Number