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
        def __init__(self, inp=sys.stdin):
            self.inp = inp
    
        def next(self):
            return self.inp.readline().rstrip()
    
        def nextLong(self):
            return long(self.next())
    
        def nextInt(self):
            return int(self.next())
    
        def nextDouble(self):
            return float(self.next())
    
        def nextIntArray(self, n):
            return [self.nextInt() for _ in range(n)]
    
        def nextLongArray(self, n):
            return [self.nextLong() for _ in range(n)]
    
    
    if __name__ == "__main__":
        sc = FastScanner()
        writer = sys.stdout
        Solver(sc, writer).run()
        writer.flush()