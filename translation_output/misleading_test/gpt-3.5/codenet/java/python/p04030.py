```python
class FastScanner:
    def __init__(self):
        self.in_ = sys.stdin
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buffer = self.in_.read(1024)
            except IOError:
                pass
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

    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self) -> str:
        if not self.hasNext():
            raise StopIteration()
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self) -> int:
        if not self.hasNext():
            raise StopIteration()
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if b not in range(ord('0'), ord('9') + 1):
            raise ValueError()
        while True:
            if ord('0') <= b <= ord('9'):
                n = n * 10 + b - ord('0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError()
            b = self.readByte()

    def nextInt(self) -> int:
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError()
        return nl

    def nextDouble(self) -> float:
        return float(self.next())


def main():
    sc = FastScanner()
    s = sc.next()
    t = ""
    for i in range(len(s)):
        if s[i] != 'B':
            t += s[i]
        elif not t:
            continue
        else:
            t = t[:-1]
    print(t)


if __name__ == "__main__":
    import sys
    sys.setrecursionlimit(10**7)
    main()
```

