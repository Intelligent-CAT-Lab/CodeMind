import sys

class FastScanner:
    def __init__(self):
        self._input = sys.stdin.buffer
        self._buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def _has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buflen = 0
            try:
                self.buflen = self._input.readinto(self._buffer)
            except IOError as e:
                print(e, file=sys.stderr)
            if self.buflen <= 0:
                return False
        return True

    def _read_byte(self):
        if self._has_next_byte():
            result = self._buffer[self.ptr]
            self.ptr += 1
            return result
        else:
            return -1

    @staticmethod
    def _is_printable_char(c):
        return 33 <= c <= 126

    def has_next(self):
        while self._has_next_byte() and not self._is_printable_char(self._buffer[self.ptr]):
            self.ptr += 1
        return self._has_next_byte()

    def next(self):
        if not self.has_next():
            raise ValueError("No more input")
        sb = []
        b = self._read_byte()
        while self._is_printable_char(b):
            sb.append(chr(b))
            b = self._read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise ValueError("No more input")
        n = 0
        minus = False
        b = self._read_byte()
        if b == ord('-'):
            minus = True
            b = self._read_byte()
        if b < ord('0') or b > ord('9'):
            raise ValueError("Invalid number")
        while True:
            if ord('0') <= b <= ord('9'):
                n = n * 10 + (b - ord('0'))
            elif b == -1 or not self._is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError("Invalid number")
            b = self._read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError("Number out of range")
        return int(nl)

    def next_double(self):
        return float(self.next())


MOD = 1000000007

def pow_mod(l, i):
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow_mod(l, i // 2)
            return val * val % 2019
        else:
            return pow_mod(l, i - 1) * l % 2019

if __name__ == '__main__':

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