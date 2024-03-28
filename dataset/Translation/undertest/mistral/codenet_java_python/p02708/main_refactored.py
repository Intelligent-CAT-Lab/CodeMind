class main:
    import sys
    
    def fast_scanner():
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
                except Exception as e:
                    print(e)
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
                raise ValueError()
            sb = StringBuilder()
            b = read_byte()
            while is_printable_char(b):
                sb.append(chr(b))
                b = read_byte()
            return sb.str()
    
        def next_long():
            if not has_next():
                raise ValueError()
            n = 0
            minus = False
            b = read_byte()
            if b == '-':
                minus = True
                b = read_byte()
            if not (b >= '0' and b <= '9'):
                raise ValueError()
            while True:
                if (b >= '0' and b <= '9'):
                    n *= 10
                    n += b - '0'
                elif b == -1 or not is_printable_char(b):
                    return minus * n if minus else n
                else:
                    raise ValueError()
                b = read_byte()
    
        def next_int():
            return int(next_long())
    
        def next_double():
            return float(next())
    
    
    if __name__ == '__main__':
        n = int(input())
        k = int(input())
        ans = 0
        for i in range(k, n + 1):
            f = i * (i - 1) // 2
            l = (n * 2 - i + 1) * i // 2
            add = l - f + 1
            ans = (ans + add) % 1000000007
        print(ans)