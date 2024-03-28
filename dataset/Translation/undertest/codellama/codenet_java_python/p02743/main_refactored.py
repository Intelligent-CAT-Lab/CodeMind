class main:
    import sys
    
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
    
    class FastScanner:
        def __init__(self):
            self.in = sys.stdin
            self.buffer = bytearray(1024)
            self.ptr = 0
            self.buflen = 0
    
        def hasNextByte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buflen = self.in.readinto(self.buffer)
                except IOError:
                    pass
                if self.buflen <= 0:
                    return False
    
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
            sb = []
            b = self.readByte()
            while self.isPrintableChar(b):
                sb.append(chr(b))
                b = self.readByte()
            return "".join(sb)
    
        def nextLong(self):
            if not self.hasNext():
                raise NoSuchElementException()
            n = 0
            minus = False
            b = self.readByte()
            if b == "-":
                minus = True
                b = self.readByte()
            if b < "0" or "9" < b:
                raise NumberFormatException()
            while True:
                if "0" <= b <= "9":
                    n *= 10
                    n += b - "0"
                elif b == -1 or not self.isPrintableChar(b):
                    return -n if minus else n
                else:
                    raise NumberFormatException()
    
        def nextInt(self):
            nl = self.nextLong()
            if nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE:
                raise NumberFormatException()
            return int(nl)
    
        def nextDouble(self):
            return float(self.next())
    
        def nextIntArray(self, n):
            a = [0] * n
            for i in range(n):
                a[i] = self.nextInt()
            return a
    
        def nextLongArray(self, n):
            a = [0] * n
            for i in range(n):
                a[i] = self.nextLong()
            return a
    
    if __name__ == "__main__":
        sc = FastScanner()
        writer = PrintWriter(sys.stdout)
        solver = Solver(sc, writer)
        solver.run()
        writer.flush()