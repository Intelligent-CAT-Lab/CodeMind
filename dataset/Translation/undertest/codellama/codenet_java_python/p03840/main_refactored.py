class main:
    import sys
    
    class In:
        def __init__(self):
            self.reader = sys.stdin
            self.tokenizer = None
    
        def next(self):
            try:
                while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                    self.tokenizer = self.reader.readline()
            except IOError:
                pass
            return self.tokenizer.nextToken()
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return long(self.next())
    
        def nextCharArray(self, n, m):
            a = []
            for i in range(n):
                a.append(self.next().toCharArray())
            return a
    
        def nextIntArray(self, n):
            a = []
            for i in range(n):
                a.append(self.nextInt())
            return a
    
        def nextIntArray(self, n, op):
            a = []
            for i in range(n):
                a.append(op.applyAsInt(self.nextInt()))
            return a
    
        def nextLongArray(self, n):
            a = []
            for i in range(n):
                a.append(self.nextLong())
            return a
    
        def nextLongArray(self, n, op):
            a = []
            for i in range(n):
                a.append(op.applyAsLong(self.nextLong()))
            return a
    
    class Out:
        def __init__(self):
            self.out = sys.stdout
            self.autoFlush = False
    
        def println(self, *a):
            joiner = " ".join(a)
            self.out.println(joiner)
            if self.autoFlush:
                self.out.flush()
    
        def println(self, a):
            joiner = " ".join(a)
            self.out.println(joiner)
            if self.autoFlush:
                self.out.flush()
    
        def println(self, a):
            joiner = " ".join(a)
            self.out.println(joiner)
            if self.autoFlush:
                self.out.flush()
    
        def flush(self):
            self.out.flush()
    
    in = In()
    out = Out()
    mod = 1000000007
    iinf = 0xfffffff
    inf = 0xfffffffffffffffL
    
    def solve():
        ai = in.nextInt()
        ao = in.nextInt()
        at = in.nextInt()
        aj = in.nextInt()
        al = in.nextInt()
        as = in.nextInt()
        az = in.nextInt()
        ans = 0
        ans += ao