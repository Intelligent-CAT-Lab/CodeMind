import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class p02743:

    class Solver:
        def __init__(self, sc, writer):
            self.sc = sc
            self.writer = writer

        def run(self):
            a = self.sc.nextLong()
            b = self.sc.nextLong()
            c = self.sc.nextLong()
            d = c - a - b
            if d > 0 and 4 * a * b < d * d:
                self.writer.println("Yes")
            else:
                self.writer.println("No")

    def main(self, args):
        sc = self.FastScanner()
        try (final PrintWriter w = new PrintWriter(System.out)) {
            new Solver(sc, w).run()
            w.flush()
        }

    class FastScanner:
        def __init__(self):
            self.in = System.in
            self.buffer = byte[1024]()
            self.ptr = 0
            self.buflen = 0

        def hasNextByte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buflen = self.in.read(self.buffer)
                except IOException as e:
                    e.printStackTrace()
                if self.buflen <= 0:
                    return False
            return True

        def readByte(self):
            if self.hasNextByte():
                return self.buffer[self.ptr++]
            else:
                return -1

        def isPrintableChar(self, c):
            return 33 <= c and c <= 126

        def hasNext(self):
            while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
                self.ptr += 1
            return self.hasNextByte()

        def next(self):
            if not self.hasNext():
                raise NoSuchElementException()
            sb = StringBuilder()
            b = self.readByte()
            while self.isPrintableChar(b):
                sb.appendCodePoint(b)
                b = self.readByte()
            return sb.toString()

        def nextLong(self):
            if not self.hasNext():
                raise NoSuchElementException()
            n = 0
            minus = False
            b = self.readByte()
            if b == '-':
                minus = True
                b = self.readByte()
            if b < '0' or '9' < b:
                raise NumberFormatException()
            while True:
                if '0' <= b and b <= '9':
                    n *= 10
                    n += b - '0'
                elif b == -1 or not self.isPrintableChar(b):
                    return minus? -n : n
                else:
                    raise NumberFormatException()
                b = self.readByte()

        def nextInt(self):
            nl = self.nextLong()
            if nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE:
                raise NumberFormatException()
            return (int) nl

        def nextDouble(self):
            return Double.parseDouble(self.next())

        def nextIntArray(self, n):
            a = int[n]()
            for i in range(n):
                a[i] = self.nextInt()
            return a

        def nextLongArray(self, n):
            a = long[n]()
            for i in range(n):
                a[i] = self.nextLong()
            return a