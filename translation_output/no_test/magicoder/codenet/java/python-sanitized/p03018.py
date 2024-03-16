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
                self.buflen = self.inp.readinto(self.buffer)
            except EOFError:
                self.buflen = 0
            return self.buflen > 0

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def next(self):
        while self.has_next and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
            self.has_next = self.update()
        if not self.has_next:
            raise StopIteration
        s = []
        b = self.read_byte()
        while True:
            if self.is_printable_char(b):
                s.append(chr(b))
                b = self.read_byte()
            else:
                return "".join(s)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def update(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()


def p(element):
    print(element)


def pp(element):
    print(element, end="")


def min(a, b, c):
    return min(a, min(b, c))


def max(a, b, c):
    return max(a, max(b, c))


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