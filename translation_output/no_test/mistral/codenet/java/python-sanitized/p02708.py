import sys

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

    def next(self):
        if not self.hasNext():
            raise ValueError()
        sb = StringBuilder()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.appendCodePoint(b)
            b = self.readByte()
        return sb.toString()

    def nextLong(self):
        if not self.hasNext():
            raise ValueError()
        n = 0
        minus = False
        b = self.readByte()
        if b == '-':
            minus = True
            b = self.readByte()
        if not (b >= '0' and b <= '9'):
            raise ValueError()
        while True:
            if b >= '0' and b <= '9':
                n *= 10
                n += b - '0'
            elif b == -1 or not self.isPrintableChar(b):
                return minus * n if minus else n
            else:
                raise ValueError()
            b = self.readByte()

    def nextInt(self):
        return int(self.nextLong())

    def nextDouble(self):
        return float(self.next())


if __name__ == '__main__':
    n = int(input())
    k = int(input())
    ans = 0
    for i in range(k, n + 1):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % 1000000007
    print(ans)