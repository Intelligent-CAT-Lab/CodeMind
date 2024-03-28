class main:
    import sys
    
    class Scanner:
        def __init__(self):
            self.input_buffer = [self.is_printable_char(x) for x in sys.stdin.buffer.read()]
            self.ptr = 0
    
        def has_next_byte(self):
            return self.ptr < len(self.input_buffer)
    
        def read_byte(self):
            if self.has_next_byte():
                self.ptr += 1
                return self.input_buffer[self.ptr - 1]
            else:
                return -1
    
        def is_printable_char(self, c):
            return 33 <= c <= 126
    
        def has_next(self):
            while self.has_next_byte() and not self.is_printable_char(self.input_buffer[self.ptr]):
                self.ptr += 1
            return self.has_next_byte()
    
        def next(self):
            if not self.has_next():
                raise StopIteration
            sb = []
            while True:
                b = self.read_byte()
                if self.is_printable_char(b):
                    sb.append(b)
                else:
                    break
            return "".join(map(chr, sb))
    
    
    def main():
        sc = Scanner()
        N = int(sc.next())
        if N == 1:
            print(1)
            return
        c = 1
        while 2 * c - 1 <= N:
            c *= 2
        c -= 1
        print(bin(c).count('1'))
    
    if __name__ == "__main__":
        main()