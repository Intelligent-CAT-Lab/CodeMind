import java.util.*;
import java.io.*;

class p03018:
    def main(self):
        sc = FastScanner()
        str = sc.next()
        str = str.replace("BC", "X")
        a = 0
        ans = 0
        for i in range(str.length()-1, -1, -1):
            c = str.charAt(i)
            if c=='X':
                a += 1
            elif c=='A':
                ans += a
            else:
                a = 0
        self.p(ans)

    def p(self, element):
        System.out.println(element)

    def pp(self, element):
        System.out.print(element)

    def min(self, a, b, c):
        min = Math.min(a,b)
        min = Math.min(min,c)
        return min

    def max(self, a, b,c):
        max= Math.max(a,b)
        max = Math.max(max,c)
        return max

class FastScanner:
    def __init__(self):
        self.in = System.in
        self.buffer = bytearray(1024)
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
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

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
                return minus and -n or n
            else:
                raise NumberFormatException()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE:
            raise NumberFormatException()
        return int(nl)

    def nextDouble(self):
        return Double.parseDouble(self.next())

p03018().main()