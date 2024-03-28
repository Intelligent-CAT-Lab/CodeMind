```python
import sys

class FasterScanner:
    def __init__(self, input_stream=sys.stdin):
        self.mIs = input_stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == -1:
            raise InputMismatchException()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.mIs.readinto(self.buf)
            except OSError:
                raise InputMismatchException()
            if self.numChars <= 0:
                return -1
        result = self.buf[self.curChar]
        self.curChar += 1
        return result

    def next_long(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < ord('0') or c > ord('9'):
                raise InputMismatchException()
            res = res * 10 + c - ord('0')
            c = self.read()
        return res * sgn

    def is_space_char(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

def main():
    sc = FasterScanner()

    k = sc.next_long()
    list = []
    for i in range(1, 10):
        list.append(i)
    val = -1
    while k > 0:
        val = list[0]
        list.pop(0)
        if val % 10 != 0:
            list.append(10 * val + val % 10 - 1)
        list.append(10 * val + val % 10)
        if val % 10 != 9:
            list.append(10 * val + val % 10 + 1)
        k -= 1

    print(val)

if __name__ == "__main__":
    main()
```

