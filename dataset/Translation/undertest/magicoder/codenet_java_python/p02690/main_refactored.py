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
            if self.st is None or not self.st.hasMoreElements():
                self.st = self.get_reader().readline()
            return self.st.nextToken()
    
        def nextInt(self):
            return int(self.next())
    
    
    def pow(base, n):
        retVal = 1
        while n > 0:
            if n & 1 == 1:
                retVal *= base
            n >>= 1
            base *= base
        return retVal
    
    
    def solve():
        fs = FastScanner()
        x = fs.nextInt()
    
        pow_map = {0: 0, 1: 1}
        before_pow = 1
        base = 2
        while True:
            pow_val = pow(base, 5)
            pow_map[pow_val] = base
            if pow_val - before_pow > x:
                break
            base += 1
            before_pow = pow_val
    
        for pow_val, base in pow_map.items():
            diff = abs(x - pow_val)
            if diff in pow_map:
                print(base, end=' ')
                if pow_val - x < 0:
                    print('-', pow_map[diff])
                else:
                    print(pow_map[diff])
                return
    
    
    if __name__ == '__main__':
        solve()