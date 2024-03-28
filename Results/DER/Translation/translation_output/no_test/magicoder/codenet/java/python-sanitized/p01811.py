import sys
import re

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buffer = bytearray(sys.stdin.read(1024))
        self.l = 0
        self.r = 0

    def read(self):
        if self.l == self.r:
            self.l = 0
            self.r = self.inp.readinto(