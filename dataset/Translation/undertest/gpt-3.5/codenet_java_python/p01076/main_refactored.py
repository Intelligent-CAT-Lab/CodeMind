class main:
    import sys
    
    class FastScanner:
        def __init__(self):
            self.input_stream = sys.stdin
            self.buffer = ""
            self.buffer_ptr = 0
    
        def is_printable_char(self, c):
            return 33 <= c <= 126
    
        def skip_unprintable(self):
            while self.has_next_byte() and not self.is_printable_char(ord(self.buffer[self.buffer_ptr])):
                self.buffer_ptr += 1
    
        def has_next_byte(self):
            if self.buffer_ptr < len(self.buffer):
                return True
            else:
                self.buffer_ptr = 0
                self.buffer = self.input_stream.readline()
                if not self.buffer:
                    return False
            return True
    
        def read_byte(self):
            if self.has_next_byte():
                byte = self.buffer[self.buffer_ptr]
                self.buffer_ptr += 1
                return byte
            else:
                return -1
    
        def has_next(self):
            self.skip_unprintable()
            return self.has_next_byte()
    
        def next(self):
            if not self.has_next():
                raise StopIteration
            result = ""
            while self.has_next_byte() and self.is_printable_char(ord(self.buffer[self.buffer_ptr])):
                result += self.buffer[self.buffer_ptr]
                self.buffer_ptr += 1
            return result
    
        def next_int(self):
            return int(self.next())
    
        def next_long(self):
            return int(self.next())
    
    def solve():
        scanner = FastScanner()
        N = scanner.next_long()
        d = scanner.next_long()
    
        if d == 1:
            print(N * (N - 1) // 2)
        elif d == 2:
            print(N * (N - 1) // 2 - 1)
        else:
            m = N - d
            ans = m * (m - 1) // 2 + 2 * m + (d - 2)
            print(ans)
    
    if __name__ == "__main__":
        solve()