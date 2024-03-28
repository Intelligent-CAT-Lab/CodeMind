class main:
    import sys
    
    class p03479:
        def __init__(self, is, out):
            self.is = is
            self.out = out
            self.INPUT = ""
    
        def solve(self):
            x = self.nl()
            y = self.nl()
            ans = 0
            for i in range(x, y+1):
                ans += 1
            self.out.println(ans)
    
        def run(self):
            if self.INPUT == "":
                self.is = sys.stdin
            else:
                self.is = self.INPUT.getBytes()
            self.out = sys.stdout
    
            s = System.currentTimeMillis()
            self.solve()
            self.out.flush()
            if not self.INPUT == "":
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
            return float(self.ns())
    
        def nc(self):
            return self.skip()
    
        def ns(self):
            b = self.skip()
            sb = ""
            while not self.isSpaceChar(b):
                sb += chr(b)
                b = self.readByte()
            return sb
    
        def ns(self, n):
            buf = [0] * n