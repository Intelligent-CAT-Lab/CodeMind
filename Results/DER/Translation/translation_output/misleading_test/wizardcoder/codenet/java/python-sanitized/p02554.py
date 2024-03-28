import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.*

class p02554:
    is = None
    out = None
    INPUT = ""

    def solve():
        n = int(input())
        mod = 1000000007
        total = pow(10, n, mod) % mod
        partial = 2 * pow(9, n, mod) % mod
        both = pow(8, n, mod) % mod
        ans = (total - partial + both) % mod
        ans = (ans + mod) % mod
        print(ans)

    def modpow(self, a, n, mod):
        res = 1
        while n > 0:
            if n & 1 == 1:
                res = (res * a) % mod
            a = (a * a) % mod
            n >>= 1
        return res

    def main(self):
        S = System.currentTimeMillis()
        self.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        self.out = PrintWriter(System.out)

        self.solve()
        self.out.flush()
        G = System.currentTimeMillis()
        self.tr(G-S+"ms")

    def eof(self):
        if self.lenbuf == -1:
            return True
        lptr = self.ptrbuf
        while lptr < self.lenbuf:
            if not self.isSpaceChar(self.inbuf[lptr]):
                return False
            lptr += 1

        try:
            self.is.mark(1000)
            while True:
                b = self.is.read()
                if b == -1:
                    self.is.reset()
                    return True
                elif not self.isSpaceChar(b):
                    self.is.reset()
                    return False
        except IOException as e:
            return True

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
        return p ==