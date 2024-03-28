```python
import sys
from io import BytesIO

class FastScanner:
    def __init__(self):
        self.input_buffer = BytesIO(sys.stdin.buffer.read())
        self.ptr = 0

    def hasNextByte(self):
        return self.ptr < len(self.input_buffer.getvalue())

    def readByte(self):
        if self.hasNextByte():
            self.ptr += 1
            return self.input_buffer.getvalue()[self.ptr - 1]
        else:
            return -1

    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.input_buffer.getvalue()[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration()
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration()
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:  # ASCII for '-'
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:  # ASCII for '0' to '9'
            raise ValueError("Not a valid long number")
        while True:
            if 48 <= b <= 57:
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError("Not a valid long number")
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2**31 or nl > 2**31 - 1:
            raise ValueError("Not a valid integer number")
        return nl

    def nextDouble(self):
        return float(self.next())

def main():
    scanner = FastScanner()
    a = scanner.nextInt()
    b = scanner.nextInt()
    c = scanner.nextInt()

    i = (a + b == c)
    j = (a + c == b)
    k = (b + c == a)

    if i or j or k:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    try:
        main()
    except Exception as e:
        print(e)
```
```
