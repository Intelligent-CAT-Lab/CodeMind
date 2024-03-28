import sys

class FastScanner:
    def __init__(self, in_stream = sys.stdin):
        self.in_stream = in_stream
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = self.in_stream.readinto(self.buffer)
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c and c <= 126

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
            raise NumberFormatException
        while True:
            if '0'.encode()[0] <= b and b <= '9'.encode()[0]:
                n *= 10
                n += b - '0'.encode()[0]
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise NumberFormatException
            b = self.read_byte()

    def next_int(self):
        return int(self.next_long())

    def next_double(self):
        return float(self.next())

MOD = 1000000007

def pow(l, i):
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow(l, i // 2)
            return val * val % 2019
        else:
            return pow(l, i - 1) * l % 2019

def main():
    fs = FastScanner()
    n = fs.next_int()
    k = fs.next_int()
    ans = 0
    for i in range(k, n + 2):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % MOD
    print(ans)

if __name__ == "__main__":
    main()