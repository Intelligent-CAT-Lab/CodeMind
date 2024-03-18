```python
import sys

class FastScanner:
    def __init__(self):
        self.input_data = sys.stdin.buffer.raw.read()
        self.ptr = 0
        self.buflen = len(self.input_data)
    
    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.input_data = sys.stdin.buffer.raw.read()
            self.buflen = len(self.input_data)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            byte = self.input_data[self.ptr]
            self.ptr += 1
            return byte
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.input_data[self.ptr]):
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
        if not self.hasNext():
            raise StopIteration()
        n = 0
        minus = False
        b = self.readByte()
        if b == b'-':
            minus = True
            b = self.readByte()
        if b < ord(b'0') or b > ord(b'9'):
            raise ValueError("Invalid long value")
        while True:
            if ord(b'0') <= b <= ord(b'9'):
                n *= 10
                n += b - ord(b'0')
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError("Invalid long value")
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError("Invalid int value")
        return int(nl)

    def nextDouble(self):
        return float(self.next())

def p(element):
    print(element)

def min_val(a, b, c):
    return min(a, b, c)

def max_val(a, b, c):
    return max(a, b, c)

if __name__ == "__main__":
    sc = FastScanner()
    input_str = sc.next()
    input_str = input_str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(input_str)-1, -1, -1):
        c = input_str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)
```
```
