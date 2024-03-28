import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin
        self.buffer = []
        self.ptr = 0

    def hasNextByte(self):
        while not self.buffer or self.ptr == len(self.buffer):
            self.buffer = self.inp.buffer.read(1024)
            self.ptr = 0
            if not self.buffer:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            self.ptr += 1
            return self.buffer[self.ptr - 1]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

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