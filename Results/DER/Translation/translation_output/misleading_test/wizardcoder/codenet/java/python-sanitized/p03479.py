import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.math.BigDecimal
import java.math.BigInteger
import java.util.ArrayDeque
import java.util.ArrayList
import java.util.Arrays
import java.util.Collections
import java.util.HashSet
import java.util.InputMismatchException
import java.util.Stack
import java.util.TreeMap
import java.util.TreeSet

class p03479:
    def __init__(self):
        self.is = None
        self.out = None
        self.INPUT = ""

    def solve(self):
        x = self.nl()
        y = self.nl()
        ans = 0
        for i in range(x, y+1):
            if i & (i-1) == 0:
                ans += 1
        self.out.println(ans)

    def run(self):
        self.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        self.out = PrintWriter(System.out)

        s = System.currentTimeMillis()
        self.solve()
        self.out.flush()
        if not INPUT.isEmpty():
            tr(System.currentTimeMillis()-s+"ms")

    def readByte(self):
        if self.lenbuf == -1:
            raise InputMismatchException()
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.is.read(self.inbuf)
            except IOException as e:
                raise InputMismatchException()
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf]

    def isSpaceChar(self, c):
        return not (c >= 33 and c <= 126)

    def skip(self):
        b = self.readByte()
        while b!= -1 and self.isSpaceChar(b):
            b = self.readByte()
        return b

    def nd(self):
        return Double.parseDouble(self.ns())

    def nc(self):
        return chr(self.skip())

    def ns(self):
        b = self.skip()
        sb = StringBuilder()
        while not self.isSpaceChar(b):
            sb.appendCodePoint(b)
            b = self.readByte()
        return sb.toString()

    def ns(self, n):
        buf = [0] * n
        b = self.skip()
        p = 0
        while p < n and not self.isSpaceChar(b):
            buf[p] = b
            p += 1
            b = self.readByte()
        return p == n and buf or Arrays.copyOf(buf, p)

    def nm(self, n, m):
        map = [0] * n
        for i in range(n):
            map[i] = self.ns(m)
        return map

    def na(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.ni()
        return a

    def ni(self):
        num = 0
        b = self.readByte()
        minus = False
        while b!= -1 and not ((b >= '0' and b <= '9') or b == '-'):
            b = self.