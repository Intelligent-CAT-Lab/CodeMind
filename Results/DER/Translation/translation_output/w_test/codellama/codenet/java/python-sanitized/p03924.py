import sys

class FS:
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
                pass
            if self.buflen <= 0:
                return False

    def read_byte(self):
        return self.has_next_byte() and self.buffer[self.ptr]

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return "".join(sb)

    def next_int(self):
        return int(self.next_long())

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == "-":
            minus = True
            b = self.read_byte()
        if b < "0" or "9" < b:
            raise NumberFormatException()
        while True:
            if "0" <= b and b <= "9":
                n *= 10
                n += ord(b) - ord("0")
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.read_byte()

def main():
    r = FS()
    N = r.next_int()
    M = r.next_int()
    MOD = 1000000007
    # dp[days][added town][looped size]
    dp = [[[0] * (N + 1) for _ in range(N + 1)] for _ in range(M + 1)]
    dp[0][1][1] = 1
    for i in range(M):
        for j in range(N + 1):
            for k in range(N + 1):
                # add town unused
                if j != N:
                    dp[i + 1][j + 1][k] += (dp[