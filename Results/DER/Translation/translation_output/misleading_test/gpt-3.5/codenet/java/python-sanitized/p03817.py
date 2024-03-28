import sys

class Scanner:
    def __init__(self, stream):
        self.instream = stream
        self.buffer = b''
        self.ptr = 0
        self.buflen = 0

    def close(self):
        self.instream.close()

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = self.instream.read(1024)
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        else:
            return -1

    def isPrintableChar(self, c):
        return ord('!') <= c <= ord('~')

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def nextLong(self):
        if not self.hasNext():
            raise ValueError('NoSuchElementException')
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b < ord('0') or b > ord('9'):
            raise ValueError('NumberFormatException')
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError('NumberFormatException')
            b = self.readByte()


def main():
    sc = Scanner(sys.stdin.buffer)
    x = sc.nextLong()
    sc.close()

    ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
    print(ans)

if __name__ == "__main__":
    main()