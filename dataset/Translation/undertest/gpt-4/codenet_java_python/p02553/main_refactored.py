class main:
    import sys
    
    class FastScanner:
        def __init__(self, stream):
            self.stream = stream
            self.buffer = ""
            self.ptr = 0
    
        def read(self):
            while True:
                data = self.stream.read(1024)
                if not data:
                    return None
                self.buffer += data
                if len(self.buffer) > 0:
                    return self.buffer
    
        def next(self):
            self.skip_whitespace()
            start = self.ptr
            while self.ptr < len(self.buffer) and self.buffer[self.ptr] not in (' ', '\n', '\t', '\r'):
                self.ptr += 1
            word = self.buffer[start:self.ptr]
            return word
    
        def next_int(self):
            return int(self.next())
    
        def next_long(self):
            return int(self.next())
    
        def skip_whitespace(self):
            while self.ptr < len(self.buffer) and self.buffer[self.ptr] in (' ', '\n', '\t', '\r'):
                self.ptr += 1
    
    def solve_abc178_b():
        sc = FastScanner(sys.stdin)
        a = sc.next_long()
        b = sc.next_long()
        c = sc.next_long()
        d = sc.next_long()
        ans = max(a * c, a * d, b * c, b * d)
        print(ans)
    
    # Reading from input and calling the main function
    if __name__ == "__main__":
        solve_abc178_b()