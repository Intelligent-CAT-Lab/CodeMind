import java.io.IOException
import java.util.Scanner

class FastScanner:
    def __init__(self):
        self.in = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0
    
    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in.read(self.buffer)
            except IOError:
                return False
            if self.buflen <= 0:
                return False
        return True
    
    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1
    
    def isPrintableChar(self, c):
        return 33 <= c and c <= 126
    
    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()