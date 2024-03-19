import sys

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
            return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
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
            raise NoSuchElementException()
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == "-":
            minus = True
            b = self.readByte()
        if b < "0" or "9" < b:
            raise NumberFormatException()
        while True:
            if "0" <= b and b <= "9":
                n *= 10
                n += b - "0"
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < sys.maxsize or nl > sys.maxsize:
            raise NumberFormatException()
        return int(nl)

    def nextIntArray(self, n):
        a = []
        for i in range(n):
            a.append(self.nextInt())
        return a

    def nextIntegerArray(self, n):
        a = []
        for i in range(n):
            a.append(self.nextInt())
        return a

    def nextDouble(self):
        return float(self.next())

if __name__ == "__main__":
    sc = FastScanner()
    n = sc.nextInt()
    k = sc.nextInt()
    if n <= k:
        print(1)
    else:
        print(0)