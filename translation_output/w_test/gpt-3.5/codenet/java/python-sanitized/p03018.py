import sys
import io

class FastScanner:
    def __init__(self, input_str):
        self.input_str = input_str
        self.ptr = 0

    def hasNextByte(self):
        return self.ptr < len(self.input_str)

    def readByte(self):
        if self.hasNextByte():
            byte_val = ord(self.input_str[self.ptr])
            self.ptr += 1
            return byte_val
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(ord(self.input_str[self.ptr])):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = []
        byte_val = self.readByte()
        while self.isPrintableChar(byte_val):
            sb.append(chr(byte_val))
            byte_val = self.readByte()
        return ''.join(sb)

    def nextLong(self):
        n = 0
        minus = False
        b = self.readByte()
        if b == 45:
            minus = True
            b = self.readByte()
        if b < 48 or b > 57:
            raise ValueError
        while True:
            if 48 <= b <= 57:
                n *= 10
                n += b - 48
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return int(nl)

    def nextDouble(self):
        return float(self.next())

def main():
    input_str = input()  # reading input from console
    sc = FastScanner(input_str)
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
    print(ans)

if __name__ == "__main__":
    main()