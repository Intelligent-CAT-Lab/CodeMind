import sys

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin.buffer
        self.buffer = bytearray()
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.input_stream.readinto(self.buffer)
            except IOError as e:
                print(e)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            result = self.buffer[self.ptr]
            self.ptr += 1
            return result
        else:
            return -1

    @staticmethod
    def isPrintableChar(c):
        return 33 <= c <= 126

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
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
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())


def main():
    sc = FastScanner()
    K = sc.nextLong()
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]

    for i in range(49, 49 - B, -1):
        a[i] += 1

    print(50)
    for i in range(50):
        print(a[i], end="")
        if i != 49:
            print(" ", end="")
    print()

if __name__ == "__main__":
    main()