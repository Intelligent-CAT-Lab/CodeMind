import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buffer = bytearray(sys.stdin.readline())
        self.ptr = 0
        self.buffer_length = len(self.buffer)

    def has_next_byte(self):