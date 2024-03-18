```python
class FastScanner:
    def __init__(self):
        import sys
        self.inp = sys.stdin.buffer.read()
        self.ptr = 0

    def hasNextByte(self):
        return self.ptr < len(self.inp)

    def readByte(self):
        if self.hasNextByte():
            res = self.inp[self.ptr]
            self.ptr += 1
            return res
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.inp[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        res = bytearray()
        b = self.readByte()
        while self.isPrintableChar(b):
            res.append(b)
            b = self.readByte()
        return res.decode()

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == ord('-'):
            minus = True
            b = self.readByte()
        if not ord('0') <= b <= ord('9'):
            raise NumberFormatException()
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.readByte()

def solve():
    a, b = map(int, input().split())
    a -= 1
    b -= 1
    num = 100
    ans = [[j < num // 2 for j in range(num)] for i in range(num)]
    for i in range(0, num, 2):
        for j in range(0, num // 2, 2):
            if a <= 0:
                break
            ans[i][j] = not ans[i][j]
            a -= 1
        for j in range(num // 2 + 1, num, 2):
            if b <= 0:
                break
            ans[i][j] = not ans[i][j]
            b -= 1
    
    print(num, num)
    for i in range(num):
        print(''.join(['#' if ans[i][j] else '.' for j in range(num)]))

if __name__ == "__main__":
    solve()
```
