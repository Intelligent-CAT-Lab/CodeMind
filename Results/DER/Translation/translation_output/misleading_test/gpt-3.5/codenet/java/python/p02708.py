```python
import sys

class FastScanner:
    def __init__(self):
        self.input_buffer = sys.stdin.buffer
        self.ptr = 0
        self.buflen = 0
        self.buffer = bytearray(1024)

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.input_buffer.readinto(self.buffer)
            except IOError as e:
                print(e)
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = bytearray()
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
        return sb.decode()

    def next_long(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        if b == 45:
            minus = True
            b = self.read_byte()
        if b < 48 or b > 57:
            raise ValueError
        while True:
            if 48 <= b <= 57:
                n *= 10
                n += b - 48
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise ValueError
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError
        return int(nl)

    def next_double(self):
        return float(self.next())

MOD = 1000000007

class Mas:
    def __init__(self, x, y, step):
        self.x = x
        self.y = y
        self.step = step

def pow(l, i):
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow(l, i // 2)
            return val * val % 2019
        else:
            return pow(l, i - 1) * l % 2019

vX = [1, 0, 0, -1]
vY = [0, 1, -1, 0]

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
```

