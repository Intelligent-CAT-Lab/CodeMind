class main:
    import sys
    
    def is_printable_char(c):
        return 33 <= c <= 126
    
    class FastScanner:
        def __init__(self):
            self.buffer = bytearray()
            self.ptr = 0
    
        def has_next_byte(self):
            if self.ptr < len(self.buffer):
                return True
            else:
                self.ptr = 0
                self.buffer = sys.stdin.buffer.read(1024)
                if not self.buffer:
                    return False
            return True
    
        def read_byte(self):
            if self.has_next_byte():
                byte_val = self.buffer[self.ptr]
                self.ptr += 1
                return byte_val
            else:
                return -1
    
        def has_next(self):
            while self.has_next_byte() and not is_printable_char(self.buffer[self.ptr]):
                self.ptr += 1
            return self.has_next_byte()
    
        def next(self):
            if not self.has_next():
                raise StopIteration
            sb = bytearray()
            b = self.read_byte()
            while is_printable_char(b):
                sb.extend([b])
                b = self.read_byte()
            return sb.decode()
    
        def next_int(self):
            return int(self.next())
    
    MOD = 1000000007
    
    def main():
        fs = FastScanner()
        n = fs.next_int()
        k = fs.next_int()
        ans = 0
        for i in range(k, n + 2):
            f = i * (i - 1) // 2
            l = (n * 2 - i + 1) * i // 2
            add = l - f + 1
            ans = (ans + add) % MOD
        print(ans)
    
    if __name__ == "__main__":
        main()