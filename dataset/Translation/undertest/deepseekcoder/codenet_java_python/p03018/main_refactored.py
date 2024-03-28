class main:
    class FastScanner:
        def __init__(self, inp=None):
            if inp is None:
                inp = sys.stdin
            self.inp = inp
            self.buf = []
            self.eof = False
    
        def next(self):
            if len(self.buf) == 0:
                if self.eof:
                    raise Exception("No more tokens")
                self.buf = list(map(str, self.inp.readline().split()))
            return self.buf.pop(0)
    
        def has_next(self):
            if len(self.buf) == 0:
                if self.eof:
                    return False
                self.buf = list(map(str, self.inp.readline().split()))
            return len(self.buf) > 0
    
        def next_int(self):
            return int(self.next())
    
        def next_long(self):
            return long(self.next())
    
        def next_double(self):
            return float(self.next())
    
        def next_line(self):
            return self.inp.readline().rstrip('\n')
    
    def p(element):
        sys.stdout.write(str(element) + "\n")
    
    def pp(element):
        sys.stdout.write(str(element))
    
    def min(a, b, c):
        return min(a, min(b, c))
    
    def max(a, b, c):
        return max(a, max(b, c))
    
    def solve():
        sc = FastScanner()
        str = sc.next_line()
        str = str.replace("BC", "X")
        a = 0
        ans = 0
        for i in range(len(str)-1, -1, -1):
            c = str[i]
            if c=='X':
                a += 1
            elif c=='A':
                ans += a
            else:
                a = 0
        p(ans)
    
    solve()