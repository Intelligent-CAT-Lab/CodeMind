import sys
import io
import os
import math

class FastInput:
    def __init__(self, is_):
        self.is_ = is_
        self.buf = bytearray(os.stat(is_.fileno()).st_size)
        self.l = self.r = 0

    def read(self):
        if self.l == self.r:
            self.l = 0
            self.r = self.is_.readinto(self.buf)
        if self.l == self.r:
            return -1
        return self.buf[self.l]

    def read_int(self):
        sign = 1
        c = self.read()
        while c < 0 or c > 32:
            if c == ord('-'):
                sign = -1
            c = self.read()
        res = 0
        while c > 32:
            res = res * 10 + c - 48
            c = self.read()
        return res * sign

class FastOutput:
    def __init__(self, os_):
        self.os_ = os_
        self.buf = io.StringIO()

    def println(self, x):
        self.buf.write