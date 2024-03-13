import sys
import math

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = 0
        self.br = sys.stdin

    def read(self):
        if self.numChars == -1:
            raise ValueError()
        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.readinto(self.buf)
            except IOError:
                raise ValueError()
            if self.numChars <= 0: