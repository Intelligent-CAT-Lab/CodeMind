Here is the Python version of the provided Java code:

```python
import sys
import heapq
import bisect

class LightScanner2:
    def __init__(self, stream):
        self.stream = stream
        self.builder = []
        self.buf = bytearray(1024 * 1024)
        self.ptr = 0
        self.len = 0

    def read(self):
        if self.ptr < self.len:
            return self.buf[self.ptr]
        try:
            self.ptr = 0
            self.len = self.stream.readinto(self.buf)
        except IOError:
            raise EOFError("EOF")
        if self.len == 0:
            raise EOFError("EOF")
        return self.buf[self.ptr]

    def skip(self):
        b = self.read()
        while b < 33 or 126 < b:
            b = self.read()
        if b == -1:
            raise EOFError("EOF")
        self.ptr -= 1

    def load_token(self):
        self.builder = []
        self.skip()
        b = self.read()
        while not (b < 33 or 126 < b):
            self.builder.append(b)
            b = self.read()

    def chars(self):
        self.load_token()
        return bytes(self.builder).decode('utf-8')

    def close(self):
        try:
            self.stream.close()
        except IOError:
            raise EOFError("EOF")

class LightWriter2:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024 * 1024)
        self.ptr = 0
        self.autoflush = False
        self.breaked = True

    def allocate(self, n):
        if self.ptr + n <= len(self.buf):
            return
        try:
            self.stream.write(self.buf[:self.ptr])
            self.ptr = 0
        except IOError:

