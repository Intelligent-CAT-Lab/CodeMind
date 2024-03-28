class main:
    import sys
    
    class Scanner:
        def __init__(self):
            self.in = sys.stdin
            self.buffer = bytearray(1024)
            self.ptr = 0
            self.buflen = 0
    
        def has_next_byte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buflen = self.in.readinto(self.buffer)
                except IOError:
                    print("Error reading from input stream")
                    return False
                if self.buflen <= 0:
                    return False
                return True
    
        def read_byte(self):
            if self.has_next_byte():
                return self.buffer[self.ptr]
            else:
                return -1
    
        def is_printable_char(self, c):
            return 33 <= c <= 126
    
        def has_next(self):
            while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
                self.ptr += 1
            return self.has_next_byte()
    
        def next(self):
            if not self.has_next():
                raise NoSuchElementException()
            sb = ""
            b = self.read_byte()
            while self.is_printable_char(b):
                sb += chr(b)
                b = self.read_byte()
            return sb
    
        def next_long(self):
            if not self.has_next():
                raise NoSuchElementException()
            n = 0
            minus = False
            b = self.read_byte()
            if b == '-':
                minus = True
                b = self.read_byte()
            if b < '0' or '9' < b:
                raise NumberFormatException()
            while True:
                if '0' <= b and b <= '9':
                    n *= 10
                    n += b - '0'
                elif b == -1 or not self.is_printable_char(b):
                    return -n if minus else n
                else:
                    raise NumberFormatException()
                b = self.read_byte()
    
        def next_int(self):
            nl = self.next_long()
            if nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE:
                raise NumberFormatException()
            return int(nl)
    
        def next_double(self):
            return float(self.next())
    
    
    def tr(*objects):
        print(objects)
    
    
    if __name__ == "__main__":
        sc = Scanner()
        N = sc.next_int()
        if N == 1:
            print(1)
            return
        c = 1
        while 2 * c - 1 <= N:
            c *= 2
        c -= 1
        pw = PrintWriter(sys.stdout)
        pw.println(Long.bit_count(c))
        pw.close()