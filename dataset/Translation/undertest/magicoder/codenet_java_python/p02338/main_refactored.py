class main:
    import sys
    
    class FastScanner:
        def __init__(self, input_stream=sys.stdin):
            self.input_stream = input_stream
            self.buffer = bytearray(1024)
            self.ptr = 0
            self.buflen = 0
    
        def has_next_byte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buflen = self.input_stream.readinto(self.buffer)
                except EOFError:
                    self.buflen = 0
                return self.buflen > 0
    
        def read_byte(self):
            if self.has_next_byte():
                return self.buffer[self.ptr]
            else:
                return -1
    
        def has_next(self):
            while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
                self.ptr += 1
            return self.has_next_byte()
    
        def next(self):
            if not self.has_next():
                raise StopIteration
            s = []
            b = self.read_byte()
            while self.is_printable_char(b):
                s.append(chr(b))
                b = self.read_byte()
            return "".join(s)
    
        def next_int(self):
            return int(self.next())
    
        def is_printable_char(self, b):
            return 33 <= b <= 126
    
    
    def main():
        sc = FastScanner()
        n = sc.next_int()
        k = sc.next_int()
    
        if n <= k:
            print(1)
        else:
            print(0)
    
    
    if __name__ == "__main__":
        main()