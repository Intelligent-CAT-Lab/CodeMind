```python
import sys

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        return self.ptr < self.buflen or self.updateBuffer()

    def updateBuffer(self):
        self.ptr = 0
        self.buffer = bytearray()
        while True:
            try:
                self.buffer = self.input_stream.read(1024)
                if self.buffer:
                    self.buflen = len(self.buffer)
                    return True
                else:
                    return False
            except IOError:
                pass

    def readByte(self):
        if self.hasNextByte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration()
        sb = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(b)
            b = self.readByte()
        return sb.decode()

    def nextLong(self):
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # "-"
            minus = True
            b = self.readByte()
        if not 48 <= b <= 57:  # '0'-'9'
            raise ValueError()
        while True:
            if 48 <= b <= 57:
                n = n * 10 + b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError()
        return nl

def main():
    sc = FastScanner()
    n = sc.nextInt()
    k = sc.nextInt()

    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()
```
