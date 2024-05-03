Here is the Python version of the provided Java code:

```python
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.cur_char = 0
        self.num_chars = 0
        self.space_char_filter = None

    def read(self):
        if self.num_chars == -1:
            raise ValueError("No more characters to read")
        if self.cur_char >= self.num_chars:
            self.cur_char = 0
            try:
                self.num_chars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError("Error reading from stream")
            if self.num_chars <= 0:
                return -1
        return self.buf[self.cur_char]

    def next_int(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        sgn = 1
        if c == ord('-'):
            sgn = -1
            c = self.read()
        res = 0
        while not self.is_space_char(c):
            if c < ord('0') or c > ord('9'):
                raise ValueError("Invalid integer format")
            res *= 10
            res += c - ord('0')
            c = self.read()
        return res * sgn

    def is_space_char(self, c):
        if self.space_char_filter is not None:
            return self.space_char_filter.is_space_char(c)
        return self.is_whitespace(c)

    @staticmethod
    def is_whitespace(c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

    class SpaceCharFilter:
        def is_space_char(self, ch):
            raise NotImplementedError("Subclasses must implement
