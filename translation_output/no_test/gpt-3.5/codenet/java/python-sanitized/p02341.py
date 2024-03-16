import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin
        self.buffer = []
        self.bptr = 0
        self.blen = 0

    def hasNextByte(self):
        if self.bptr < self.blen:
            return True
        else:
            self.bptr = 0
            self.buffer = self.inp.buffer.read()
            self.blen = len(self.buffer)
            if self.blen <= 0:
                return False
        return True
    
    def readByte(self):
        if self.hasNextByte():
            result = self.buffer[self.bptr]
            self.bptr += 1
            return result
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126
    
    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.bptr]):
            self.bptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or b > ord('9'):
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -sys.maxsize or nl > sys.maxsize:
            raise ValueError
        return nl

def main():
    sc = FastScanner()
    
    n = sc.nextInt()
    k = sc.nextInt()

    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == '__main__':
    main()