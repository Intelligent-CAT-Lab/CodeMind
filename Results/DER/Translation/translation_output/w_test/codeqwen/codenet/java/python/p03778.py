Here is the Python equivalent of the Java code:

```python
class FastScanner:
    def __init__(self):
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def read_byte(self):
        if self.ptr < self.buflen:
            return self.buffer[self.ptr]
        else:
            self.ptr = 0
            try:
                self.buflen = self.in.readinto(self.buffer)
            except IOError as e:
                print(e)
                return -1
            if self.buflen <= 0:
                return -1
        return self.buffer[self.ptr]

    def has_next_byte(self):
        return self.ptr < self.buflen

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementError()
        sb = ""
        b = self.read_byte()
        while self.is_printable_char(b):
            sb += chr(b)
            b = self.read_byte()
        return sb

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementError()
        n = 0
        minus = False
        b = self.read_byte()
        if b == ord('-'):
            minus = True
            b = self.read_byte()
        if not (b >= ord('0') and b <= ord('9')):
            raise ValueError()
        while True:
            if b >= ord('0') and b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_
