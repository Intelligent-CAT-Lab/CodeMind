class FastScanner:
    def __init__(self, inp=None):
        if inp is None:
            inp = sys.stdin
        self.inp = inp
        self.buf = []
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.inp.read(self.buf)
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buf[self.ptr++]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c and c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buf[self.ptr]):
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

def p(element):
    print(element)

def solve(str):
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

sc = FastScanner()
str = sc.next()
solve(str)