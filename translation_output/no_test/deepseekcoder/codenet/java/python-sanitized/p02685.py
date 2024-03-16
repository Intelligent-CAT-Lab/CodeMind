import sys
from io import StringIO
from math import *
from collections import *

class InputReader(object):
    def __init__(self, stream):
        self.stream = stream
        self.buf = StringIO()
        self.curChar = ''

    def read(self):
        if not self.curChar:
            self.curChar = self.stream.read(1)
        return self.curChar

    def next(self):
        return self.read()

    def next_line(self):
        line = ''
        while self.curChar != '\n':
            line += self.curChar
            self.curChar = self.stream