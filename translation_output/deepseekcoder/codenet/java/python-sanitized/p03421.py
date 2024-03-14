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
            self.bufferLength = sys.stdin.readinto(self.buffer)
            return self.bufferLength > 0
        else:
            return True

    def read(self):
        if self.updateBuffer():
            return self.buffer[self.pointer:self.pointer + 1]
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
            raise StopIteration

    def nextLong(self):
        if self.hasNext():
            number = 0
            minus = False
            codePoint = self.read()
            if codePoint == b'-':
                minus = True
                codePoint = self.read()
            if codePoint >= b'0' and codePoint <= b'9':
                while True:
                    if codePoint >= b'0' and codePoint <= b'9':
                        number *= 10
                        number += int.from_bytes(codePoint, "big") - ord('0')
                    elif codePoint < 0 or not self.isPrintableChar(codePoint):
                        return (minus) ? -number : number
                    else:
                        raise ValueError
                    codePoint = self.read()
            else:
                raise ValueError
        else:
            raise StopIteration

    def nextInt(self):
        number = self.nextLong()
        if number >= -2147483648 and number <= 2147483647:
            return number
        else:
            raise ValueError

    def isPrintableChar(self, codePoint):
        return codePoint >= 33 and codePoint <= 126

def calc(n, a, b):
    output = []
    for i in range(n - a + 1, n + 1):
        output.append(str(