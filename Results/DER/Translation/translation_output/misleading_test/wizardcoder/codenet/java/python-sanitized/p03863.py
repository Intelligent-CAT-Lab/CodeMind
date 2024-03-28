import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.*

class p03863:
    is = None
    out = None
    INPUT = ""

    def solve():
        s = ns()
        l = len(s)

        if (l % 2 == 0) ^ (s[0] == s[l - 1]):
            out.println("Second")
        else:
            out.println("First")

    def main(args):
        S = System.currentTimeMillis()
        is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
        out = PrintWriter(System.out)

        solve()
        out.flush()
        G = System.currentTimeMillis()
        tr(G-S+"ms")

    def eof():
        if lenbuf == -1:
            return True
        lptr = ptrbuf
        while lptr < lenbuf:
            if not isSpaceChar(inbuf[lptr]):
                return False
            lptr += 1

        try:
            is.mark(1000)
            while True:
                b = is.read()
                if b == -1:
                    is.reset()
                    return True
                elif not isSpaceChar(b):
                    is.reset()
                    return False
        except IOException as e:
            return True

    def readByte():
        if lenbuf == -1:
            raise InputMismatchException()
        if ptrbuf >= lenbuf:
            ptrbuf = 0
            try:
                lenbuf = is.read(inbuf)
            except IOException as e:
                raise InputMismatchException()
            if lenbuf <= 0:
                return -1
        return inbuf[ptrbuf]

    def isSpaceChar(c):
        return not (c >= 33 and c <= 126)

    def skip():
        b = readByte()
        while b!= -1 and isSpaceChar(b):
            b = readByte()
        return b

    def nd():
        return float(ns())

    def nc():
        return chr(skip())

    def ns():
        b = skip()
        sb = ""
        while not isSpaceChar(b):
            sb += chr(b)
            b = readByte()
        return sb

    def ns(n):
        buf = [0] * n
        b = skip()
        p = 0
        while p < n and not isSpaceChar(b):
            buf[p] = b
            p += 1
            b = readByte()
        return n == p and buf or buf[:p]

    def nm(n, m):
        map = [ns(m) for i in range(n)]
        return map

    def na(n):
        a = [0] * n
        for i in range(n):
            a[i] = ni()
        return a

    def ni():
        num = 0
        b = readByte()
        minus = False
        while b!= -1 and not ((b >= '0' and b <= '9') or b == '-'):
            b = readByte()
        if b == '-':
            minus = True
            b = readByte()
        while b!= -1 and b >= '0' and b <= '9':
            num = num * 10 + (b - '0')
            b = readByte()
        return minus and -num or num

    def nl():
        num = 0
        b = readByte()
        minus = False
        while b!= -1 and not ((b >= '0' and b <= '9') or b == '-'):
            b = readByte()
        if b == '-':
            minus = True
            b = readByte()
        while b!= -1 and b >= '0' and b <= '9':
            num = num * 10 + (b - '0')
            b = readByte()
        return minus and -num or num

    def tr(*o):
        if INPUT: