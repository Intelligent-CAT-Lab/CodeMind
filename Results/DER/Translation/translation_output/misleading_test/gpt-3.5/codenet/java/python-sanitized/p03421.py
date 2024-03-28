import sys
 
class BetterScanner:
 
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray()
        self.pointer = 0
        self.bufferLength = 0
 
    def updateBuffer(self):
        if self.pointer >= self.bufferLength:
            self.pointer = 0
            self.buffer = self.stream.read(1024)
            self.bufferLength = len(self.buffer)
        return self.bufferLength > 0
 
    def read(self):
        if self.updateBuffer():
            val = self.buffer[self.pointer]
            self.pointer += 1
            return val
        return -1
 
    def skipUnprintable(self):
        while self.updateBuffer() and not chr(self.buffer[self.pointer]).isprintable():
            self.pointer += 1
 
    def hasNext(self):
        self.skipUnprintable()
        return self.updateBuffer()
 
    def next(self):
        if self.hasNext():
            builder = bytearray()
            codePoint = self.read()
            while chr(codePoint).isprintable():
                builder.append(codePoint)
                codePoint = self.read()
            return builder.decode()
        raise NoSuchElementException()
 
    def nextLong(self):
        if self.hasNext():
            number = 0
            minus = False
            codePoint = self.read()
            if codePoint == ord('-'):
                minus = True
                codePoint = self.read()
            if ord('0') <= codePoint <= ord('9'):
                while True:
                    if ord('0') <= codePoint <= ord('9'):
                        number *= 10
                        number += codePoint - ord('0')
                    elif codePoint < 0 or not chr(codePoint).isprintable():
                        return -number if minus else number
                    else:
                        raise NumberFormatException()
                    codePoint = self.read()
            else:
                raise NumberFormatException()
        else:
            raise NoSuchElementException()
 
    def nextInt(self):
        number = self.nextLong()
        if -2**31 <= number <= 2**31 - 1:
            return int(number)
        raise NumberFormatException()
 
def main():
    scanner = BetterScanner(sys.stdin)
 
    n = scanner.nextInt()
    a = scanner.nextInt()
    b = scanner.nextInt()
 
    calc(n, a, b)
 
def calc(n, a, b):
    output = []
    for i in range(n - a + 1, n + 1):
        output.append(str(i))
    
    rest = n - a - b + 1
    if rest < 0:
        print(-1)
        return
    elif rest >= 1:
        if not calcInner(rest, a - 1, b - 1):
            print(-1)
            return
    
    for i in range(n - a, rest, -1):
        output.append(str(i))
    
    print(' '.join(output) + ' ' + str(81))
 
def calcInner(n, a, b):
    first = []
    second = []
    while True:
        if a <= 0 or b <= 0:
            return False
        
        first_i = n - a + 1 if n - a + 1 >= 1 else 1
        first.extend([str(i) for i in range(first_i, n + 1)])
        
        rest = n - a - b + 1
        end_i = rest + 1 if rest + 1 >= 1 else 1
        sub_second = [str(i) for i in range(first_i - 1, end_i, -1)]
        second = sub_second + second
        
        if rest <= 0:
            print(' '.join(first + second))
            return True
        else:
            n = rest
            a -= 1
            b -= 1
 
if __name__ == "__main__":
    main()