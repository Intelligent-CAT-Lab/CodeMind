import math
import sys

class Methods:

    def print(self, *ar):
        print(ar)

    def max(self, *ar):
        ar = list(ar)
        ar.sort()
        return ar[-1]

    def min(self, *ar):
        ar = list(ar)
        ar.sort()
        return ar[0]

    def gcd(self, a, b):
        return b if a%b == 0 else self.gcd(b, a%b)

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b

    def factorial(self, i):
        if i == 1:
            return 1
        return i * self.factorial(i-1)

    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)

    def euclid(self, x1, y1, x2, y2):
        return math.sqrt((x2 - x1)**2 + (y2 - y1)**2)

    def isPrime(self, n):
        if n == 2:
            return True
        if n < 2 or n % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(n))+1, 2):
            if n % i == 0:
                return False
        return True

class FastScanner:

    def __init__(self, stream):
        self.in_stream = stream
        self.buffer = bytearray()
        self.length = 0
        self.p = 0

    def hasNextByte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.buffer = self.in_stream.read(1024)
                self.length = len(self.buffer)
            except Exception as e:
                print(e)
            if self.length <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            b = self.buffer[self.p]
            self.p += 1
            return b
        return -1

    def isPrintable(self, n):
        return 33 <= n <= 126

    def skip(self):
        while self.hasNextByte() and not self.isPrintable(self.buffer[self.p]):
            self.p += 1

    def hasNext(self):
        self.skip()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise StopIteration
        sb = bytearray()
        t = self.readByte()
        while self.isPrintable(t):
            sb.append(t)
            t = self.readByte()
        return sb.decode('utf-8')

    def nextArray(self, n):
        return [self.next() for _ in range(n)]

    def nextInt(self):
        return int(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLong(self):
        if not self.hasNext():
            raise StopIteration
        minus = False
        temp = self.readByte()
        if temp == 45:
            minus = True
            temp = self.readByte()
        if temp < 48 or 57 < temp:
            raise ValueError("Number Format Exception")
        n = 0
        while self.isPrintable(temp):
            if 48 <= temp <= 57:
                n *= 10
                n += temp - 48
            else:
                raise ValueError("Number Format Exception")
            temp = self.readByte()
        return -n if minus else n

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

    def nextDouble(self):
        return float(self.next())

    def nextDoubleArray(self, n):
        return [self.nextDouble() for _ in range(n)]

    def close(self):
        self.in_stream.close()

def solve(instream, outstream, ms):
    a, b = instream.nextDouble(), instream.nextDouble()
    outstream.write(str(4/3*math.pi*b*b*b) + "\n")
    outstream.flush()

if __name__ == "__main__":
    instream = FastScanner(sys.stdin.buffer)
    outstream = sys.stdout
    ms = Methods()
    solve(instream, outstream, ms)
    instream.close()
    outstream.close()