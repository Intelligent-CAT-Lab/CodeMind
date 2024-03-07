import sys

class FastScanner:
    def __init__(self, file=sys.stdin):
        self.file = file
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.file.readinto(self.buffer)
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
            if "0" <= b <= "9":
                n *= 10
                n += ord(b) - ord("0")
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < sys.maxint or nl > sys.maxint:
            raise NumberFormatException()
        return int(nl)

    def nextDouble(self):
        return float(self.next())

class p03018:
    def __init__(self, sc):
        self.sc = sc

    def main(self):
        str = self.sc.next()
        str = str.replace("BC", "X")
        a = 0
        ans = 0
        for i in range(len(str) - 1, -1, -1):
            c = str[i]
            if c == "X":
                a += 1
            elif c == "A":
                ans += a
            else:
                a = 0
        print(ans)

if __name__ == "__main__":
    sc = FastScanner()
    p03018(sc).main()