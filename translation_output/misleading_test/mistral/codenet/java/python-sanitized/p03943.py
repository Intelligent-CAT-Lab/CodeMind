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
            except IOError:
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
            raise NoSuchElementError()
        sb = StringBuilder()
        b = read_byte()
        while is_printable_char(b):
            sb.append(chr(b))
            b = read_byte()
        return sb.str()

    def next_long():
        if not has_next():
            raise NoSuchElementError()
        n = 0
        minus = False
        b = read_byte()
        if b == '-':
            minus = True
            b = read_byte()
        if b < '0' or '9' < b:
            raise ValueError()
        while True:
            if '0' <= b and b <= '9':
                n *= 10
                n += b - '0'
            elif b == -1 or not is_printable_char(b):
                return minus * n if minus else n
            else:
                raise ValueError()
        return next_long()

    def next_int():
        return next_long() // 10

    def next_double():
        return float(next())

if __name__ == '__main__':
    a = int(input())
    b = int(input())
    c = int(input())

    i = (a + b == c)
    j = (a + c == b)
    k = (b + c == a)

    if i or j or k:
        print("Yes")
    else:
        print("No")