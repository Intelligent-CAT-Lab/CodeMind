import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintWriter
import java.util.*

class p03815:
    is = None
    out = None
    INPUT = ""

    def solve():
        x = p03815.nl()
        answer = x // 11 * 2
        mod = x % 11
        step = x // 11
        if mod > 0:
            if mod <= 6 - step % 2:
                answer += 1
            else:
                answer += 2
        p03815.out.println(answer)

    def main(args):
        S = System.currentTimeMillis()
        if INPUT == "":
            is = System.in
        else:
            is = ByteArrayInputStream(INPUT.getBytes())
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
        except IOException:
            return True

    def readByte():
        if lenbuf == -1:
            raise InputMismatchException()
        if ptrbuf >= lenbuf:
            ptrbuf = 0
            try:
                lenbuf = is.read(inbuf)
            except IOException:
                raise InputMismatchException()
            if lenbuf <= 0:
                return -1
        return inbuf[ptrbuf]

    def isSpaceChar(c):
        return not (c >= 33 and c <= 126)

    def skip():
        b = readByte()
        while b!= -1 and isSpaceChar(b):
            b = readByte