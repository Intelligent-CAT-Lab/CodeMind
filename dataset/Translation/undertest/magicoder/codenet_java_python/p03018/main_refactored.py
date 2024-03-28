class main:
    class FastScanner:
        def __init__(self):
            self.buffer = bytearray(1024)
            self.ptr = 0
            self.buflen = 0
            self.has_next = self.update()
    
        def has_next_byte(self):
            if self.ptr < self.buflen:
                return True
            else:
                self.ptr = 0
                try:
                    self.buflen = self.buffer.read_from_socket(self.buffer)
                except EOFError:
                    self.buflen = 0
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
                raise StopIteration
            s = []
            b = self.read_byte()
            while self.is_printable_char(b):
                s.append(chr(b))
                b = self.read_byte()
            return "".join(s)
    
        def next_long(self):
            if not self.has_next():
                raise StopIteration
            n = 0
            minus = False
            b = self.read_byte()
            if b == '-'.encode()[0]:
                minus = True
                b = self.read_byte()
            if b < '0'.encode()[0] or '9'.encode()[0] < b:
                raise NumberFormatException()
            while True:
                if '0'.encode()[0] <= b and b <= '9'.encode()[0]:
                    n *= 10
                    n += b - '0'.encode()[0]
                elif b == -1 or not self.is_printable_char(b):
                    return -n if minus else n
                else:
                    raise NumberFormatException()
                b = self.read_byte()
    
        def next_int(self):
            nl = self.next_long()
            if nl < -2147483648 or nl > 2147483647:
                raise NumberFormatException()
            return int(nl)
    
        def next_double(self):
            return float(self.next())
    
    
    def p(element):
        print(element)
    
    
    def pp(element):
        print(element, end='')
    
    
    def min(a, b, c):
        min_val = a
        if b < min_val:
            min_val = b
        if c < min_val:
            min_val = c
        return min_val
    
    
    def max(a, b, c):
        max_val = a
        if b > max_val:
            max_val = b
        if c > max_val:
            max_val = c
        return max_val
    
    
    def main():
        sc = FastScanner()
        str = sc.next()
        str = str.replace("BC", "X")
        a = 0
        ans = 0
        for i in range(len(str) - 1, -1, -1):
            c = str[i]
            if c == 'X':
                a += 1
            elif c == 'A':
                ans += a
            else:
                a = 0
        p(ans)
    
    
    if __name__ == "__main__":
        main()