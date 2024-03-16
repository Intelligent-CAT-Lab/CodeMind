
```
import sys

class BetterScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.pointer = 0
        self.bufferLength = 0

    def updateBuffer(self):
        if self.pointer >= self.bufferLength:
            self.pointer = 0
            try:
                self.bufferLength = self.stream.readinto(self.buffer)
            except IOError:
                pass
            return self.bufferLength > 0
        else:
            return True

    def read(self):
        if self.updateBuffer():
            return self.buffer[self.pointer]
        else:
            return -1

    def hasNext(self):
        self.skipUnprintable()
        return self.updateBuffer()

    def skipUnprintable(self):
        while self.updateBuffer() and not self.isPrintableChar(self.buffer[self.pointer]):
            self.pointer += 1

    def next(self):
        if self.hasNext():
            builder = []
            codePoint = self.read()
            while self.isPrintableChar(codePoint):
                builder.append(chr(codePoint))
                codePoint = self.read()
            return ''.join(builder)
        else:
            raise Exception('No such element')

    def nextLong(self):
        if self.hasNext():
            number = 0
            minus = False
            codePoint = self.read()
            if codePoint == ord('-'):
                minus = True
                codePoint = self.read()
            if codePoint >= ord('0') and codePoint <= ord('9'):
                while True:
                    if codePoint >= ord('0') and codePoint <= ord('9'):
                        number *= 10
                        number += codePoint - ord('0')
                    elif codePoint < 0 or not self.isPrintableChar(codePoint):
                        return (minus) and -number or number
                    else:
                        raise Exception('Number format exception')
                    codePoint = self.read()
            else:
                raise Exception('Number format exception')
        else:
            raise Exception('No such element')

    def nextInt(self):
        number = self.nextLong()
        if number >= -2147483648 and number <= 2147483647:
            return number
        else:
            raise Exception('Number format exception')

    def isPrintableChar(self, codePoint):
        return codePoint >= 33 and codePoint <= 126

class p03421:
    def run(self):
        scanner = BetterScanner(sys.stdin.buffer)

        n = scanner.nextInt()
        a = scanner.nextInt()
        b = scanner.nextInt()

        self.calc(n, a, b)

    def calc(self, n, a, b):
        for i in range(n - a + 1, n + 1):
            self.output.append(str(i) + ' ')
        rest = n - a - b + 1
        if rest < 0:
            print(-1)
            return
        elif rest >= 1:
            if not self.calcInner(rest, a - 1, b - 1):
                print(-1)
                return
        for i in range(n - a, rest, -1):
            self.output.append(str(i) + ' ')
        self.output.pop()
        print(''.join(self.output))

    def calcInner(self, n, a, b):
        first = []
        second = []
        while True:
            if a <= 0 or b <= 0:
                return False
            firstI = (n - a + 1 >= 1) and n - a + 1 or 1
            for i in range(firstI, n + 1):
                first.append(str(i) + ' ')
            rest = n - a - b + 1
            endI = (rest + 1 >= 1) and rest + 1 or 1
            subSecond =
