Here is the Python equivalent of the Java code you provided:

```python
import sys

class TaskA:
    def solve(self, testNumber, inp, out):
        s = inp.readString()
        c_index = s.find('C')
        f_index = s.rfind('F')
        if c_index < 0 or f_index < 0 or f_index < c_index:
            out.println("No")
        else:
            out.println("Yes")

class FastInput:
    def __init__(self, inp):
        self.inp = inp
        self.buf = bytearray(1 << 13)
        self.buf_len = 0
        self.buf_offset = 0
        self.next = -1

    def read(self):
        while self.buf_offset == self.buf_len:
            self.buf_offset = 0
            try:
                self.buf_len = self.inp.readinto(self.buf)
            except IOError as e:
                raise RuntimeError(e)
            if self.buf_len == 0:
                return -1
        return self.buf[self.buf_offset]

    def skip_blank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def read_string(self, builder):
        self.skip_blank()

        while self.next > 32:
            builder.append(chr(self.next))
            self.next = self.read()

        return builder.decode()

    def read_string(self):
        return self.read_string(bytearray())

class FastOutput:
    def __init__(self, out):
        self.out = out
        self.cache = bytearray()

    def println(self, c):
        self.cache.extend(c.encode())
        self.cache.append(b'\n')
        return self

    def flush(self):
        try:
            self.out.write(self.cache)
            self.cache = bytearray()
        except
