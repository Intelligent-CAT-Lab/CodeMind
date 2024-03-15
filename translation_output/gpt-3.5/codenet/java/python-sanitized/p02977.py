import io
import sys
import math


class BasicScanner:
    def __init__(self, in_stream):
        self.in_stream = in_stream
        self.buf = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        self.ptr = 0
        try:
            self.buflen = self.in_stream.readinto(self.buf)
        except IOError as e:
            e.printStackTrace()
        return self.buflen > 0

    def read_byte(self):
        return self.buf[self.ptr] if self.has_next_byte() else -1

    def has_next(self):
        while self.has_next_byte() and not (33 <= self.buf[self.ptr] <= 126):
            self.ptr += 1
        return self.has_next_byte()

    def next_sequence(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = bytearray()
        b = self.read_byte()
        while 33 <= b <= 126:
            sb.append(b)
            b = self.read_byte()
        return sb.decode()

    def next_char(self):
        return chr(self.read_byte())

    def next_string(self):
        return self.next_sequence()

    def next_chars(self):
        sb = self.next_sequence()
        l = len(sb)
        dst = [0] * l
        for i in range(l):
            dst[i] = chr(sb[i])
        return dst

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == 45:  # '-'
            minus = True
            b = self.read_byte()
        if b < 48 or b > 57:
            raise ValueError
        while True:
            if 48 <= b <= 57:
                n = n * 10 + (b - 48)
            elif b == -1 or not (33 <= b <= 126):
                return -n if minus else n
            else:
                raise ValueError
            b = self.read_byte()

        return n

    def next_int(self):
        return self.next_long()

    def next_double(self):
        return float(self.next_string())


class Out:
    def __init__(self, out_stream):
        self.out_stream = out_stream
        self.buf = bytearray(1024)
        self.ptr = 0
        self.auto_flush_threshold = 1 << 17

    def flush(self):
        try:
            self.out_stream.write(self.buf[:self.ptr])
            self.out_stream.flush()
            self.ptr = 0
        except IOError as e:
            e.printStackTrace()

    def close(self):
        try:
            self.out_stream.close()
        except IOError as e:
            e.printStackTrace()

    def writeln(self, obj=None):
        self.write(obj).write('\n')
        return self

    def write_space(self):
        return self.write(' ')

    def write(self, obj):
        try:
            s = str(obj)
            l = len(s)
            if l > self.auto_flush_threshold:
                self.flush()
                i = 0
                while i + self.auto_flush_threshold < l:
                    self.out_stream.write(s[i:i + self.auto_flush_threshold])
                    self.out_stream.flush()
                    i += self.auto_flush_threshold
                self.ensure_capacity(l - i)
                self.buf[:l - i] = s[i:].encode()
                self.ptr = l - i
            else:
                self.ensure_capacity(self.ptr + l)
                self.buf[self.ptr:self.ptr + l] = s.encode()
                self.ptr += l
        except Exception as e:
            e.printStackTrace()
        return self

    def ensure_capacity(self, cap):
        if cap > self.auto_flush_threshold:
            self.flush()
        if cap >= len(self.buf):
            new_length = len(self.buf)
            while new_length < cap:
                new_length <<= 1
            new_buf = bytearray(new_length)
            new_buf[:len(self.buf)] = self.buf
            self.buf = new_buf

        return self

    def write_char_array(self, char_array):
        l = len(char_array)
        if l > self.auto_flush_threshold:
            self.flush()
            self.ensure_capacity(self.auto_flush_threshold)
            i = 0
            while i + self.auto_flush_threshold < l:
                for j in range(self.auto_flush_threshold):
                    self.buf[self.ptr] = char_array[i + j].encode()
                    self.ptr += 1
                self.flush()
                i += self.auto_flush_threshold
            for j in range(i, l):
                self.buf[self.ptr] = char_array[j].encode()
                self.ptr += 1
        else:
            self.ensure_capacity(self.ptr + l)
            for ch in char_array:
                self.buf[self.ptr] = ch.encode()
                self.ptr += 1
        return self

    def write_char(self, c):
        self.ensure_capacity(self.ptr + 1)
        self.buf[self.ptr] = str(c).encode()
        self.ptr += 1
        return self

    def write_byte(self, b):
        self.ensure_capacity(self.ptr + 1)
        self.buf[self.ptr] = b
        self.ptr += 1
        return self

    def write_int(self, x):
        if x == 0:
            self.ensure_capacity(self.ptr + 1)
            self.buf[self.ptr] = ord('0')
            self.ptr += 1
            return self
        d = string_size(x)
        self.ensure_capacity(self.ptr + d)
        if x < 0:
            self.buf[self.ptr] = ord('-')
            self.ptr += 1
            x = -x
            d -= 1
        j = self.ptr + d
        while x > 0:
            self.buf[j - 1] = ord(str(x % 10))
            x //= 10
            j -= 1
        self.ptr += d
        return self

    def write_long(self, x):
        if x == 0:
            self.ensure_capacity(self.ptr + 1)
            self.buf[self.ptr] = ord('0')
            self.ptr += 1
            return self
        d = string_size(x)
        self.ensure_capacity(self.ptr + d)
        if x < 0:
            self.buf[self.ptr] = ord('-')
            self.ptr += 1
            x = -x
            d -= 1
        j = self.ptr + d
        while x > 0:
            self.buf[j - 1] = ord(str(x % 10))
            x //= 10
            j -= 1
        self.ptr += d
        return self

    def write_double(self, d):
        return self.write(str(d)) 

    def write_iterable(self, iterable):
        for item in iterable:
            self.write(item)

    def string_size(self, x):
        d = 1
        if x >= 0:
            d = 0
            x = -x
        p = -10
        for i in range(1, 19):
            if x > p:
                return i + d
            p *= 10
        return 19 + d


class ExtendedScanner(BasicScanner):
    def ints(self, n, f=None):
        if f is None:
            return [self.next_int() for _ in range(n)]
        else:
            return [f(self.next_int()) for _ in range(n)]

    def int_array(self, n, m, f=None):
        if f is None:
            return [self.ints(m) for _ in range(n)]
        else:
            return [self.ints(m, f) for _ in range(n)]


class BitUtil:
    INT_MASK = [
        0x0000_0000, 0x0000_0001, 0x0000_0003, 0x0000_0007, 0x0000_000f,
        0x0000_001f, 0x0000_003f, 0x0000_007f, 0x0000_00ff, 0x0000_01ff,
        0x0000_03ff, 0x0000_07ff, 0x0000_0fff, 0x0000_1fff, 0x0000_3fff,
        0x0000_7fff, 0x0000_ffff, 0x0001_ffff, 0x0003_ffff, 0x0007_ffff,
        0x000f_ffff, 0x001f_ffff, 0x003f_ffff, 0x007f_ffff, 0x00ff_ffff,
        0x01ff_ffff, 0x03ff_ffff, 0x07ff_ffff, 0x0fff_ffff, 0x1fff_ffff,
        0x3fff_ffff, 0x7fff_ffff, 0xffff_ffff
    ]
    LONG_MASK = [
        0x0000_0000_0000_0000, 0x0000_0000_0000_0001, 0x0000_0000_0000_0003, 0x0000_0000_0000_0007,
        0x0000_0000_0000_000f, 0x0000_0000_0000_001f, 0x0000_0000_0000_003f, 0x0000_0000_0000_007f,
        0x0000_0000_0000_00ff, 0x0000_0000_0000_01ff, 0x0000_0000_0000_03ff, 0x0000_0000_0000_07ff,
        0x0000_0000_0000_0ff, 0x0000_0000_0000_1ff, 0x0000_0000_0000_3ff, 0x0000_0000_0000_7ff,
        0x0000_0000_0000_ffff, 0x0000_0000_0001_ffff, 0x0000_0000_0003_ffff, 0x0000_0000_0007_ffff,
        0x0000_0000_000f_ffff, 0x0000_0000_001f_ffff, 0x0000_0000_003f_ffff, 0x0000_0000_007f_ffff,
        0x0000_0000_00ff_ffff, 0x0000_0000_01ff_ffff, 0x0000_0000_03ff_ffff, 0x0000_0000_07ff_ffff,
        0x0000_0000_0fff_ffff, 0x0000_0000_1fff_ffff, 0x0000_0000_3fff_ffff, 0x0000_0000_7fff_ffff,
        0x0000_0000_ffff_ffff, 0x0000_0001_ffff_ffff, 0x0000_0003_ffff_ffff, 0x0000_0007_ffff_ffff,
        0x0000_000f_ffff_ffff, 0x0000_001f_ffff_ffff, 0x0000_003f_ffff_ffff, 0x0000_007f_ffff_ffff,
        0x0000_00ff_ffff_ffff, 0x0000_01ff_ffff_ffff, 0x0000_03ff_ffff_ffff, 0x0000_07ff_ffff_ffff,
        0x0000_0fff_ffff_ffff, 0x0000_1fff_ffff_ffff, 0x0000_3fff_ffff_ffff, 0x0000_7fff_ffff_ffff,
        0x0000_ffff_ffff_ffff, 0x0001_ffff_ffff_ffff, 0x0003_ffff_ffff_ffff, 0x0007_ffff_ffff_ffff,
        0x000f_ffff_ffff_ffff, 0x001f_ffff_ffff_ffff, 0x003f_ffff_ffff_ffff, 0x007f_ffff_ffff_ffff,
        0x00ff_ffff_ffff_ffff, 0x01ff_ffff_ffff_ffff, 0x03ff_ffff_ffff_ffff, 0x07ff_ffff_ffff_ffff,
        0x0fff_ffff_ffff_ffff, 0x1fff_ffff_ffff_ffff, 0x3fff_ffff_ffff_ffff, 0x7fff_ffff_ffff_ffff,
        0xffff_ffff_ffff_ffff
    ]

    @staticmethod
    def test(n, bit):
        return (n & (1 << bit)) != 0

    @staticmethod
    def get(n, bit):
        return 1 if (n & (1 << bit)) == 0 else 0

    @staticmethod
    def set(n, bit):
        return n | (1 << bit)

    @staticmethod
    def set_range(n, from_bit, to_bit):
        return n | (BitUtil.LONG_MASK[to_bit - from_bit] << from_bit)

    @staticmethod
    def set_bool(n, bit, b):
        return n | (1 << bit) if b else n & ~(1 << bit)

    @staticmethod
    def clear(n, bit):
        return n & ~(1 << bit)

    @staticmethod
    def flip(n, bit):
        return n ^ (1 << bit)


def solve(sc, out):
    n = sc.next_int()
    if (n & -n) == n:
        out.writeln("No")
        return
    out.writeln("Yes")
    if n == 3:
        out.writeln("1 2\n2 3\n3 4\n4 5\n5 6")
        return
    k = BitUtil.bsr(n)
    for i in range(1, (1 << k) - 2 + 1):
        out.write(i).write_space().writeln(i + 1)
    out.write((1 << k) - 1).write_space().writeln(n + 1)
    for i in range(1, (1 << k) - 2 + 1):
        out.write(n + i).write_space().writeln(n + i + 1)
    out.write((1 << k) + 1).write_space().writeln(n + (1 << k))
    out.write(n + (1 << k)).write_space().writeln(n + 1)
    out.write(n + 1).write_space().writeln(n + (1 << k) + 1)
    out.write(n + (1 << k) + 1).write_space().writeln(1 << k)
    for j in range(2, n - (1 << k) + 1):
        out.write(n + j).write_space().writeln(n + (1 << k) + j)
        out.write(n + (1 << k) + j - 1).write_space().writeln((1 << k) + j)


def main():
    f = io.BytesIO()
    execute(sys.stdin.buffer, f)


def execute(in_stream, out_stream):
    s = ExtendedScanner(in_stream)
    o = Out(out_stream)
    solve(s, o)
    o.flush()
    o.close()


if __name__ == '__main__':
    main()