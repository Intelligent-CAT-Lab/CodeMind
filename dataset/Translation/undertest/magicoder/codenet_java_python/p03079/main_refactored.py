class main:
    class FastScanner:
        def __init__(self):
            self.st = None
            self.reader = self.get_reader()
    
        def get_reader(self):
            import sys
            import io
            return io.StringIO(sys.stdin.read())
    
        def next(self):
            import sys
            if self.st is None or not self.st.strip():
                self.st = self.reader.readline()
            return self.st
    
        def next_int(self):
            return int(self.next())
    
        def next_int_arr(self, n):
            return [self.next_int() for _ in range(n)]
    
    
    def solve():
        fs = FastScanner()
        a, b, c = fs.next_int_arr(3)
        if a == b == c:
            print("Yes")
        else:
            print("No")
    
    
    if __name__ == "__main__":
        solve()