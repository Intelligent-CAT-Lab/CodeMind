import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

class p03479:
    def __init__(self):
        self.is = None
        self.out = None
        self.INPUT = ""

    def solve(self):
        x = self.nl()
        y = self.nl()
        ans = 0
        for i in range(x, y + 1):
            ans += 1
        self.out.println(ans)

    def run(self):
        self.is = self.INPUT.isEmpty() and System.in or ByteArrayInputStream(self.INPUT.getBytes())
        self.out = PrintWriter(System.out)

        s = System.currentTimeMillis()
        self.solve()
        self.out.flush()
        if not self.INPUT.isEmpty():
            tr(System.currentTimeMillis() - s + "ms")

    def readByte(self):
        if self.lenbuf == -1:
            raise InputMismatchException()
        if self.ptrbuf >= self.lenbuf:
            self.ptrbuf = 0
            try:
                self.lenbuf = self.is.read(self.inbuf)
            except IOException:
                raise InputMismatchException()
            if self.lenbuf <= 0:
                return -1
        return self.inbuf[self.ptrbuf++]

    def isSpaceChar(self, c):
        return not (c >= 33 and c <= 126)

    def skip(self):
        b = self.readByte()
        while not (self.isSpaceChar(b) and b != " "):
            b = self.readByte()
        return b

    def nd(self):
        return Double.parseDouble(self.ns())

    def nc(