class main:
    import sys
    import math
    
    class FastScanner:
        def __init__(self, inp=sys.stdin):
            self.inp = inp
            self.buf = None
            self.pos = 0
            self.length = 0
    
        def has_next_byte(self):
            if self.pos < self.length:
                return True
            else:
                self.pos = 0
                self.length = 0
                try:
                    self.buf = self.inp.read()
                except EOFError:
                    return False
                if not self.buf:
                    return False
                self.length = len(self.buf)
                return True
    
        def read_byte(self):
            if self.has_next_byte():
                return self.buf[self.pos]
            return -1
    
        def next(self):
            ret = ""
            while True:
                c = self.read_byte()
                if c in [-1, ' ']:
                    return ret
                ret += chr(c)
    
        def next_int(self):
            return int(self.next())
    
        def next_double(self):
            return float(self.next())
    
    
    def solve(inp, out):
        a = inp.next_double()
        b = inp.next_double()
        out.write(str(4.0/3.0*math.pi*b*b*b))
    
    
    if __name__ == "__main__":
        inp = FastScanner()
        out = sys.stdout
        solve(inp, out)
        out.flush()