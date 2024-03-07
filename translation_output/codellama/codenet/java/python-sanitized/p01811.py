import sys

class FastScanner:
    def __init__(self, input_stream=sys.stdin):
        self.input_stream = input_stream
        self.buffer = bytearray()
        self.ptr = 0
        self.buffer_length = 0

    def has_next_byte(self):
        if self.ptr < self.buffer_length:
            return True
        else