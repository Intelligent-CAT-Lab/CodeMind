class main:
    import sys
    
    class FastScanner:
        def __init__(self):
            self.buffer = ''
        
        def next(self):
            self.skip_unprintable()
            res = ''
            while self.has_next():
                c = self.read_byte()
                if self.is_printable_char(c):
                    res += chr(c)
                else:
                    break
            return res
    
        def next_int(self):
            return int(self.next())
        
        def next_long(self):
            return int(self.next())
    
        def read_byte(self):
            if self.buffer:
                res = ord(self.buffer[0])
                self.buffer = self.buffer[1:]
                return res
            return sys.stdin.buffer.raw.read(1)[0] if not self.buffer else ord(self.buffer[0])
        
        def has_next(self):
            self.skip_unprintable()
            return bool(self.buffer) or self.read_byte() != -1
    
        def skip_unprintable(self):
            while self.has_next() and not self.is_printable_char(self.read_byte()):
                pass
    
        @staticmethod
        def is_printable_char(c):
            return 33 <= c <= 126
    
        def next_double(self):
            return float(self.next())
    
    def main():
        sc = FastScanner()
        K = sc.next_long()
        A = K // 50
        B = K % 50
    
        a = [0] * 50
        for i in range(50):
            a[i] = i + A
    
        for i in range(49, 49-B, -1):
            a[i] += 1
    
        print(50)
        for i in range(50):
            print(a[i], end=' ')
        print()
    
    if __name__ == "__main__":
        main()