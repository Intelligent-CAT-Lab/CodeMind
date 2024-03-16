import sys

class Reader:
    def __init__(self):
        self.buf = []
        self.ptr = 0
        self.buflen = 0
        self.in = sys.stdin

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        self.ptr = 0
        try:
            self.buf = self.in.read(1024)
            self.buflen = len(self.buf)
        except:
            return False
        if self.buflen <= 0:
            return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buf[self.ptr]
        return -1

    def isPrintableChar(self, c):
        return 33 <= c and c <= 126

    def skip(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buf[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skip()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise Exception("no next")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise Exception("no next")
        minus = False
        num = self.readByte()
        if num == '-':
            num = 0
            minus = True
        elif num < '0' or '9' < num:
            raise Exception("not a number")
        else:
            num -= '0'
        while True:
            b = self.readByte()
            if '0' <= b and b <= '9':
                num = num * 10 + (b - '0')
            elif b == -1 or not self.isPrintableChar(b):
                return minus? -num : num
            else:
                raise Exception("not a number")

    def nextInt(self):
        num = self.nextLong()
        if num < -2147483648 or 2147483647 < num:
            raise Exception("out of range")
        return num

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        if not self.hasNext():
            raise Exception("no next")
        return chr(self.readByte())

    def nextLine(self):
        while self.hasNextByte() and (self.buf[self.ptr] == '\n' or self.buf[self.ptr] == '\r'):
            self.ptr += 1
        if not self.hasNextByte():
            raise Exception("no next")
        sb = []
        b = self.readByte()
        while b!= '\n' and b!= '\r':
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextIntArray(self, n):
        res = []
        for i in range(n):
            res.append(self.nextInt())
        return res

    def nextCharArray(self, n):
        res = []
        for i in range(n):
            res.append(self.nextChar())
        return res

    def close(self):
        try:
            self.in.close()
        except:
            pass

def main():
    reader = Reader()
    a = reader.nextInt()
    b = reader.nextInt()
    c = reader.nextInt()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d and (60 * i + c) % d <= a:
            e = i
            break
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)
    reader.close()

if __name__ == '__main__':
    main()