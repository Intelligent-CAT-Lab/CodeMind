import java.util.*;
import java.io.*;

class p02430:
    def solve(self, in, out, ms):
        n = in.nextInt()
        k = in.nextInt()

        for bit in range(1 << n):
            if Integer.bitCount(bit) != k:
                continue
            out.print(bit + ":")
            for j in range(n):
                if (bit >> j) & 1 == 1:
                    out.print(" " + j)
            out.println()


class FastScanner:
    def __init__(self, stream):
        self.in = stream
        self.buffer = bytearray(1024)
        self.length = 0
        self.p = 0

    def hasNextByte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.in.read(self.buffer)
            except Exception as e:
                e.printStackTrace()
            if self.length <= 0:
                return False

    def readByte(self):
        if self.hasNextByte() == True:
            return self.buffer[self.p++]
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
            raise NoSuchElementException()
        sb = StringBuilder()
        t = self.readByte()
        while self.isPrintable(t):
            sb.appendCodePoint(t)
            t = self.readByte()
        return sb.toString()

    def nextArray(self, n):
        ar = [None] * n
        for i in range(n):
            ar[i] = self.next()
        return ar

    def nextInt(self):
        return Math.toIntExact(self.nextLong())

    def nextIntArray(self, n):
        ar = [None] * n
        for i