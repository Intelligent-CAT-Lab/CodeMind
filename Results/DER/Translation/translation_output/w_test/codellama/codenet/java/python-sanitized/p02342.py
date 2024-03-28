import sys

class FastScanner:
    def __init__(self, input_stream=sys.stdin):
        self.input_stream = input_stream
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.input_stream.readinto(self.buffer)
            except IOError:
                pass
            if self.buflen <= 0:
                return False

    def read_byte(self):
        if self.has