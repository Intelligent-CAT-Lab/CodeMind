Here is the Python equivalent of the Java code:

```python
import sys

class Methods:
    def print(self, *args):
        print(*args)

    def yesno(self, out, b):
        out.write("Yes" if b else "No")
        out.write("\n")

    def YESNO(self, out, b):
        out.write("YES" if b else "NO")
        out.write("\n")

    def max(self, *args):
        return max(args)

    def min(self, *args):
        return min(args)

class FastScanner:
    def __init__(self, stream):
        self.in_ = stream
        self.buffer = bytearray(1024)
        self.length = 0
        self.p = 0

    def has_next_byte(self):
        if self.p < self.length:
            return True
        else:
            self.p = 0
            try:
                self.length = self.in_.readinto(self.buffer)
            except Exception as e:
                e.print_stacktrace()
            if self.length <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte() == True:
            return self.buffer[self.p]
        return -1

    def is_printable(self, n):
        return 33 <= n and n <= 126

    def skip(self):
        while self.has_next_byte() and not self.is_printable(self.buffer[self.p]):
            self.p += 1

    def has_next(self):
        self.skip()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise ValueError("No more elements to read")
        sb = []
        t = self.read_byte()
        while self.is_printable(t):
            sb.append(chr(t))
            t = self.read_byte()
        return ''.join(sb)

    def next_array
