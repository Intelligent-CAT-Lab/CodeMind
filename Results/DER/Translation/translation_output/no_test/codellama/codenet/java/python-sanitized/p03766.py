import sys
import io
import array
import math

class FastInput:
    def __init__(self, stream):
        self._stream = stream
        self._buf = bytearray(1 << 13)
        self._buf_len = 0
        self._buf_offset = 0
        self._next = 0

    def read(self):
        while self._buf_len == self._buf_offset:
            self._buf_offset = 0
            try:
                self._buf_len = self._stream.readinto(self._buf)
            except IOError:
                raise RuntimeError(e)
            if self._buf_len == -1:
                return -1
        return self._buf[self._buf_offset++]

    def skip_blank(self):
        while self._next >= 0 and self._next <= 32:
            self._next = self.read()

    def read_int(self):
        sign = 1
        self.skip_blank()
        if self._next == '+' or self._next == '-':
            sign = self._next == '+'
            self._next = self.read()