class main:
    import sys
    
    def p(x):
        print(x)
    
    def pp(x):
        print(x, end=' ')
    
    def min(x, y, z):
        return min(min(x, y), z)
    
    def max(x, y, z):
        return max(max(x, y), z)
    
    def fast_scan():
        inp = sys.stdin
        buffer = bytearray(1024)
        ptr, buflen = 0, 0
    
        def has_next_byte():
            if ptr < buflen:
                return True
            else:
                ptr = 0
                try:
                    buflen = inp.read(buffer)
                except:
                    return False
                if buflen <= 0:
                    return False
            return True
    
        def read_byte():
            if has_next_byte():
                return buffer[ptr]
            else:
                return -1
    
        def is_printable_char(c):
            return 33 <= c and c <= 126
    
        def has_next():
            while has_next_byte() and not is_printable_char(buffer[ptr]):
                ptr += 1
            return has_next_byte()
    
        def next():
            if not has_next():
                raise NoSuchElementException()
            sb = StringBuilder()
            b = read_byte()
            while is_printable_char(b):
                sb.append(chr(b))
                b = read_byte()
            return sb.str()
    
        def next_long():
            if not has_next():
                raise NoSuchElementException()
            minus = False
            b = read_byte()
            if b == '-':
                minus = True
                b = read_byte()
            if not (b >= '0' and b <= '9'):
                raise NumberFormatException()
            n = 0
            while True:
                if (b >= '0' and b <= '9'):
                    n *= 10
                    n += b - '0'
                elif b == -1 or not is_printable_char(b):
                    return minus * n if minus else n
                else:
                    raise NumberFormatException()
                b = read_byte()
    
        def next_int():
            return next_long() // (1 << 63)
    
        def next_double():
            return float(next())
    
    if __name__ == '__main__':
        str = input()
        str = str.replace("BC", "X")
        a = 0
        ans = 0
        for i in range(len(str)-1, -1, -1):
            c = str[i]
            if c == 'X':
                a += 1
            elif c == 'A':
                ans += a
            else:
                a = 0
        p(ans)