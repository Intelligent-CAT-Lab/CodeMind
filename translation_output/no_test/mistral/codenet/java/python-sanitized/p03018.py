import sys

def p(x):
    print(x)

def pp(x):
    print(x, end=' ')

def min(x, y, z):
    return min(min(x, y), z)

def max(x, y, z):
    return max(max(x, y), z)

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
                pass
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
            raise NoSuchElementError()
        sb = StringBuilder()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.appendCodePoint(b)
            b = self.readByte()
        return sb.str()

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementError()
        n = 0
        minus = False
        b = self.readByte()
        if b == '-':
            minus = True
            b = self.readByte()
        if b < '0' or '9' < b:
            raise ValueError()
        while True:
            if '0' <= b and b <= '9':
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
    sc = FastScanner()
    str = sc.next()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(str)-1, -1, -1):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)